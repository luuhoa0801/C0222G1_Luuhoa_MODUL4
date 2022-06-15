<%--
  Created by IntelliJ IDEA.
  User: Luu Hoa
  Date: 6/15/2022
  Time: 2:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Calculator</h1>
<form action="/calculator" method="post">
    <div>
    <input type="text" name="number1">
    <input type="text" name="number2">
    </div>
    <div>
    <button type="submit" name="check" value="+"> addition(+) </button>
    <button type="submit" name="check" value="-"> subtraction(-) </button>
    <button type="submit" name="check" value="*"> multiplication(x) </button>
    <button type="submit" name="check" value="/"> division(/) </button>
    </div>
    <div>
        <h2> Kết quả : ${result}</h2>
    </div>
</form>
</body>
</html>
