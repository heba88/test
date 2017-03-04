package com.expedia.hotel.beans;

public class JsonResponseBean {
	private OfferInfoBean offerInfo;
	private UserInfoBean userInfo;
	private HotelOffersBean offers;
	
	public JsonResponseBean(OfferInfoBean offerInfo, UserInfoBean userInfo,HotelOffersBean hotelOffers ) {
		this.offerInfo = offerInfo;
		this.userInfo = userInfo;
		this.offers = hotelOffers;
		
	}
	
	public OfferInfoBean getOfferInfoBean() {
		return offerInfo;
	}
	
	public UserInfoBean getUserInfoBean() {
		return userInfo;
	}
	
	public HotelOffersBean getHotelOffersBean(){
		return offers;
	}
}