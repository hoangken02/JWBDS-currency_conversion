
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Conversion</title>
</head>
<body>
<h1>Currency Conversion</h1>
<form action="/currency-conversion/result" method="get">
    <label>RATE:</label>
    <input type="text" name="rate" value="22000"><br>
    <label>USD:</label>
    <input type="text" name="usd" placeholder="USD">
    <input type="submit" value="Conversion">
</form>
</body>
</html>
