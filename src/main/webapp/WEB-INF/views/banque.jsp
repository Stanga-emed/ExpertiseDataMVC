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
Bonjour, détail bancaire:<br /><br />
<table>
<tr>
	<td><b>ID</b></td>
	<td>${banque.id}</td>
</tr>
<tr>
	<td><b>Nom</b></td>
	<td>${banque.nom}</td>
</tr>
<tr>
	<td><b>Adresse</b></th>
	<td>${banque.adresse}</td>
</tr>
</table>

</body>
</html>