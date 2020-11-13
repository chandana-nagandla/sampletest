<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>S
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="ISO-8859-1">
<title>foodmenu</title>
</head>
<body>
    <c:forEach items="${foodItems}" var="items"> 
     
    ${items}
     
  </c:forEach>
</body>
</html>