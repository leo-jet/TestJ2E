<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menujsp.jsp"  %>
	<c:if test="${ !empty form.resultat }"><p><c:out value="${ form.resultat }"/></p></c:if>
	<form method="post" action="bonjour">
		<p> 
			<label for="login"> login : </label>
			<input type="text" id="login" name="login"/>
		</p>
		<p> 
			<label for="pass"> mot de pass : </label>
			<input type="password" id="pass" name="pass"/>
		</p>
		<p> 
			<input type="submit" value="VALIDER"/>
		</p>
	</form>
</body>
</html>