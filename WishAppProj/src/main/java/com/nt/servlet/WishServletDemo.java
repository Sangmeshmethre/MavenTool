package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishServletDemo extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
	
		//General Setting
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		Calendar calendar = Calendar.getInstance();
		int hr = calendar.get(Calendar.HOUR_OF_DAY);
		
		Date d = new Date();
		pw.println("<b><i><center> Date and Time is"+d+"</b></i></center>");
		
		if(hr <= 12)
			pw.println("<h2> Good Morning</h2>");
		else if(hr <= 16)
			pw.println("<h2>Good Afternoon</h2>");
		else if(hr <= 20)
			pw.println("<h2>Good Evening </h2>");
		else
			pw.println("<h2>Good Night</h2>");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		
		doGet(req, res);
	}

}
