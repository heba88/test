package com.expedia.hotel;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Extension.Parameter;

import com.expedia.hotel.beans.HotelOffersBean;
import com.expedia.hotel.beans.JsonResponseBean;

/**
 * Servlet implementation class searchHotelOffers
 */
@WebServlet("/searchHotelOffers")
public class searchHotelOffers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchHotelOffers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		addRequestParamtersToServiceURL(request);
		
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		out.println("from servelt"); 
		//out.println( GetHotelOffers.getOffers() );
		JsonResponseBean offers = GetHotelOffers.getOffers();
		request.setAttribute("offers", offers);
		RequestDispatcher dispatcher =  request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);
	}

	private void addRequestParamtersToServiceURL(HttpServletRequest request) {
		String serviceURL = GetHotelOffers.getServiceURL();
		Map<String, String[]> paramters = request.getParameterMap();
		if(paramters.isEmpty()){
			return;
		}
		Iterator iter;
		for(iter = paramters.keySet().iterator();iter.hasNext();) {
			String parameterName =(String) iter.next();
			String[] paramterValues = paramters.get(parameterName);
			if(paramterValues.length==0 || paramterValues[0].isEmpty()){
				continue;
			}
			serviceURL+= "&"+parameterName+"="+paramterValues[0];
		}
		GetHotelOffers.setServiceURL(serviceURL);
	}

}
