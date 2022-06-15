<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculator" method="get">
    <input pattern="^[\d]*(.)?[\d]*$" name="number1" type="text" placeholder="enter number" value="${number1}">
    <input pattern="^[\d]*(.)?[\d]*$" name="number2" type="text" placeholder="enter number" value="${number2}">
    <br>
    <input style="margin-top: 1em;" name="operator" type="submit" value="addition">
    <input name="operator" type="submit" value="subtraction">
    <input name="operator" type="submit" value="multiplication">
    <input name="operator" type="submit" value="division">
</form>
<P>result ${operator}: ${result}</P>
</body>
</html>
