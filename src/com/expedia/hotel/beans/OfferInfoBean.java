package com.expedia.hotel.beans;

public class OfferInfoBean {
	//"offerInfo":{"siteID":"1","language":"en_US","currency":"USD"}
	private int siteID;
	private String language;
	private String currency;
	
	OfferInfoBean(int id, String language, String currency) {
		this.siteID = id;
		this.language = language;
		this.currency = currency;
	}
	
	public int getSiteId() {
		return siteID;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public String getCurrency() {
		return  currency;
	}
}