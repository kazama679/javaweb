<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 19/05/2025
  Time: 7:30 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="user" action="userSave" method="post">
Tên: <form:input path="name"/> <br>
Tuổi: <form:input path="age"/> <br>
Địa chỉ: <form:input path="address"/> <br>
    <form:button type="submit">Thêm</form:button>
</form:form>
</body>
</html>