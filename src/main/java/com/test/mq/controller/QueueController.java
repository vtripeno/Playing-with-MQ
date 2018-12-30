package com.test.mq.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.mq.config.JmsMQConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.jms.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class QueueController {

    @Autowired
    JmsTemplate jmsTemplate;
    @Value("${mq.userid}")
    private String userid;
    @Value("${mq.password}")
    private String password;

    @Autowired
    JmsMQConnector jmsMQConnector;

    @Autowired
    RestTemplate restTemplate;

    private static final String JMSMESSAGEID_STD_PREFIX = "ID:";
    private static final int JMSMESSAGEID_STD_PREFIX_START = JMSMESSAGEID_STD_PREFIX.length();

    @RequestMapping(value = "/queue", method = RequestMethod.POST)
    public void postMessage(String mensagem) throws JsonProcessingException, JMSException {
        String queueName = "UTILS.API_CALLBACK.IN";
        String tradeString = new ObjectMapper().writeValueAsString(mensagem);
        jmsTemplate.setConnectionFactory(jmsMQConnector.wmq());
//        jmsTemplate.getConnectionFactory().createConnection(userid, password);
        jmsTemplate.getConnectionFactory().createConnection();
        for(int i = 0; i < 70; i++) {
            jmsTemplate.convertAndSend(queueName, tradeString);
        }

    }

    @RequestMapping(value = "/readqueue", method = RequestMethod.GET)
    public List<String> readtMessage() throws JsonProcessingException, JMSException {
        String queueName = "INTEGRATOR.CALLBACK.DLQ";
        jmsTemplate.setConnectionFactory(jmsMQConnector.wmq());
//        jmsTemplate.getConnectionFactory().createConnection(userid, password);
        Connection connection = jmsTemplate.getConnectionFactory().createConnection();
        connection.start();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue(queueName);
        QueueBrowser browser = session.createBrowser(queue);
        Enumeration msgs = browser.getEnumeration();

        /*ObjectMessage objMessage = (ObjectMessage) browser.getEnumeration().nextElement();
        //drain message before triggering deserialization
        MessageConsumer consumer = session.createConsumer(queue);
        consumer.receive(5000);
        Object result = objMessage.getObject();*/

        List<String> objects = new ArrayList<>();

        while (msgs.hasMoreElements()) {
//            System.out.println(msgs.nextElement());
            objects.add(msgs.nextElement().toString());
        }

//        objects.stream().forEach(o -> o.replaceAll("\\n", ""));
        objects = objects.stream().filter(o -> o.contains("\"TICKETID\":\"ID-SAOD1DTGBY02-1539183170571-0-12\""))
                .collect(Collectors.toList());


        return objects;
    }

    @RequestMapping(value = "/testeGet", method = RequestMethod.GET)
    public void getTest(@RequestParam("quantidade") final String quantidade) {
        String uri = "http://localhost:8080/credits/v1/credit_profile?institutional_code=1019871&portfolio_code=999999";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        headers.set("X-Channel", "bpm");
        headers.set("X-User", "userteste");
        headers.set("X-timestamp", "2017-10-01T00:00:00.000");

        HttpEntity<?> entity = new HttpEntity<>(headers);
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        for(int i = 0; i < Integer.valueOf(quantidade); i++) {
            restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
        }

    }

    @RequestMapping(value = "/testeGetParalelo", method = RequestMethod.GET)
    public void getTestParalelo(@RequestParam("quantidade") final String quantidade) {
        String uri = "http://localhost:8080/credits/v1/credit_profile?institutional_code=1019871&portfolio_code=999999";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        headers.set("X-Channel", "bpm");
        headers.set("X-User", "userteste");
        headers.set("X-timestamp", "2017-10-01T00:00:00.000");

        HttpEntity<?> entity = new HttpEntity<>(headers);
        List<RestTemplate> template = new ArrayList<>();
//        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
//        restTemplate.put(uri, HttpMethod.GET, entity, String.class);
        for(int i = 0; i < Integer.valueOf(quantidade); i++) {
            RestTemplate restTemplate1 = new RestTemplate();
            restTemplate1.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            template.add(restTemplate1);
        }
        template.parallelStream().forEach(r -> r.exchange(uri, HttpMethod.GET, entity, String.class));

    }



    @RequestMapping(value = "/consumequeue", method = RequestMethod.GET)
    public String sendMessage() throws JMSException {
        String queueName = "UTILS.API_CALLBACK.DLQ";
        jmsTemplate.setConnectionFactory(jmsMQConnector.wmq());
//        jmsTemplate.getConnectionFactory().createConnection(userid, password);
        Connection connection = jmsTemplate.getConnectionFactory().createConnection();
        connection.start();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue(queueName);
        QueueBrowser browser = session.createBrowser(queue);


        String message = getMessage(browser, "ID-SAOD1DTGBY02-1539183170571-0-3");

        String[] messages = message.split("\\n");

        for(String msg : messages) {
            if(msg.contains("JMSMessageID")) {
                message = msg;
                break;
            }
        }

//        message = message.substring(message.lastIndexOf("ID:") + 3).trim();
//        message = message.substring(message.lastIndexOf("JMSMessageID:") + 13).trim();

        StringBuilder query = new StringBuilder("JMSMessageID = '")
                .append(message.substring(message.lastIndexOf("JMSMessageID:") + 13).trim())
                .append("'");

        consumeMessage(jmsTemplate,
                "UTILS.API_CALLBACK.DLQ",
                "UTILS.API_CALLBACK.IN",
                query.toString());

        return message;
    }

    private String getMessage(QueueBrowser browser, String ticketId) throws JMSException {
        Enumeration msgs = browser.getEnumeration();

        String message = "";

        while (msgs.hasMoreElements()) {

            TextMessage textMessage = (TextMessage) msgs.nextElement();
            if(textMessage.getStringProperty("X_HYPHEN_TicketId").equals(ticketId)) {
                message = textMessage.toString();
                break;
            }

//            objects.add(msgs.nextElement().toString());
        }

        /*objects = objects.stream().filter(o -> o.contains("\"TICKETID\":\"" + ticketId +"\""))
                .collect(Collectors.toList());*/

        return message;
    }

    private void consumeMessage(JmsTemplate jmsTemplate, String queueNameConsume, String queueNameSend, String query) {

        Message msg = jmsTemplate.execute(session -> {
            final MessageConsumer consumer = session.createConsumer(session.createQueue(queueNameConsume), query);
//                List<Message> messages = new ArrayList<>();
            Message message;
            message = consumer.receive(30000);
            return message;
//                while ((message = consumer.receiveNoWait()) != null) {
//                    messages.add(message);
//                }
//                return messages;
        }, true);

        System.out.println(msg);

        jmsTemplate.convertAndSend(queueNameSend, msg);

    }
}
