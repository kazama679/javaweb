<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 19/05/2025
  Time: 8:46 SA
  To change this template use File | Settings | File Templates.
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="product" action="productSave" method="post">
    Tên: <form:input path="name"/> <br>
    Giá: <form:input path="price"/> <br>
    Mô trả: <form:input path="des"/> <br>
    <form:button type="submit">Thêm</form:button>
</form:form>
</body>
</html>