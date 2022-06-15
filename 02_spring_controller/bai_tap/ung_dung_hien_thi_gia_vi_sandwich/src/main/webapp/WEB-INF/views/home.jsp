
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Sandwich Condiments</h1>
<form action="/save" method="post">
    <div>
        <input type="checkbox" name="check" value="Lettuce"> Lettuce
        <input type="checkbox" name="check" value="Tomato" > Tomato
        <input type="checkbox" name="check" value="Mustard"> Mustard
        <input type="checkbox" name="check" value="Sprouts"> Sprouts
    </div>
    <button type="submit"> Save </button>
</form>
</body>
</html>
