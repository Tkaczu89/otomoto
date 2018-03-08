<%--
  Created by IntelliJ IDEA.
  User: Łukasz
  Date: 08.03.2018
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CAR DEALER</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">

    <label for="descriptionId">Advertisement description</label>
    <div id="descriptionId" class="well well-lg">${advertisement.description}</div>

    <label for="markId">Car mark:</label>
    <div id="markId" class="well well-sm">${advertisement.car.mark}</div>

    <label for="modelId">Car model:</label>
    <div id="modelId" class="well well-sm">${advertisement.car.model}</div>

    <label for="yearId">Production year:</label>
    <div id="yearId" class="well well-sm">${advertisement.car.year}</div>

    <label for="mileageId">Car mileage:</label>
    <div id="mileageId" class="well well-sm">${advertisement.car.mileage}</div>

    <label for="vinId">Car vin number:</label>
    <div id="vinId" class="well well-sm">${advertisement.car.vin}</div>

</div>
</body>
</html>
