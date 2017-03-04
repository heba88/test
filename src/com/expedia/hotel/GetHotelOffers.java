package com.expedia.hotel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.expedia.hotel.beans.HotelOffersBean;
import com.expedia.hotel.beans.JsonResponseBean;
import com.expedia.hotel.beans.OfferInfoBean;
import com.expedia.hotel.beans.UserInfoBean;
import com.google.gson.Gson;



public class GetHotelOffers {
	private static String serviceURL="https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";
	
	public static String  getServiceURL () {
		return serviceURL;
	}
	
	public static void setServiceURL(String url) {
		serviceURL = url;
	}
	public static JsonResponseBean getOffers() {
		try {
			URL url = new URL(serviceURL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			String currentLine;
			String output="";
			while((currentLine = reader.readLine())!=null){
				output+=currentLine;
			}
			conn.disconnect();
			
			//Unmarshel JSON response
			//Object obj=JSONValue.parse(output);
			//JSONObject jsonObject=new JSONObject();
			//JSONArray temp1 = new JSONArray(output);
			//System.out.println(finalResult);
//			JSONTokener tokener = new JSONTokener(output);
//			tokener.
//			JSONArray finalResult = new JSONArray();
			
			Gson gson = new Gson();
//			OfferInfoBean offerInfoObj = gson.fromJson(output, OfferInfoBean.class);
//			UserInfoBean userInfoObj = gson.fromJson(output, UserInfoBean.class);
//			HotelOffersBean hotelOffersObj = gson.fromJson(output, HotelOffersBean.class);
			JsonResponseBean hotelOffersObj = gson.fromJson(output, JsonResponseBean.class);
			
			return hotelOffersObj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}