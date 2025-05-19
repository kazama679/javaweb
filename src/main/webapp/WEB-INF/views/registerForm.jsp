<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 19/05/2025
  Time: 8:55 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="account" action="accountSave" method="post">
    Username: <form:input path="username"/> <br>
    Password: <form:input path="password"/> <br>
    Email: <form:input path="email"/> <br>
    <form:button type="submit">Thêm</form:button>
</form:form>
</body>
</html>