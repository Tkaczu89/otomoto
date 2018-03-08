<%@page language="java" contentType="text/html" %>

<html>
<head>
    <title>Komis samochodwy</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <h1 align="center">Add an advertisement</h1>
    ${info}
    <form method="post">
        <div class="form-group">

            <label for="descriptionId">Advertisement description</label>
            <textarea name="description" class="form-control" rows="5" id="descriptionId" placeholder="Tutaj wpisz opis ogloszenia"></textarea>

            <label for="priceId">Car price: </label>
            <input name="price" type="text" class="form-control" id="priceId"
                   placeholder="Tutaj wpisz cene samochodu">

            <label for="markId">Car mark: </label>
            <input name="mark" type="text" class="form-control" id="markId"
                   placeholder="Tutaj wpisz marke samochodu">

            <label for="modelId">Car model: </label>
            <input name="model" type="text" class="form-control" id="modelId"
                   placeholder="Tutaj wpisz model samochodu">

            <label for="yearId">Production year: </label>
            <input name="year" type="text" class="form-control" id="yearId"
                   placeholder="Tutaj wpisz rok produkcji samochodu">

            <label for="mileageId">Car mileage:</label>
            <input name="mileage" type="text" class="form-control" id="mileageId"
                   placeholder="Tutaj wpisz przebieg samochodu">

            <label for="vinId">Vin number: </label>
            <input name="vin" type="text" class="form-control" id="vinId"
                   placeholder="Tutaj wpisz nr vin samochodu">


            <label for="userFirsNameId">Your first name: </label>
            <input name="firstName" type="text" class="form-control" id="userFirsNameId"
                   placeholder="Tutaj wpisz swoje imie">

            <label for="userLastNameId">Your last name: </label>
            <input name="lastName" type="text" class="form-control" id="userLastNameId"
                   placeholder="Tutaj wpisz swoje nazwisko">

            <button type="submit" class="btn btn-block">Add</button>
        </div>
    </form>
</div>
</body>
</html>