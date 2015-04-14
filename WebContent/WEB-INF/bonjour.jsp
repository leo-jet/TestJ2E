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
			<label for="nom"> Nom : </label>
			<input type="text" id="nom" name="nom"/>
		</p>
		<p> 
			<label for="prenom"> Prénom : </label>
			<input type="text" id="prenom" name="prenom"/>
		</p>
		<p> 
			<input type="submit" value="VALIDER"/>
		</p>
	</form>
	
	<ul>
		<c:forEach var="utilisateur" items="${ utilisateurs }">
			<c:out value="Bonjour"></c:out>
			<li><c:out value="${ utilisateur.prenom }"/> <c:out value="${ utilisateur.nom }"/></li>
		</c:forEach>
	</ul>
	
</body>
</html>