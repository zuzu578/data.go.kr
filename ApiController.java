{\rtf1\ansi\ansicpg949\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;\f1\fnil\fcharset0 Menlo-Italic;\f2\fnil\fcharset0 Menlo-BoldItalic;
}
{\colortbl;\red255\green255\blue255;\red204\green108\blue29;\red217\green232\blue247;\red230\green230\blue250;
\red160\green160\blue160;\red18\green144\blue195;\red249\green250\blue244;\red23\green198\blue163;\red128\green242\blue246;
\red177\green102\blue218;\red30\green181\blue64;\red242\green242\blue0;\red167\green236\blue33;\red128\green128\blue128;
\red243\green236\blue121;\red62\green171\blue230;\red121\green171\blue255;\red141\green218\blue248;}
{\*\expandedcolortbl;;\csgenericrgb\c80000\c42353\c11373;\csgenericrgb\c85098\c90980\c96863;\csgenericrgb\c90196\c90196\c98039;
\csgenericrgb\c62745\c62745\c62745;\csgenericrgb\c7059\c56471\c76471;\csgenericrgb\c97647\c98039\c95686;\csgenericrgb\c9020\c77647\c63922;\csgenericrgb\c50196\c94902\c96471;
\csgenericrgb\c69412\c40000\c85490;\csgenericrgb\c11765\c70980\c25098;\csgenericrgb\c94902\c94902\c0;\csgenericrgb\c65490\c92549\c12941;\csgenericrgb\c50196\c50196\c50196;
\csgenericrgb\c95294\c92549\c47451;\csgenericrgb\c24314\c67059\c90196;\csgenericrgb\c47451\c67059\c100000;\csgenericrgb\c55294\c85490\c97255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 package\cf3  com\cf4 .\cf3 mycompany\cf4 .\cf3 myapp\cf4 .\cf3 dataApi\cf4 .\cf3 controller\cf4 ;\cf0 \
\
\cf2 import\cf3  \ul javax\cf4 \ulc4 .\cf3 \ulc3 servlet\cf4 \ulc4 .\cf3 \ulc3 http\cf4 \ulc4 .\cf3 \ulc3 HttpServletRequest\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  java\cf4 .\cf3 io\cf4 .\cf3 InputStreamReader\cf4 ;\cf0 \
\cf2 import\cf3  \ul java\cf4 \ulc4 .\cf3 \ulc3 io\cf4 \ulc4 .\cf3 \ulc3 UnsupportedEncodingException\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  \ul java\cf4 \ulc4 .\cf3 \ulc3 lang\cf4 \ulc4 .\cf3 \ulc3 reflect\cf4 \ulc4 .\cf3 \ulc3 Type\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  java\cf4 .\cf3 net\cf4 .\cf3 HttpURLConnection\cf4 ;\cf0 \
\cf2 import\cf3  \ul java\cf4 \ulc4 .\cf3 \ulc3 net\cf4 \ulc4 .\cf3 \ulc3 MalformedURLException\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  java\cf4 .\cf3 net\cf4 .\cf3 URL\cf4 ;\cf0 \
\cf2 import\cf3  \ul java\cf4 \ulc4 .\cf3 \ulc3 net\cf4 \ulc4 .\cf3 \ulc3 URLEncoder\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  \ul java\cf4 \ulc4 .\cf3 \ulc3 util\cf4 \ulc4 .\cf3 \ulc3 List\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  java\cf4 .\cf3 util\cf4 .\cf3 Map\cf4 ;\cf0 \
\cf2 import\cf3  java\cf4 .\cf3 io\cf4 .\cf3 BufferedReader\cf4 ;\cf0 \
\cf2 import\cf3  java\cf4 .\cf3 io\cf4 .\cf3 IOException\cf4 ;\cf0 \
\cf2 import\cf3  org\cf4 .\cf3 json\cf4 .\cf3 simple\cf4 .\cf3 parser\cf4 .\cf3 ParseException\cf4 ;\cf0 \
\cf2 import\cf3  \ul org\cf4 \ulc4 .\cf3 \ulc3 json\cf4 \ulc4 .\cf3 \ulc3 simple\cf4 \ulc4 .\cf3 \ulc3 JSONArray\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  org\cf4 .\cf3 json\cf4 .\cf3 simple\cf4 .\cf3 JSONObject\cf4 ;\cf0 \
\cf2 import\cf3  org\cf4 .\cf3 json\cf4 .\cf3 simple\cf4 .\cf3 parser\cf4 .\cf3 JSONParser\cf4 ;\cf0 \
\cf2 import\cf3  org\cf4 .\cf3 springframework\cf4 .\cf3 stereotype\cf4 .\cf3 Controller\cf4 ;\cf0 \
\cf2 import\cf3  \ul org\cf4 \ulc4 .\cf3 \ulc3 springframework\cf4 \ulc4 .\cf3 \ulc3 ui\cf4 \ulc4 .\cf3 \ulc3 Model\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  \ul org\cf4 \ulc4 .\cf3 \ulc3 springframework\cf4 \ulc4 .\cf3 \ulc3 web\cf4 \ulc4 .\cf3 \ulc3 bind\cf4 \ulc4 .\cf3 \ulc3 annotation\cf4 \ulc4 .\cf3 \ulc3 RequestBody\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  org\cf4 .\cf3 springframework\cf4 .\cf3 web\cf4 .\cf3 bind\cf4 .\cf3 annotation\cf4 .\cf3 RequestMapping\cf4 ;\cf0 \
\cf2 import\cf3  org\cf4 .\cf3 springframework\cf4 .\cf3 web\cf4 .\cf3 bind\cf4 .\cf3 annotation\cf4 .\cf3 ResponseBody\cf4 ;\cf0 \
\
\cf2 import\cf3  com\cf4 .\cf3 fasterxml\cf4 .\cf3 jackson\cf4 .\cf3 databind\cf4 .\cf3 JsonMappingException\cf4 ;\cf0 \
\cf2 import\cf3  com\cf4 .\cf3 fasterxml\cf4 .\cf3 jackson\cf4 .\cf3 databind\cf4 .\cf3 ObjectMapper\cf4 ;\cf0 \
\cf2 import\cf3  \ul com\cf4 \ulc4 .\cf3 \ulc3 google\cf4 \ulc4 .\cf3 \ulc3 gson\cf4 \ulc4 .\cf3 \ulc3 Gson\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  \ul com\cf4 \ulc4 .\cf3 \ulc3 google\cf4 \ulc4 .\cf3 \ulc3 gson\cf4 \ulc4 .\cf3 \ulc3 JsonArray\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  \ul com\cf4 \ulc4 .\cf3 \ulc3 google\cf4 \ulc4 .\cf3 \ulc3 gson\cf4 \ulc4 .\cf3 \ulc3 JsonObject\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  com\cf4 .\cf3 google\cf4 .\cf3 gson\cf4 .\cf3 JsonParseException\cf4 ;\cf0 \
\cf2 import\cf3  \ul com\cf4 \ulc4 .\cf3 \ulc3 google\cf4 \ulc4 .\cf3 \ulc3 gson\cf4 \ulc4 .\cf3 \ulc3 JsonParser\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  \ul com\cf4 \ulc4 .\cf3 \ulc3 google\cf4 \ulc4 .\cf3 \ulc3 gson\cf4 \ulc4 .\cf3 \ulc3 reflect\cf4 \ulc4 .\cf3 \ulc3 TypeToken\cf4 \ulnone ;\cf0 \
\
\cf2 import\cf3  \ul java\cf4 \ulc4 .\cf3 \ulc3 io\cf4 \ulc4 .\cf3 \ulc3 InputStreamReader\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  \ul java\cf4 \ulc4 .\cf3 \ulc3 net\cf4 \ulc4 .\cf3 \ulc3 HttpURLConnection\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  \ul java\cf4 \ulc4 .\cf3 \ulc3 net\cf4 \ulc4 .\cf3 \ulc3 URL\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  \ul java\cf4 \ulc4 .\cf3 \ulc3 net\cf4 \ulc4 .\cf3 \ulc3 URLEncoder\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  \ul java\cf4 \ulc4 .\cf3 \ulc3 io\cf4 \ulc4 .\cf3 \ulc3 BufferedReader\cf4 \ulnone ;\cf0 \
\cf2 import\cf3  \ul java\cf4 \ulc4 .\cf3 \ulc3 io\cf4 \ulc4 .\cf3 \ulc3 IOException\cf4 \ulnone ;\cf0 \
\
\
\pard\pardeftab720\partightenfactor0

\f1\i \cf5 @Controller
\f0\i0 \cf0 \
\pard\pardeftab720\partightenfactor0
\cf2 public\cf3  \cf2 class\cf3  \cf6 ApiController\cf3  \cf7 \{\cf0 \
\pard\pardeftab720\partightenfactor0
\cf3 	\cf0 \
\cf3 	
\f1\i \cf5 @RequestMapping
\f0\i0 \cf7 (\cf8 "/getApiData"\cf7 )\cf0 \
\cf3 	
\f1\i \cf5 @ResponseBody
\f0\i0 \cf0 \
\cf3 	\cf2 public\cf3  \cf9 Map\cf4 <\cf10 String\cf4 ,\cf3  \cf10 Object\cf4 >\cf11 getApiData\cf7 (\cf3  \cf7 )\cf3  \cf2 throws\cf3  \cf6 IOException\cf4 ,\cf3  \cf6 ParseException\cf3  \cf7 \{\cf0 \
\cf3 		  \cf6 StringBuilder\cf3  \cf12 \ul \ulc12 urlBuilder\cf3 \ulnone  \cf4 =\cf3  \cf2 new\cf3  \cf13 StringBuilder\cf7 (\cf8 "http://api.data.go.kr/openapi/tn_pubr_public_food_truck_permit_area_api?serviceKey=pIjdyg6yRnPqmwfTfG4m3TIDh518lq4lqoOgjavC5e1QPr3Vut5Dri2mQXpGfX5CbeusLqm9VNvju4fmvIkv0g%3D%3D&pageNo=0&numOfRows=100&type=json"\cf7 )\cf4 ;\cf3  \cf14 /*URL*/\cf0 \
\cf3 		  \cf6 BufferedReader\cf3  \cf12 br\cf3  \cf4 =\cf3  \cf2 null\cf4 ;\cf0 \
\cf3 		  \cf6 String\cf3  \cf12 urlstr\cf3  \cf4 =\cf3  \cf8 "http://api.data.go.kr/openapi/tn_pubr_public_food_truck_permit_area_api?serviceKey=pIjdyg6yRnPqmwfTfG4m3TIDh518lq4lqoOgjavC5e1QPr3Vut5Dri2mQXpGfX5CbeusLqm9VNvju4fmvIkv0g%3D%3D&pageNo=0&numOfRows=100&type=json"\cf4 ;\cf0 \
\cf3 			\cf6 URL\cf3  \cf12 url\cf3  \cf4 =\cf3  \cf2 new\cf3  \cf13 URL\cf7 (\cf15 urlstr\cf7 )\cf4 ;\cf0 \
\cf3 			\cf16 HttpURLConnection\cf3  \cf12 urlconnection\cf3  \cf4 =\cf3  \cf7 (\cf16 HttpURLConnection\cf7 )\cf3  \cf15 url\cf4 .\cf13 openConnection\cf7 ()\cf4 ;\cf0 \
\cf3 			\cf15 urlconnection\cf4 .\cf13 setRequestMethod\cf7 (\cf8 "GET"\cf7 )\cf4 ;\cf0 \
\cf3 			\cf15 br\cf3  \cf4 =\cf3  \cf2 new\cf3  \cf13 BufferedReader\cf7 (\cf2 new\cf3  \cf13 InputStreamReader\cf7 (\cf15 urlconnection\cf4 .\cf13 getInputStream\cf7 ()\cf4 ,\cf8 "UTF-8"\cf7 ))\cf4 ;\cf3  \cf0 \
\cf3 			\cf6 String\cf3  \cf12 result\cf3  \cf4 =\cf3  \cf8 ""\cf4 ;\cf0 \
\cf3 			\cf6 String\cf3  \cf12 line\cf4 ;\cf0 \
\cf3 			\cf2 while\cf7 ((\cf15 line\cf3  \cf4 =\cf3  \cf15 br\cf4 .\cf13 readLine\cf7 ())\cf3  \cf4 !=\cf3  \cf2 null\cf7 )\cf3  \cf7 \{\cf3  \cf0 \
\cf3 				\cf15 result\cf3  \cf4 =\cf3  \cf15 result\cf3  \cf4 +\cf3  \cf15 line\cf4 ;\cf0 \
\cf3 			\cf7 \}\cf0 \
\cf3 			\cf0 \
\cf3 			\cf6 JSONParser\cf3  \cf12 parser\cf3  \cf4 =\cf3  \cf2 new\cf3  \cf13 JSONParser\cf7 ()\cf4 ;\cf0 \
\cf3 			\cf6 Object\cf3  \cf12 object\cf3  \cf4 =\cf3  \cf15 parser\cf4 .\cf13 parse\cf7 (\cf15 result\cf4 .\cf13 toString\cf7 ())\cf4 ;\cf3  \cf0 \
\cf3 			\cf6 JSONObject\cf3  \cf12 json\cf3  \cf4 =\cf3  \cf7 (\cf6 JSONObject\cf7 )\cf3  \cf15 object\cf4 ;\cf0 \
\cf3 			\cf14 //System.out.println("jsonParsing Data ===>"+\ul json\ulnone );\cf0 \
\cf3 		 	\cf14 /*\cf0 \
\pard\pardeftab720\partightenfactor0
\cf14 			JsonParser jsonParser = new JsonParser();\cf0 \
\cf14 			JsonObject k = (JsonObject) jsonParser.parse(result);\cf0 \
\cf14 			JsonArray institutionNm = new JsonArray();\cf0 \
\cf14 			institutionNm = k.get("institutionNm").getAsJsonArray();\cf0 \
\cf14 			\ul Gson\ulnone  \ul gson\ulnone  = new \ul Gson\ulnone ();\cf0 \
\cf14 			Type type = new TypeToken<List<Map<String, Object>>>()\{\}.getType();\cf0 \
\cf14 		    List<Map<String, Object>> institutionNmList = gson.fromJson(institutionNm, type);\cf0 \
\cf14 		    System.out.println("institutionNm===> " + institutionNmList);\cf0 \
\cf14 			*/\cf0 \
\pard\pardeftab720\partightenfactor0
\cf3 			\cf2 return\cf3  \cf13 getMapFromJsonObject\cf7 (\cf15 json\cf7 )\cf4 ;\cf0 \
\cf3 	    \cf0 \
\cf3 	\cf7 \}\cf0 \
\cf3 	\cf0 \
\cf3 	\cf2 public\cf3  \cf9 Map\cf4 <\cf10 String\cf3  \cf4 ,\cf3  \cf10 Object\cf3  \cf4 >\cf3  \cf11 getMapFromJsonObject\cf7 (\cf6 JSONObject\cf3  \cf17 jsonObj\cf7 )\{\cf0 \
\cf3 		\cf9 Map\cf4 <\cf10 String\cf3  \cf4 ,\cf3  \cf10 Object\cf3  \cf4 >\cf12 map\cf3  \cf4 =\cf3  \cf2 null\cf4 ;\cf0 \
\cf3 		\cf2 try\cf3  \cf7 \{\cf0 \
\cf3 			\cf15 map\cf3  \cf4 =\cf3  \cf2 \ul \ulc2 new\cf3 \ulc3  \cf13 \ulc13 ObjectMapper\cf7 \ulc7 ()\cf4 \ulc4 .\cf13 \ulc13 readValue\cf7 \ulc7 (\cf17 \ulc17 jsonObj\cf4 \ulc4 .\cf13 \ulc13 toJSONString\cf7 \ulc7 ()\cf4 \ulc4 ,\cf9 \ulc9 Map\cf4 \ulc4 .\cf2 \ulc2 class\cf7 \ulc7 )\cf4 \ulnone ;\cf0 \
\cf3 			\cf6 System\cf4 .
\f2\i\b \cf18 out
\f0\i0\b0 \cf4 .\cf13 println\cf7 (\cf8 "map data ===> "\cf3  \cf4 +\cf3  \cf15 map\cf3  \cf7 )\cf4 ;\cf0 \
\cf3 			\cf0 \
\cf3 		\cf7 \}\cf2 catch\cf7 (\cf6 JsonParseException\cf3  \cf12 e\cf7 )\cf3  \cf7 \{\cf0 \
\cf3 			\cf0 \
\cf3 		\cf7 \}\cf2 catch\cf7 (\cf6 JsonMappingException\cf3  \cf12 e\cf7 )\cf3  \cf7 \{\cf0 \
\cf3 			\cf0 \
\cf3 		\cf7 \}\cf2 catch\cf7 (\cf6 IOException\cf3  \cf12 e\cf7 )\cf3  \cf7 \{\cf0 \
\cf3 			\cf0 \
\cf3 		\cf7 \}\cf0 \
\cf3 		\cf2 return\cf3  \cf15 map\cf4 ;\cf0 \
\cf3 		\cf0 \
\cf3 	\cf7 \}\cf0 \
\pard\pardeftab720\partightenfactor0
\cf7 \}\cf0 \
\
\pard\pardeftab720\partightenfactor0
\cf3 	\cf0 \
\
\
}