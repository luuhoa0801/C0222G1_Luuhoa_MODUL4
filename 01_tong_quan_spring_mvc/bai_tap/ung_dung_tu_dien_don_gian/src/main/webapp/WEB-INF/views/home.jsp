
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

</head>
<body>
<div >
<form action="/tudien" method="post" >
    <h2> Từ điển  </h2>
    <input type="text" name="name" placeholder="Nhập từ" >
<%--    <p>Kết quả: ${name} </p>--%>
    <input type="text" value="${name}">
    <button> Dịch</button>
</form>
</div>
</body>
</html>
