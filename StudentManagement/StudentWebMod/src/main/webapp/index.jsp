
<%@page import="com.nt.service.*"%>
<% 
 StudentService service = new StudentService();
	out.println("studnent Rank::"+service.getRank(101));
%>