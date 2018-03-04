<%@page language="java" contentType="text/html" %>

<html>
<head>
    <title>Serwis samochodowy</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h1 align="center">Dodaj samochod do bazy danych:</h1>
<p>${info}</p>
<form action="/auto" method="post">
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
    <br><br>
    <button type="submit" class="btn btn-primary">Dodaj</button>
</form>
</body>
</html>