package com.mycompany.myapp.dataApi.controller;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;


@Controller
public class ApiController {
	
	@RequestMapping("/getApiData")
	@ResponseBody
	public Map<String, Object>getApiData( ) throws IOException, ParseException {
		  StringBuilder urlBuilder = new StringBuilder("http://api.data.go.kr/openapi/tn_pubr_public_food_truck_permit_area_api?serviceKey=pIjdyg6yRnPqmwfTfG4m3TIDh518lq4lqoOgjavC5e1QPr3Vut5Dri2mQXpGfX5CbeusLqm9VNvju4fmvIkv0g%3D%3D&pageNo=0&numOfRows=100&type=json"); /*URL*/
		  BufferedReader br = null;
		  String urlstr = "http://api.data.go.kr/openapi/tn_pubr_public_food_truck_permit_area_api?serviceKey=pIjdyg6yRnPqmwfTfG4m3TIDh518lq4lqoOgjavC5e1QPr3Vut5Dri2mQXpGfX5CbeusLqm9VNvju4fmvIkv0g%3D%3D&pageNo=0&numOfRows=100&type=json";
			URL url = new URL(urlstr);
			HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
			urlconnection.setRequestMethod("GET");
			br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(),"UTF-8")); 
			String result = "";
			String line;
			while((line = br.readLine()) != null) { 
				result = result + line;
			}
			
			JSONParser parser = new JSONParser();
			Object object = parser.parse(result.toString()); 
			JSONObject json = (JSONObject) object;
			//System.out.println("jsonParsing Data ===>"+json);
		 	/*
			JsonParser jsonParser = new JsonParser();
			JsonObject k = (JsonObject) jsonParser.parse(result);
			JsonArray institutionNm = new JsonArray();
			institutionNm = k.get("institutionNm").getAsJsonArray();
			Gson gson = new Gson();
			Type type = new TypeToken<List<Map<String, Object>>>(){}.getType();
		    List<Map<String, Object>> institutionNmList = gson.fromJson(institutionNm, type);
		    System.out.println("institutionNm===> " + institutionNmList);
			*/
			return getMapFromJsonObject(json);
	    
	}
	
	public Map<String , Object > getMapFromJsonObject(JSONObject jsonObj){
		Map<String , Object >map = null;
		try {
			map = new ObjectMapper().readValue(jsonObj.toJSONString(),Map.class);
			System.out.println("map data ===> " + map );
			
		}catch(JsonParseException e) {
			
		}catch(JsonMappingException e) {
			
		}catch(IOException e) {
			
		}
		return map;
		
	}
}

	


