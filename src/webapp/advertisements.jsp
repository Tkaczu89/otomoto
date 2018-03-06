<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Łukasz
  Date: 04.03.2018
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>KOMIS</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
<table class="table table-striped table-dark">
    <thead>
    <tr>
        <th scope="col">Price</th>
        <th scope="col">Mark</th>
        <th scope="col">Model</th>
        <th scope="col">Mileage</th>
        <th scope="col">Production year</th>
        <th scope="col">Link</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${advertisements}" var="advertisement">
        <tr>
            <td>${advertisement.price}</td>
            <td>${advertisement.car.mark}</td>
            <td>${advertisement.car.model}</td>
            <td>${advertisement.car.mileage}</td>
            <td>${advertisement.car.year}</td>
            <td><a href="#"><span class="glyphicon glyphicon-circle-arrow-right"></span> Advert</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>
