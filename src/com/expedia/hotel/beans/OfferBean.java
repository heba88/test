package com.expedia.hotel.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.catalina.tribes.util.Arrays;


public class OfferBean {
	/*
	 * {"offerDateRange":{"travelStartDate":[2017,4,1],"travelEndDate":[2017,4,4],"lengthOfStay":3},
		"destination":{"regionID":"602904","longName":"Norfolk - Virginia Beach (and vicinity), Virginia, United States of America","country":"USA","province":"VA","city":"Virginia Beach"},
		"hotelInfo":{"hotelId":"9464937","hotelName":"Alamar Resort Inn","hotelDestination":"Virginia Beach","hotelDestinationRegionID":"602904","hotelLongDestination":"Norfolk - Virginia Beach (and vicinity), Virginia, United States of America","hotelStreetAddress":"311 16th Street","hotelCity":"Virginia Beach","hotelProvince":"VA","hotelCountryCode":"USA","hotelLocation":"-75.976306,36.843975","hotelLatitude":36.843975,"hotelLongitude":-75.976306,"hotelStarRating":"2.0","hotelGuestReviewRating":3.8,"travelStartDate":"04/01/2017","travelEndDate":"04/04/2017","hotelImageUrl":"https://images.trvl-media.com/hotels/10000000/9470000/9465000/9464937/9464937_6_t.jpg","carPackageScore":18.9175,"description":"Situated in Virginia Beach, this hotel is 0.1 mi (0.2 km) from Captain Cline's Pirate Ghost Ride and within 3 mi (5 km) of Virginia Aquarium and Marine Science Center and Ocean Breeze Waterpark. John Wareing Monument and Beach Mall Shopping Center are also within 10 minutes. ","distanceFromUser":0.0,"language":"en","movingAverageScore":-0.85,"promotionAmount":0.0,"promotionDescription":"","promotionTag":"GDE","rawAppealScore":18.9175,"relevanceScore":0.0,"statusCode":"0","statusDescription":"","carPackage":false,"allInclusive":false},
		"hotelUrgencyInfo":{"airAttachRemainingTime":0,"numberOfPeopleViewing":4,"numberOfPeopleBooked":1,"numberOfRoomsLeft":0,"lastBookedTime":1488463335547,"almostSoldStatus":"ALMOST_SOLD","link":"/Hotel-Search#selected=9464937","almostSoldOutRoomTypeInfoCollection":[],"airAttachEnabled":false},
		"hotelPricingInfo":{"averagePriceValue":75.67,"totalPriceValue":264.78,"originalPricePerNight":"75.67","hotelTotalBaseRate":227.0,"hotelTotalTaxesAndFees":37.78,"currency":"USD","hotelTotalMandatoryTaxesAndFees":0.0,"percentSavings":0.0,"drr":false},
		"hotelUrls":{"hotelInfositeUrl":"http%3A%2F%2Fdeals.expedia.com%2Fbeta%2Fhotel_redirect%3Fgde_deep_link%3Dhttp%25253A%25252F%25252Fwww.expedia.com%25252Fgo%25252Fhotel%25252Finfo%25252F9464937%25252F2017-04-01%25252F2017-04-04%25253FNumRooms%25253D1%252526NumAdult-Room1%25253D2%252526rateplanid%25253D204204293_24%252526tpid%25253D1%252526langid%25253D1033%26gde_index%3D0%26gde_hash%3D13826474a18646748b03d7abc9e4810c%26gde_type%3DHotel%26gde_hotel%3Dtrue%26gde_hotel_id%3D9464937%26gde_check_in_date%3D2017-04-01%26gde_check_out_date%3D2017-04-04%26gde_price%3D264.78","hotelSearchResultUrl":"http%3A%2F%2Fdeals.expedia.com%2Fbeta%2Fhotel_redirect%3Fgde_deep_link%3Dhttp%25253A%25252F%25252Fwww.expedia.com%25252Fpubspec%25252Fscripts%25252Feap.asp%25253FGOTO%25253DHOTSEARCH%252526SearchType%25253DPlace%252526PlaceName%25253DVirginia%252BBeach%25252C%252BVA%25252C%252BUSA%252526InDate%25253D4%25252F1%25252F17%252526OutDate%25253D4%25252F4%25252F17%252526langid%25253D1033%26gde_index%3D0%26gde_hash%3D13826474a18646748b03d7abc9e4810c%26gde_type%3DHotel%26gde_hotel%3Dtrue%26gde_hotel_id%3D9464937%26gde_check_in_date%3D2017-04-01%26gde_check_out_date%3D2017-04-04%26gde_price%3D264.78"},
		"hotelScores":{"rawAppealScore":18.9175,"movingAverageScore":-0.85}},
	 * */
	private OfferDateRange offerDateRange;
	private Destination destination;
	private HotelInfo hotelInfo;
	private HotelUrgencyInfo hotelUrgencyInfo;
	private HotelPricingInfo hotelPricingInfo;
	private HotelUrls hotelUrls;
	private HotelScores hotelScores;
	
	public String getTravelStartDate() {
		String dateStr ="";
		int[] date = offerDateRange.travelStartDate;
		for(int i =0;i < date.length; ++i) {
			if(i!=0){
				dateStr+="-";
			}
			dateStr+= String.valueOf(date[i]);
		}
		return dateStr;
	}
	public String getTravelEndDate() {
		String dateStr ="";
		int[] date = offerDateRange.travelEndDate;
		for(int i =0;i < date.length; ++i) {
			if(i!=0){
				dateStr+="-";
			}
			dateStr+= String.valueOf(date[i]);
		}
		return dateStr;
	}
	
	public String getDestinationRegionID () {
		return destination.regionID;
	}
	
	public String getDestinationName() {
		return destination.longName;
	}
	
	public String getHotelName() {
		return hotelInfo.hotelName;
	}
	public String getHotelLocation() {
		return hotelInfo.hotelLocation;
	}
	public double getHotelStarRating() {
		return hotelInfo.hotelStarRating;
	}
	public double getHotelGuestReviewRating() {
		return hotelInfo.hotelGuestReviewRating;
	}
	public String getHotelImageUrl() {
		return hotelInfo.hotelImageUrl;
	}
	public String getPromotionDescription() {
		return hotelInfo.promotionDescription;
	}
	public double getPromotionAmount() {
		return hotelInfo.promotionAmount;
	}
	public boolean isCarPackage() {
		return hotelInfo.carPackage;
	}
	
	public int getNumberOfPeopleBooked() {
		return hotelUrgencyInfo.numberOfPeopleBooked;
	}
	public int getNumberOfRoomsLeft() {
		return hotelUrgencyInfo.numberOfRoomsLeft;
	}
	
	public double getAveragePriceValue() {
		return hotelPricingInfo.averagePriceValue;
	}
	public double getTotalPriceValue() {
		return hotelPricingInfo.totalPriceValue;
	}
	public double getOriginalPricePerNight() {
		return hotelPricingInfo.originalPricePerNight;
	}
	public double getHotelTotalBaseRate() {
		return hotelPricingInfo.hotelTotalBaseRate;
	}
	public double getHotelTotalTaxesAndFees() {
		return hotelPricingInfo.hotelTotalTaxesAndFees;
	}
	public String getHotelUrl() {
		return hotelUrls.hotelInfositeUrl;
	}
	public double getRawAppealScore() {
		return hotelScores.rawAppealScore;
	}
	public double getMovingAverageScore() {
		return hotelScores.movingAverageScore;
	}
	//-----------------------------------------------------------
	class OfferDateRange {
		private int[] travelStartDate;
		private int[] travelEndDate;
		int lengthOfStay;
		
		OfferDateRange(int[] travelStartDate, int[] travelEndDate,int lengthOfStay) {
			this.travelStartDate = travelStartDate;
			this.travelEndDate = travelEndDate;
			this.lengthOfStay = lengthOfStay;
		}
	}
	
	class Destination {
		private String regionID;
		private String longName;
		private String country;
		private String province;
		private String city;
	}
	
	
	class HotelInfo {
		//"hotelInfo":{"hotelId":"9464937","hotelName":"Alamar Resort Inn",
		//"hotelDestination":"Virginia Beach","hotelDestinationRegionID":"602904",
		//"hotelLongDestination":"Norfolk - Virginia Beach (and vicinity), Virginia, United States of America",
		//"hotelStreetAddress":"311 16th Street","hotelCity":"Virginia Beach",
		//"hotelProvince":"VA","hotelCountryCode":"USA","hotelLocation":"-75.976306,36.843975",
		//"hotelLatitude":36.843975,"hotelLongitude":-75.976306,"hotelStarRating":"2.0",
		//"hotelGuestReviewRating":3.8,"travelStartDate":"04/01/2017","travelEndDate":"04/04/2017",
		//"hotelImageUrl":"https://images.trvl-media.com/hotels/10000000/9470000/9465000/9464937/9464937_6_t.jpg",
		//"carPackageScore":18.9175,"description":"Situated in Virginia Beach, this hotel is 0.1 mi (0.2 km) from Captain Cline's Pirate Ghost Ride and within 3 mi (5 km) of Virginia Aquarium and Marine Science Center and Ocean Breeze Waterpark. John Wareing Monument and Beach Mall Shopping Center are also within 10 minutes. ",
		//"distanceFromUser":0.0,"language":"en","movingAverageScore":-0.85,
		//"promotionAmount":0.0,"promotionDescription":"","promotionTag":"GDE",
		//"rawAppealScore":18.9175,"relevanceScore":0.0,"statusCode":"0",
		//"statusDescription":"","carPackage":false,"allInclusive":false},
		private String hotelId;
		private String hotelName;
		private String hotelDestination;
		private String hotelLongDestination;
		private String hotelStreetAddress;
		private String hotelProvince;
		private String hotelCountryCode;
		private String hotelLocation;
		private String hotelLatitude;
		private String hotelLongitude;
		private double hotelStarRating;
		private double hotelGuestReviewRating;
		private String travelStartDate;
		private String travelEndDate;
		private String hotelImageUrl;
		private String carPackageScore;
		private String description;
		private double distanceFromUser;
		private String language;
		private double movingAverageScore;
		private String promotionDescription;
		private String promotionTag;
		private double rawAppealScore;
		private double promotionAmount;
		private double relevanceScore;
		private int statusCode;
		private String statusDescription;
		private boolean carPackage;
		private boolean allInclusive;
	}
	
	
	//"hotelUrgencyInfo":{"airAttachRemainingTime":0,"numberOfPeopleViewing":4,
	//"numberOfPeopleBooked":1,"numberOfRoomsLeft":0,"lastBookedTime":1488463335547,
	//"almostSoldStatus":"ALMOST_SOLD","link":"/Hotel-Search#selected=9464937",
	//"almostSoldOutRoomTypeInfoCollection":[],"airAttachEnabled":false},
	class HotelUrgencyInfo {
		private double airAttachRemainingTime;
		private int numberOfPeopleViewing;
		private int numberOfPeopleBooked;
		private int numberOfRoomsLeft;
		private String lastBookedTime;
		private String almostSoldStatus;
		private String link;
		private List almostSoldOutRoomTypeInfoCollection;
		private boolean airAttachEnabled;
	}
	
	//"hotelPricingInfo":{"averagePriceValue":75.67,"totalPriceValue":264.78,
	//"originalPricePerNight":"75.67","hotelTotalBaseRate":227.0,
	//"hotelTotalTaxesAndFees":37.78,"currency":"USD",
	//"hotelTotalMandatoryTaxesAndFees":0.0,"percentSavings":0.0,"drr":false},
	class HotelPricingInfo {
		private double averagePriceValue;
		private double totalPriceValue;
		private double originalPricePerNight;
		private double hotelTotalBaseRate;
		private double hotelTotalTaxesAndFees;
		private String currency;
		private double hotelTotalMandatoryTaxesAndFees;
		private double percentSavings;
		private boolean drr;
		
	}
	
	
	//"hotelUrls":{"hotelInfositeUrl":"http%3A%2F%2Fdeals.expedia.com%2Fbeta%2Fhotel_redirect%3Fgde_deep_link%3Dhttp%25253A%25252F%25252Fwww.expedia.com%25252Fgo%25252Fhotel%25252Finfo%25252F9464937%25252F2017-04-01%25252F2017-04-04%25253FNumRooms%25253D1%252526NumAdult-Room1%25253D2%252526rateplanid%25253D204204293_24%252526tpid%25253D1%252526langid%25253D1033%26gde_index%3D0%26gde_hash%3D13826474a18646748b03d7abc9e4810c%26gde_type%3DHotel%26gde_hotel%3Dtrue%26gde_hotel_id%3D9464937%26gde_check_in_date%3D2017-04-01%26gde_check_out_date%3D2017-04-04%26gde_price%3D264.78","hotelSearchResultUrl":"http%3A%2F%2Fdeals.expedia.com%2Fbeta%2Fhotel_redirect%3Fgde_deep_link%3Dhttp%25253A%25252F%25252Fwww.expedia.com%25252Fpubspec%25252Fscripts%25252Feap.asp%25253FGOTO%25253DHOTSEARCH%252526SearchType%25253DPlace%252526PlaceName%25253DVirginia%252BBeach%25252C%252BVA%25252C%252BUSA%252526InDate%25253D4%25252F1%25252F17%252526OutDate%25253D4%25252F4%25252F17%252526langid%25253D1033%26gde_index%3D0%26gde_hash%3D13826474a18646748b03d7abc9e4810c%26gde_type%3DHotel%26gde_hotel%3Dtrue%26gde_hotel_id%3D9464937%26gde_check_in_date%3D2017-04-01%26gde_check_out_date%3D2017-04-04%26gde_price%3D264.78"},
	class HotelUrls {
		private String hotelInfositeUrl;
	}
	
	//"hotelScores":{"rawAppealScore":18.9175,"movingAverageScore":-0.85}},\
	class HotelScores {
		private double rawAppealScore;
		private double movingAverageScore;
	}
	
	
}
