package com.expedia.hotel.beans;

import java.util.LinkedList;
import java.util.List;

public class HotelOffersBean {
	private List<OfferBean> Hotel = new LinkedList<OfferBean>();
	
	public List<OfferBean> getHotelOffers() {
		return Hotel;
	}
}