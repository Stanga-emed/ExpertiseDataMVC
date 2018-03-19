<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste des banques</title>
</head>
<body>
Bonjour, les banques connues:<br /><br />
<table>
<tr>
	<th>ID</th>
	<th>Nom</th>
	<th>Adresse</th>
</tr>
<c:forEach items="${laListeDesBanques}" var="banque">
<tr>
	<td><a href="<c:url value="/banque/" />${banque.id}">${banque.id}</a></td>
	<td>${banque.nom}</td>
	<td>${banque.adresse}</td>
</tr>
</c:forEach>
</table>

</body>
</html>