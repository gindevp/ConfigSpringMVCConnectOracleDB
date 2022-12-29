<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Hello spring5</title>
</head>
<body>
<h2>${helloWorld.message}</h2>
<h4>Server time ${helloWorld.datetime}</h4>
</body>
</html>