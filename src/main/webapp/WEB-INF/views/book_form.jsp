<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 16/05/2025
  Time: 4:41 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
book Form
<form:form modelAttribute="book" action="book-save" method="post"
    >
    <p>title: </p>
    <form:input path="title"/>

    <p>ISBN</p>
    <form:input path="ISBN"/>

    <p>Price</p>
    <form:input path="price"/>

    <p>File Image</p>
<%--    <form:input path="fileImage" type="file"/>--%>

<%--    <p>Published Date</p>--%>
<%--    <form:input path="publishedDate" type="data"/>--%>
    <br><button type="submit">Thêm</button>
</form:form>
</body>
</html>