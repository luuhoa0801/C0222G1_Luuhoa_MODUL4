<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> Settings</h2>
<form:form method="post" action="addEmail" modelAttribute="email">
    <p> Languages:</p>
    <form:select path="languages">
        <form:options items="${listLanguages}"></form:options>
    </form:select>

    <p> Page Size:</p>
    <p>
        <form:select path="pageSize">
            <form:options items="${listSize}"></form:options>
        </form:select>
    </p>
    <p>Spams filter</p>
    <p>
        <form:checkbox path="spamsFilter"></form:checkbox>
    </p>
    <p> Signature</p>
    <form:textarea path="signature"></form:textarea>

    <button value="submit">Update</button>
    <a href="email">Cancel</a>

</form:form>
</body>
</html>
