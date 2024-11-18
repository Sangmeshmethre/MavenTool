

<%@page import="com.nt.service.*" %>

<h1> From Module3:: Sum is</h1>

<%
ArthmeticOpartions ar = new ArthmeticOpartions();
int result = ar.sum(101, 102);
%>

<h1> From Module3:: Sum is::<%=result%></h1>

