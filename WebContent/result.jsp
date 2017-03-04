<%@page import="com.expedia.hotel.beans.*, java.util.*"   %>
<html>

<body>
Search results : <br>
<%
JsonResponseBean offers = (JsonResponseBean)request.getAttribute("offers");
%>
offer Info: <br> siteID: <% out.print( offers.getOfferInfoBean().getSiteId());%> 
,language: <%out.print( offers.getOfferInfoBean().getLanguage());%>
, currency: <%out.print(offers.getOfferInfoBean().getCurrency());%>
<br>
user Info:  persona : personaType : <%out.print( offers.getUserInfoBean().getPersonaType());%> 
,userId : <%out.print( offers.getUserInfoBean().getUserId());%>
<br><br>
<%
List<OfferBean> hotelOffers = offers.getHotelOffersBean().getHotelOffers();
for (int i =0; i <5 ; i++) {
	OfferBean currentOffer= hotelOffers.get(i);
%>	
	offerDateRange :  Travel Star tDate : <%=currentOffer.getTravelStartDate()%>, Travel End Date : <%=currentOffer.getTravelEndDate()%> <br>
	destination : regionID : <%=currentOffer.getDestinationRegionID()  %>,Name : <%=currentOffer.getDestinationName()%><br>
	hotelInfo : <br> 
	<img src=<%=currentOffer.getHotelImageUrl()%> alt="">
	Name : <%=currentOffer.getHotelName()%>, Location : <%=currentOffer.getHotelLocation()%>, Star Rating : <%=currentOffer.getHotelStarRating()%>,
	Guest Review rating : <%=currentOffer.getHotelGuestReviewRating()%>, Promotion Description : <%=currentOffer.getPromotionDescription()%>,
	 Promotion Amount : <%=currentOffer.getPromotionAmount()%> Car package : <input type="checkbox" name="<%= currentOffer.isCarPackage()%>"> <br>
	 Hotel Urgency Info: 
	 Number of People booked : <%=currentOffer.getNumberOfPeopleBooked()%>, Number of rooms left : <%=currentOffer.getNumberOfRoomsLeft()%> <br>
	 Hotel Pricing Info :
	 Average Price : <%=currentOffer.getAveragePriceValue()%>, Total Price : <%=currentOffer.getTotalPriceValue()%>, Taxes and Fees : <%=currentOffer.getHotelTotalTaxesAndFees()%> <br>
	 Hotel URLs : 
	 <a href=<%=currentOffer.getHotelUrl()%>></a>
	 <br>
	 Hotel scores :
	 Raw Appeal Score : <%=currentOffer.getRawAppealScore()%>,  Moving Average Score : <%=currentOffer.getMovingAverageScore()%>
	 <br><br>
	 
<%
}
%>

</body>
</html>