import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.lang.reflect.Method;

public class Teste {

    @Test
    public void teste() throws JSONException {
        String json = "[\n" +
                "    {\n" +
                "        \"Codigo\": 65,\n" +
                "        \"Nome\": \"SOYBEAN FARMING\",\n" +
                "        \"CodigoExterno\": 111110,\n" +
                "        \"CodigoSIC\": \"116\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"29\",\n" +
                "            \"Nome\": \"Soy\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 66,\n" +
                "        \"Nome\": \"OTHER CHEMICAL AND FERTILIZER MINERAL MINING\",\n" +
                "        \"CodigoExterno\": 212393,\n" +
                "        \"CodigoSIC\": \"1479\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"14\",\n" +
                "            \"Nome\": \"Fertilizers\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 67,\n" +
                "        \"Nome\": \"MEAT PRODUCTS MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 2010,\n" +
                "        \"CodigoSIC\": \"2010\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"2\",\n" +
                "            \"Nome\": \"Beef\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 68,\n" +
                "        \"Nome\": \"POULTRY SLAUGHTERING & PROCESSING\",\n" +
                "        \"CodigoExterno\": 2016,\n" +
                "        \"CodigoSIC\": \"2016\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"24\",\n" +
                "            \"Nome\": \"Poultry\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 69,\n" +
                "        \"Nome\": \"FROZEN FRUIT, JUICE, AND VEGETABLE MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 311411,\n" +
                "        \"CodigoSIC\": \"2037\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 70,\n" +
                "        \"Nome\": \"SUGARCANE MILLS\",\n" +
                "        \"CodigoExterno\": 311311,\n" +
                "        \"CodigoSIC\": \"2061\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"30\",\n" +
                "            \"Nome\": \"Sugar\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 71,\n" +
                "        \"Nome\": \"CANE SUGAR REFINING\",\n" +
                "        \"CodigoExterno\": 311312,\n" +
                "        \"CodigoSIC\": \"2062\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"30\",\n" +
                "            \"Nome\": \"Sugar\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 72,\n" +
                "        \"Nome\": \"FATS AND OILS REFINING AND BLENDING\",\n" +
                "        \"CodigoExterno\": 311225,\n" +
                "        \"CodigoSIC\": \"2075\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 73,\n" +
                "        \"Nome\": \"BREWERIES\",\n" +
                "        \"CodigoExterno\": 312120,\n" +
                "        \"CodigoSIC\": \"2082\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 74,\n" +
                "        \"Nome\": \"TEXTILE MILL PRODUCTS MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 2200,\n" +
                "        \"CodigoSIC\": \"2200\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 75,\n" +
                "        \"Nome\": \"SURGICAL APPLIANCE AND SUPPLIES MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 339113,\n" +
                "        \"CodigoSIC\": \"2499\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 76,\n" +
                "        \"Nome\": \"PAPER AND ALLIED PRODUCTS MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 2600,\n" +
                "        \"CodigoSIC\": \"2600\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"25\",\n" +
                "            \"Nome\": \"Pulp & Paper\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 77,\n" +
                "        \"Nome\": \"CHEMICALS AND ALLIED PRODUCTS MFRS.\",\n" +
                "        \"CodigoExterno\": 2800,\n" +
                "        \"CodigoSIC\": \"2800\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"6\",\n" +
                "            \"Nome\": \"Chemical\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 78,\n" +
                "        \"Nome\": \"FERTILIZER (MIXING ONLY) MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 325314,\n" +
                "        \"CodigoSIC\": \"2875\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"14\",\n" +
                "            \"Nome\": \"Fertilizers\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 79,\n" +
                "        \"Nome\": \"TRANSPORTATION SERVICES\",\n" +
                "        \"CodigoExterno\": 4700,\n" +
                "        \"CodigoSIC\": \"4700\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 80,\n" +
                "        \"Nome\": \"CELLULAR AND OTHER WIRELESS TELECOMMUNICATIONS\",\n" +
                "        \"CodigoExterno\": 517212,\n" +
                "        \"CodigoSIC\": \"4812\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"31\",\n" +
                "            \"Nome\": \"Telecom\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 81,\n" +
                "        \"Nome\": \"WHOLESALE TRADE AGENTS AND BROKERS\",\n" +
                "        \"CodigoExterno\": 425120,\n" +
                "        \"CodigoSIC\": \"5153\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 82,\n" +
                "        \"Nome\": \"ALL OTHER GENERAL MERCHANDISE STORES\",\n" +
                "        \"CodigoExterno\": 452990,\n" +
                "        \"CodigoSIC\": \"5399\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 83,\n" +
                "        \"Nome\": \"COMMODITY CONTRACTS BROKERAGE\",\n" +
                "        \"CodigoExterno\": 523140,\n" +
                "        \"CodigoSIC\": \"6221\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 84,\n" +
                "        \"Nome\": \"COTTON GINNING\",\n" +
                "        \"CodigoExterno\": 115111,\n" +
                "        \"CodigoSIC\": \"0724\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"11\",\n" +
                "            \"Nome\": \"Cotton\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 85,\n" +
                "        \"Nome\": \"FORESTRY\",\n" +
                "        \"CodigoExterno\": 800,\n" +
                "        \"CodigoSIC\": \"0800\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"17\",\n" +
                "            \"Nome\": \"Forestry\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 86,\n" +
                "        \"Nome\": \"SIC 9999\",\n" +
                "        \"CodigoExterno\": 9999,\n" +
                "        \"CodigoSIC\": \"9999\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 88,\n" +
                "        \"Nome\": \"ALL OTHER GRAIN FARMING\",\n" +
                "        \"CodigoExterno\": 111199,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 89,\n" +
                "        \"Nome\": \"NURSERY AND TREE PRODUCTION\",\n" +
                "        \"CodigoExterno\": 111421,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 90,\n" +
                "        \"Nome\": \"COTTON FARMING\",\n" +
                "        \"CodigoExterno\": 111920,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"11\",\n" +
                "            \"Nome\": \"Cotton\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 91,\n" +
                "        \"Nome\": \"BEEF CATTLE RANCHING AND FARMING\",\n" +
                "        \"CodigoExterno\": 112111,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"2\",\n" +
                "            \"Nome\": \"Beef\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 93,\n" +
                "        \"Nome\": \"SOYBEAN PROCESSING\",\n" +
                "        \"CodigoExterno\": 311222,\n" +
                "        \"CodigoSIC\": \"2075\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"29\",\n" +
                "            \"Nome\": \"Soy\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 96,\n" +
                "        \"Nome\": \"ANIMAL (EXCEPT POULTRY) SLAUGHTERING\",\n" +
                "        \"CodigoExterno\": 311611,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"2\",\n" +
                "            \"Nome\": \"Beef\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 97,\n" +
                "        \"Nome\": \"POULTRY PROCESSING\",\n" +
                "        \"CodigoExterno\": 311615,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"24\",\n" +
                "            \"Nome\": \"Poultry\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 99,\n" +
                "        \"Nome\": \"TEXTILE AND FABRIC FINISHING (EXCEPT BROADWOVEN FA\",\n" +
                "        \"CodigoExterno\": 313312,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 101,\n" +
                "        \"Nome\": \"PLASTICS MATERIAL AND RESIN MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 325211,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 103,\n" +
                "        \"Nome\": \"INDUSTRIAL AND PERSONAL SERVICE PAPER MERCHANT WHO\",\n" +
                "        \"CodigoExterno\": 424130,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"25\",\n" +
                "            \"Nome\": \"Pulp & Paper\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 105,\n" +
                "        \"Nome\": \"ALL OTHER MISCELLANEOUS STORE RETAILERS (EXCEPT TO\",\n" +
                "        \"CodigoExterno\": 453998,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 106,\n" +
                "        \"Nome\": \"MEDICAL LABORATORIES\",\n" +
                "        \"CodigoExterno\": 621511,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 107,\n" +
                "        \"Nome\": \"COFFEE AND TEA MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 311920,\n" +
                "        \"CodigoSIC\": \"2095\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"8\",\n" +
                "            \"Nome\": \"Coffee\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 108,\n" +
                "        \"Nome\": \"COMMODITY CONTRACTS DEALING\",\n" +
                "        \"CodigoExterno\": 523130,\n" +
                "        \"CodigoSIC\": \"6221\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 109,\n" +
                "        \"Nome\": \"TELECOMMUNICATIONS RESELLERS\",\n" +
                "        \"CodigoExterno\": 517310,\n" +
                "        \"CodigoSIC\": \"4812\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"31\",\n" +
                "            \"Nome\": \"Telecom\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 110,\n" +
                "        \"Nome\": \"PAGING\",\n" +
                "        \"CodigoExterno\": 517211,\n" +
                "        \"CodigoSIC\": \"4812\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 111,\n" +
                "        \"Nome\": \"WAREHOUSE CLUBS AND SUPERCENTERS\",\n" +
                "        \"CodigoExterno\": 452910,\n" +
                "        \"CodigoSIC\": \"5399\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 112,\n" +
                "        \"Nome\": \"NURSERIES, GARDEN CENTERS, AND FARM SUPPLY STORES\",\n" +
                "        \"CodigoExterno\": 444220,\n" +
                "        \"CodigoSIC\": \"5153\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"26\",\n" +
                "            \"Nome\": \"Retail\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 113,\n" +
                "        \"Nome\": \"BUSINESS TO BUSINESS ELECTRONIC MARKETS\",\n" +
                "        \"CodigoExterno\": 425110,\n" +
                "        \"CodigoSIC\": \"5153\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 114,\n" +
                "        \"Nome\": \"GRAIN AND FIELD BEAN MERCHANT WHOLESALERS\",\n" +
                "        \"CodigoExterno\": 424510,\n" +
                "        \"CodigoSIC\": \"5153\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"1\",\n" +
                "            \"Nome\": \"Bean\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 115,\n" +
                "        \"Nome\": \"ALL OTHER MISCELLANEOUS MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 339999,\n" +
                "        \"CodigoSIC\": \"2499\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 116,\n" +
                "        \"Nome\": \"HOUSEHOLD FURNITURE (EXCEPT WOOD AND METAL) MANUFA\",\n" +
                "        \"CodigoExterno\": 337125,\n" +
                "        \"CodigoSIC\": \"2499\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 117,\n" +
                "        \"Nome\": \"AIR-CONDITIONING AND WARM AIR HEATING EQUIPMENT AN\",\n" +
                "        \"CodigoExterno\": 333415,\n" +
                "        \"CodigoSIC\": \"2499\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 118,\n" +
                "        \"Nome\": \"ALL OTHER MISCELLANEOUS WOOD PRODUCT MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 321999,\n" +
                "        \"CodigoSIC\": \"2499\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"25\",\n" +
                "            \"Nome\": \"Pulp & Paper\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 119,\n" +
                "        \"Nome\": \"WOOD CONTAINER AND PALLET MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 321920,\n" +
                "        \"CodigoSIC\": \"2499\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"25\",\n" +
                "            \"Nome\": \"Pulp & Paper\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 120,\n" +
                "        \"Nome\": \"SPICE AND EXTRACT MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 311942,\n" +
                "        \"CodigoSIC\": \"2082\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 121,\n" +
                "        \"Nome\": \"GRAIN TRADERS\",\n" +
                "        \"CodigoExterno\": 5153,\n" +
                "        \"CodigoSIC\": \"5153\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 122,\n" +
                "        \"Nome\": \"SOYBEAN AND OTHER OILSEED PROCESSING\",\n" +
                "        \"CodigoExterno\": 2075,\n" +
                "        \"CodigoSIC\": \"2075\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"29\",\n" +
                "            \"Nome\": \"Soy\"\n" +
                "        },\n" +
                "        \"DataAtualizacao\": \"2014-06-17T12:13:40\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 123,\n" +
                "        \"Nome\": \"MFRS FERTILIZERS, MIXING ONLY\",\n" +
                "        \"CodigoExterno\": 2875,\n" +
                "        \"CodigoSIC\": \"2875\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"14\",\n" +
                "            \"Nome\": \"Fertilizers\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 124,\n" +
                "        \"Nome\": \"SIC 2011\",\n" +
                "        \"CodigoExterno\": 2011,\n" +
                "        \"CodigoSIC\": \"2011\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 125,\n" +
                "        \"Nome\": \"CANE SUGAR REFINING\",\n" +
                "        \"CodigoExterno\": 2062,\n" +
                "        \"CodigoSIC\": \"2062\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"30\",\n" +
                "            \"Nome\": \"Sugar\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 126,\n" +
                "        \"Nome\": \"RICE MILLING\",\n" +
                "        \"CodigoExterno\": 2044,\n" +
                "        \"CodigoSIC\": \"2044\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"27\",\n" +
                "            \"Nome\": \"Rice\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 127,\n" +
                "        \"Nome\": \"SUGARCANE FARMING\",\n" +
                "        \"CodigoExterno\": 111930,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"30\",\n" +
                "            \"Nome\": \"Sugar\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 128,\n" +
                "        \"Nome\": \"CHOCOLATE AND CONFECTIONERY MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 311320,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"7\",\n" +
                "            \"Nome\": \"Chocolate\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 129,\n" +
                "        \"Nome\": \"RICE MILLING\",\n" +
                "        \"CodigoExterno\": 311212,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"27\",\n" +
                "            \"Nome\": \"Rice\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 130,\n" +
                "        \"Nome\": \"CORN FARMING\",\n" +
                "        \"CodigoExterno\": 111150,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"10\",\n" +
                "            \"Nome\": \"Corn\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 131,\n" +
                "        \"Nome\": \"PULP MILLS\",\n" +
                "        \"CodigoExterno\": 322110,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"25\",\n" +
                "            \"Nome\": \"Pulp & Paper\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 132,\n" +
                "        \"Nome\": \"WIRED TELECOMMUNICATIONS CARRIERS\",\n" +
                "        \"CodigoExterno\": 517110,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 133,\n" +
                "        \"Nome\": \"PHOSPHATIC FERTILIZER MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 325312,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"14\",\n" +
                "            \"Nome\": \"Fertilizers\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 134,\n" +
                "        \"Nome\": \"RECONSTITUTED WOOD PRODUCT MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 321219,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"25\",\n" +
                "            \"Nome\": \"Pulp & Paper\"\n" +
                "        },\n" +
                "        \"DataAtualizacao\": \"2014-06-17T11:32:37\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 135,\n" +
                "        \"Nome\": \"POULTRY HATCHERIES\",\n" +
                "        \"CodigoExterno\": 112340,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"24\",\n" +
                "            \"Nome\": \"Poultry\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 136,\n" +
                "        \"Nome\": \"PAPER (EXCEPT NEWSPRINTING) MILLS\",\n" +
                "        \"CodigoExterno\": 322121,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"25\",\n" +
                "            \"Nome\": \"Pulp & Paper\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 137,\n" +
                "        \"Nome\": \"PORT AND HARBOR OPERATIONS\",\n" +
                "        \"CodigoExterno\": 488310,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 138,\n" +
                "        \"Nome\": \"TOBACCO STEMMING AND REDRYING\",\n" +
                "        \"CodigoExterno\": 312210,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 139,\n" +
                "        \"Nome\": \"SANITARY PAPER PRODUCT MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 322291,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"25\",\n" +
                "            \"Nome\": \"Pulp & Paper\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 140,\n" +
                "        \"Nome\": \"HOG AND PIG FARMING\",\n" +
                "        \"CodigoExterno\": 112210,\n" +
                "        \"CodigoSIC\": \"0213\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"22\",\n" +
                "            \"Nome\": \"Pig\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 141,\n" +
                "        \"Nome\": \"ORANGE GROVES\",\n" +
                "        \"CodigoExterno\": 111310,\n" +
                "        \"CodigoSIC\": \"0174\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"21\",\n" +
                "            \"Nome\": \"Orange\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 142,\n" +
                "        \"Nome\": \"OTHER VEGETABLE (EXCEPT POTATO) AND MELON\",\n" +
                "        \"CodigoExterno\": 111219,\n" +
                "        \"CodigoSIC\": \"0161\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 143,\n" +
                "        \"Nome\": \"DRY PEA AND BEAN FARMING\",\n" +
                "        \"CodigoExterno\": 111130,\n" +
                "        \"CodigoSIC\": \"0119\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"1\",\n" +
                "            \"Nome\": \"Bean\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 144,\n" +
                "        \"Nome\": \"POTATO FARMING\",\n" +
                "        \"CodigoExterno\": 111211,\n" +
                "        \"CodigoSIC\": \"0134\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"23\",\n" +
                "            \"Nome\": \"Potato\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 145,\n" +
                "        \"Nome\": \"CHICKEN EGG PRODUCTION\",\n" +
                "        \"CodigoExterno\": 112310,\n" +
                "        \"CodigoSIC\": \"0252\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"12\",\n" +
                "            \"Nome\": \"Eggs\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 146,\n" +
                "        \"Nome\": \"FLUID MILK MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 311511,\n" +
                "        \"CodigoSIC\": \"2026\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"20\",\n" +
                "            \"Nome\": \"Milk\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 147,\n" +
                "        \"Nome\": \"SUPPORT ACTIVITIES FOR FORESTRY\",\n" +
                "        \"CodigoExterno\": 115310,\n" +
                "        \"CodigoSIC\": \"0851\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"17\",\n" +
                "            \"Nome\": \"Forestry\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 148,\n" +
                "        \"Nome\": \"OTHER NONCITRUS FRUIT FARMING\",\n" +
                "        \"CodigoExterno\": 111339,\n" +
                "        \"CodigoSIC\": \"0179\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"8\",\n" +
                "            \"Nome\": \"Coffee\"\n" +
                "        },\n" +
                "        \"DataAtualizacao\": \"2014-07-30T10:18:23\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 149,\n" +
                "        \"Nome\": \"ALL OTHER MISCELLANEOUS CROP FARMING\",\n" +
                "        \"CodigoExterno\": 111998,\n" +
                "        \"CodigoSIC\": \"0919\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 150,\n" +
                "        \"Nome\": \"ETHYL ALCOHOL MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 325193,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 151,\n" +
                "        \"Nome\": \"FORESTRY\",\n" +
                "        \"CodigoExterno\": 113110,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"17\",\n" +
                "            \"Nome\": \"Forestry\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 152,\n" +
                "        \"Nome\": \"DAIRY CATTLE AND MILK PRODUCTION\",\n" +
                "        \"CodigoExterno\": 112120,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"2\",\n" +
                "            \"Nome\": \"Beef\"\n" +
                "        },\n" +
                "        \"DataAtualizacao\": \"2014-06-17T11:27:22\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 153,\n" +
                "        \"Nome\": \"FLORICULTURE PRODUCTION\",\n" +
                "        \"CodigoExterno\": 111422,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"15\",\n" +
                "            \"Nome\": \"Flowers\"\n" +
                "        },\n" +
                "        \"DataAtualizacao\": \"2014-06-17T11:26:25\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 154,\n" +
                "        \"Nome\": \"FARM SUPPLIES MERCHANT WHOLESALERS\",\n" +
                "        \"CodigoExterno\": 424910,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"14\",\n" +
                "            \"Nome\": \"Fertilizers\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 155,\n" +
                "        \"Nome\": \"RICE FARMING\",\n" +
                "        \"CodigoExterno\": 111160,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"27\",\n" +
                "            \"Nome\": \"Rice\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 156,\n" +
                "        \"Nome\": \"OTHER ANIMAL FOOD MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 311119,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"16\",\n" +
                "            \"Nome\": \"Food\"\n" +
                "        },\n" +
                "        \"DataAtualizacao\": \"2014-06-17T11:29:40\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 157,\n" +
                "        \"Nome\": \"Other Chemical and Allied Products Merchant Wholesalers\",\n" +
                "        \"CodigoExterno\": 424690,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"6\",\n" +
                "            \"Nome\": \"Chemical\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 158,\n" +
                "        \"Nome\": \"FARM MACHINERY AND EQUIPMENT MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 333111,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"28\",\n" +
                "            \"Nome\": \"Rural Equipment\"\n" +
                "        },\n" +
                "        \"DataAtualizacao\": \"2014-06-17T11:33:50\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 159,\n" +
                "        \"Nome\": \"WHEAT PRODUCTS\",\n" +
                "        \"CodigoExterno\": 311223,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"34\",\n" +
                "            \"Nome\": \"Wheat\"\n" +
                "        },\n" +
                "        \"DataAtualizacao\": \"1900-01-01T00:00:00\",\n" +
                "        \"DataDesativacao\": \"1900-01-01T00:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 160,\n" +
                "        \"Nome\": \"METAL CAN MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 332431,\n" +
                "        \"CodigoSIC\": \"\",\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"19\",\n" +
                "            \"Nome\": \"Metals and Mining\"\n" +
                "        },\n" +
                "        \"DataAtualizacao\": \"1900-01-01T00:00:00\",\n" +
                "        \"DataDesativacao\": \"1900-01-01T00:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 161,\n" +
                "        \"Nome\": \"ALL OTHER MISCELLANEOUS FOOD MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 311999,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"16\",\n" +
                "            \"Nome\": \"Food\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 162,\n" +
                "        \"Nome\": \"PETROLEUM AND PETROLEUM PRODUCT MERCHANT \",\n" +
                "        \"CodigoExterno\": 424720,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 163,\n" +
                "        \"Nome\": \"OILSEED DEVELOPMENT AND FARMING \",\n" +
                "        \"CodigoExterno\": 111120,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 164,\n" +
                "        \"Nome\": \"ANIMAL SLAUGHTERING\",\n" +
                "        \"CodigoExterno\": 311361,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"2\",\n" +
                "            \"Nome\": \"Beef\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 165,\n" +
                "        \"Nome\": \"VETERINARY SERVICES\",\n" +
                "        \"CodigoExterno\": 541940,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"33\",\n" +
                "            \"Nome\": \"Veterinary Products\"\n" +
                "        },\n" +
                "        \"DataAtualizacao\": \"2014-06-17T11:46:23\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 166,\n" +
                "        \"Nome\": \"Pesticide and Other Agricultural Chemical Manufacturing\",\n" +
                "        \"CodigoExterno\": 325320,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"14\",\n" +
                "            \"Nome\": \"Fertilizers\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 167,\n" +
                "        \"Nome\": \"METAL CAN MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 332431,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"19\",\n" +
                "            \"Nome\": \"Metals and Mining\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 168,\n" +
                "        \"Nome\": \"WHEAT PRODUCTS\",\n" +
                "        \"CodigoExterno\": 311223,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"34\",\n" +
                "            \"Nome\": \"Wheat\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 169,\n" +
                "        \"Nome\": \"Citrus (except Orange) Groves\",\n" +
                "        \"CodigoExterno\": 111320,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        },\n" +
                "        \"DataAtualizacao\": \"2014-07-30T10:19:28\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 170,\n" +
                "        \"Nome\": \"REPOLHO\",\n" +
                "        \"CodigoExterno\": 111219,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        },\n" +
                "        \"DataDesativacao\": \"2017-08-07T11:14:34.98\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 171,\n" +
                "        \"Nome\": \"ENGINEERING SERVICES\",\n" +
                "        \"CodigoExterno\": 541330,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 172,\n" +
                "        \"Nome\": \"Process, Physical Distribution, and Logistics Consulting Services\",\n" +
                "        \"CodigoExterno\": 541614,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 173,\n" +
                "        \"Nome\": \"FRUIT AND VEGETABLE CANNING\",\n" +
                "        \"CodigoExterno\": 311421,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 174,\n" +
                "        \"Nome\": \"Supermarkets and Other Grocery (except Convenience) Stores\",\n" +
                "        \"CodigoExterno\": 445110,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"26\",\n" +
                "            \"Nome\": \"Retail\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 175,\n" +
                "        \"Nome\": \"Secondary smelting, refining and alloying of Copper\",\n" +
                "        \"CodigoExterno\": 331423,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 176,\n" +
                "        \"Nome\": \"Developing and producing innovative housing systems for poultry \",\n" +
                "        \"CodigoExterno\": 115210,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 177,\n" +
                "        \"Nome\": \"DRY, CONDENSED, AND EVAPORATED DAIRY PRODUCT MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 311514,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        },\n" +
                "        \"DataAtualizacao\": \"2014-06-17T11:31:27\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 178,\n" +
                "        \"Nome\": \"Securities Brokerage\",\n" +
                "        \"CodigoExterno\": 523120,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 179,\n" +
                "        \"Nome\": \"Portfolio Management\",\n" +
                "        \"CodigoExterno\": 523920,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 180,\n" +
                "        \"Nome\": \"Unclassified\",\n" +
                "        \"CodigoExterno\": 999999,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 181,\n" +
                "        \"Nome\": \"OTHER ACTIVITIES RELATED TO CREDIT INTERMEDIATION\",\n" +
                "        \"CodigoExterno\": 522390,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        },\n" +
                "        \"DataAtualizacao\": \"2014-06-17T11:45:45\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 182,\n" +
                "        \"Nome\": \"Landscape architecturical services\",\n" +
                "        \"CodigoExterno\": 541320,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 183,\n" +
                "        \"Nome\": \"Crude Petroleum and natural gas\",\n" +
                "        \"CodigoExterno\": 211111,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 184,\n" +
                "        \"Nome\": \"All Other Industrial machinery manufacturing\",\n" +
                "        \"CodigoExterno\": 333298,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 185,\n" +
                "        \"Nome\": \"Home Furnishing Merchant wholesalers\",\n" +
                "        \"CodigoExterno\": 423220,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 186,\n" +
                "        \"Nome\": \"Iron Ore Mining\",\n" +
                "        \"CodigoExterno\": 212210,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"19\",\n" +
                "            \"Nome\": \"Metals and Mining\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 187,\n" +
                "        \"Nome\": \"Human Resources Consulting Services\",\n" +
                "        \"CodigoExterno\": 541612,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 188,\n" +
                "        \"Nome\": \"Credit Unions\",\n" +
                "        \"CodigoExterno\": 522130,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 189,\n" +
                "        \"Nome\": \"Retail Bakeries\",\n" +
                "        \"CodigoExterno\": 311811,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"26\",\n" +
                "            \"Nome\": \"Retail\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 193,\n" +
                "        \"Nome\": \"SOYBEAN AND OTHER OILSEED PROCESSING\",\n" +
                "        \"CodigoExterno\": 311224,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"29\",\n" +
                "            \"Nome\": \"Soy\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 194,\n" +
                "        \"Nome\": \"ALL OTHER MISCELLANEOUS TEXTILE PRODUCT MILLS\",\n" +
                "        \"CodigoExterno\": 314999,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 195,\n" +
                "        \"Nome\": \"WHEAT FARMING\",\n" +
                "        \"CodigoExterno\": 111140,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"34\",\n" +
                "            \"Nome\": \"Wheat\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 196,\n" +
                "        \"Nome\": \"CANE SUGAR MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 311314,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"30\",\n" +
                "            \"Nome\": \"Sugar\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 197,\n" +
                "        \"Nome\": \"TOBACCO MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 312230,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 198,\n" +
                "        \"Nome\": \"TEXTILE AND FABRIC FINISHING MILLS\",\n" +
                "        \"CodigoExterno\": 313310,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 199,\n" +
                "        \"Nome\": \"COPPER ROLLING, DRAWING, EXTRUDING, AND ALLOYING \",\n" +
                "        \"CodigoExterno\": 331420,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"19\",\n" +
                "            \"Nome\": \"Metals and Mining\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 200,\n" +
                "        \"Nome\": \"OTHER INDUSTRIAL MACHINERY MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 333249,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 201,\n" +
                "        \"Nome\": \"CHOCOLATE AND CONFECTIONERY MANUFACTURING\",\n" +
                "        \"CodigoExterno\": 311351,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"7\",\n" +
                "            \"Nome\": \"Chocolate\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 202,\n" +
                "        \"Nome\": \"Human Resources Consulting Services\",\n" +
                "        \"CodigoExterno\": 5416,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        },\n" +
                "        \"DataDesativacao\": \"2014-07-21T12:31:19.383\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 203,\n" +
                "        \"Nome\": \"Other Financial Vehicles\",\n" +
                "        \"CodigoExterno\": 525990,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 204,\n" +
                "        \"Nome\": \"Meat and Meat Product  Merchant Wholesalers\",\n" +
                "        \"CodigoExterno\": 424470,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"2\",\n" +
                "            \"Nome\": \"Beef\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 205,\n" +
                "        \"Nome\": \"Other Poultry Production\",\n" +
                "        \"CodigoExterno\": 112390,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"24\",\n" +
                "            \"Nome\": \"Poultry\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 206,\n" +
                "        \"Nome\": \"Deep Sea Freight Transportation\",\n" +
                "        \"CodigoExterno\": 483111,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 207,\n" +
                "        \"Nome\": \"Commercial Banking\",\n" +
                "        \"CodigoExterno\": 522110,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 208,\n" +
                "        \"Nome\": \"Open-End Investment Funds\",\n" +
                "        \"CodigoExterno\": 525910,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 209,\n" +
                "        \"Nome\": \"Other Farm Product R\",\n" +
                "        \"CodigoExterno\": 424590,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"14\",\n" +
                "            \"Nome\": \"Fertilizers\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 210,\n" +
                "        \"Nome\": \"Research and Development in the Physical\",\n" +
                "        \"CodigoExterno\": 541712,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 211,\n" +
                "        \"Nome\": \"ALL OTHER ANIMAL PRODUCTION\",\n" +
                "        \"CodigoExterno\": 112990,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"2\",\n" +
                "            \"Nome\": \"Beef\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 212,\n" +
                "        \"Nome\": \"Other Grocery and Related Products Merchant Wholesalers\",\n" +
                "        \"CodigoExterno\": 42449,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        },\n" +
                "        \"DataDesativacao\": \"2015-10-20T14:56:01.937\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 213,\n" +
                "        \"Nome\": \"Other Grocery and Related Products Merchant Wholesalers\",\n" +
                "        \"CodigoExterno\": 424490,\n" +
                "        \"SetorRisco\": {\n" +
                "            \"Codigo\": \"35\",\n" +
                "            \"Nome\": \"Others\"\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 214,\n" +
                "        \"Nome\": \"All Other Plastics Product Manufacturing\",\n" +
                "        \"CodigoExterno\": 326199\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 215,\n" +
                "        \"Nome\": \"Postharvest Crop Activities (except Cotton Ginning)\",\n" +
                "        \"CodigoExterno\": 115114,\n" +
                "        \"DataAtualizacao\": \"2015-12-08T10:31:29\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 216,\n" +
                "        \"Nome\": \"Soil preparation, Planting, and Cultivating\",\n" +
                "        \"CodigoExterno\": 115112\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 217,\n" +
                "        \"Nome\": \"Testing Laboratories  \",\n" +
                "        \"CodigoExterno\": 541380\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 218,\n" +
                "        \"Nome\": \"Overhead Traveling Crane, Hoist, and Monorail System Manufacturing\",\n" +
                "        \"CodigoExterno\": 333923\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 219,\n" +
                "        \"Nome\": \"Custom Computer Programming Services\",\n" +
                "        \"CodigoExterno\": 541511\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 220,\n" +
                "        \"Nome\": \"Paper Bag and Coated and Treated Paper Manufacturing\",\n" +
                "        \"CodigoExterno\": 322220\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 221,\n" +
                "        \"Nome\": \"Farm and Garden Machinery and Equipment Merchant and Wholesalers\",\n" +
                "        \"CodigoExterno\": 423820\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 222,\n" +
                "        \"Nome\": \"Oilseed and grain\",\n" +
                "        \"CodigoExterno\": 111191\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 223,\n" +
                "        \"Nome\": \"General Freight Trucking\",\n" +
                "        \"CodigoExterno\": 484121\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 224,\n" +
                "        \"Nome\": \"Offices of Other Holding Companies\",\n" +
                "        \"CodigoExterno\": 551112\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 225,\n" +
                "        \"Nome\": \"Grape Vineyards\",\n" +
                "        \"CodigoExterno\": 111332\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 226,\n" +
                "        \"Nome\": \"Blind and Shade Manufacturing\",\n" +
                "        \"CodigoExterno\": 337920\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 227,\n" +
                "        \"Nome\": \"Administrative Management and General Management Consulting Services\",\n" +
                "        \"CodigoExterno\": 541611\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 228,\n" +
                "        \"Nome\": \"Line Haul Railroads\",\n" +
                "        \"CodigoExterno\": 482111\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 229,\n" +
                "        \"Nome\": \"Other Warehousing and Storage\",\n" +
                "        \"CodigoExterno\": 493190\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 230,\n" +
                "        \"Nome\": \"Cattle Feedlots\",\n" +
                "        \"CodigoExterno\": 112112\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 231,\n" +
                "        \"Nome\": \"Packaged frozen food merchant wholesalers\",\n" +
                "        \"CodigoExterno\": 424420\n" +
                "    },\n" +
                "    {\n" +
                "        \"Codigo\": 232,\n" +
                "        \"Nome\": \"Distilleries\",\n" +
                "        \"CodigoExterno\": 312140\n" +
                "    }\n" +
                "]";
        JSONArray jsonArray = new JSONArray(json);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject naics = jsonArray.getJSONObject(i);
            if (naics.has("SetorRisco") && naics.getJSONObject("SetorRisco").has("Codigo") &&
                    !naics.getJSONObject("SetorRisco").getString("Codigo").isEmpty() &&
                    naics.getInt("CodigoExterno") == 312140) {
                System.out.println("OK");
            }
        }
    }

    @Test
    public void user () {
        String user = System.getProperty("user.name");
        System.out.println(user);
        String user2 = new com.sun.security.auth.module.NTSystem().getName();
        System.out.println(user2);
    }

    @Test
    public void usingReflection() throws Exception {
        String osName = System.getProperty( "os.name" ).toLowerCase();
        String className = null;
        String methodName = "getUsername";

        if( osName.contains( "windows" ) ){
            className = "com.sun.security.auth.module.NTSystem";
            methodName = "getName";
        }
        else if( osName.contains( "linux" ) ){
            className = "com.sun.security.auth.module.UnixSystem";
        }
        else if( osName.contains( "solaris" ) || osName.contains( "sunos" ) ){
            className = "com.sun.security.auth.module.SolarisSystem";
        }

        if( className != null ){
            Class<?> c = Class.forName( className );
            Method method = c.getDeclaredMethod( methodName );
            Object o = c.newInstance();
            System.out.println( method.invoke( o ) );
        }
        String user4 = System.getenv().get("USERNAME");
        System.out.println(user4);
    }

}
