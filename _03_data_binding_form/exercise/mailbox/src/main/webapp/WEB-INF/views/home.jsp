<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="mail" action="/create" method="post">
    <label>languages</label>
    <form:select path="languages">
        <form:options items="${listLanguage}"></form:options>
    </form:select>
    <br>
    <label>pageSize</label>
    <form:select path="pageSize">
        <form:options items="${listPageSize}"></form:options>
    </form:select>
    <br>
    <label>spamFilter</label>
    <form:checkbox path="spamFilter"/>
    <br>
    <label>signature</label>
    <form:textarea type="text" path="signature"/>
    <br>
    <input type="submit" value="update">
</form:form>
<a href="/"><input type="submit" value="cancel"></a>
</body>
</html>