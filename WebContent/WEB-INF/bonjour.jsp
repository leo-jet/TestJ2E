<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menujsp.jsp"  %>
	Bonjour � vous
	<p> 
		<%
			String variable = (String) request.getAttribute("variable");
			String name = (String) request.getAttribute("name");
			out.println(name);
		%>
	</p>
</body>
</html>