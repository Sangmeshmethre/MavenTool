package com.nt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WishServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{

		//General setting
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		Calendar calendar =  Calendar.getInstance();
		int hr = calendar.get(Calendar.HOUR_OF_DAY);

		Date d = new Date();
		pw.println("<b><i><center> Date and Time is "+d+"</b></i></center>");

		if(hr <= 12)
			pw.println("<h2>GOOD MORNING</h2>");
		else if(hr <= 16)
			pw.println("<h2>GOOD AFTERNOON </h2>");
		else if(hr <= 20)
			pw.println("<h2>GOOD EVENING </h2>");
		else{
			pw.println("<h2>GOOD NIGHT</h2>");
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		doGet(req,res);
	}
}
