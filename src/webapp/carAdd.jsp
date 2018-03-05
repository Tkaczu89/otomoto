<%@page language="java" contentType="text/html" %>

<html>
<head>
    <title>Komis samochodwy</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <h1 align="center">Dodaj ogloszenie:</h1>
    <p>${info}</p>
    <form action="/addadvertisement" method="post">
        <div class="form-group">
            <label for="formGroupExampleInput">Opis ogloszenia </label>
            <input name="description" type="text" class="form-control" id="formGroupExampleInput"
                   placeholder="Tutaj wpisz opis ogloszenia">
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput">Marka samochodu: </label>
            <input name="mark" type="text" class="form-control" id="formGroupExampleInput"
                   placeholder="Tutaj wpisz marke samochodu">
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput2">Model samochodu:</label>
            <input name="model" type="text" class="form-control" id="formGroupExampleInput2"
                   placeholder="Tutaj wpisz model samochodu">
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput2">Rok produkcji samochodu:</label>
            <input name="year" type="text" class="form-control" id="formGroupExampleInput2"
                   placeholder="Tutaj wpisz rok produkcji samochodu">
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput2">Przebieg samochodu</label>
            <input name="mileage" type="text" class="form-control" id="formGroupExampleInput2"
                   placeholder="Tutaj wpisz przebieg samochodu">
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput2">Nr vin samochodu:</label>
            <input name="vin" type="text" class="form-control" id="formGroupExampleInput2"
                   placeholder="Tutaj wpisz nr vin samochodu">
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput">Twoje imie: </label>
            <input name="firstName" type="text" class="form-control" id="formGroupExampleInput"
                   placeholder="Tutaj wpisz swoje imie">
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput">Twoje nazwisko: </label>
            <input name="lastName" type="text" class="form-control" id="formGroupExampleInput"
                   placeholder="Tutaj wpisz swoje naziwsko">
        </div>
        <br><br>
        <button type="submit" class="btn btn-primary">Dodaj</button>
        <a href="/" name="back" class="btn btn-primary">Wroc</a>
    </form>
</div>
</body>
</html>