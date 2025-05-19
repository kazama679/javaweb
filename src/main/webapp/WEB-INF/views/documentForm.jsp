<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 19/05/2025
  Time: 9:25 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Upload Document</h2>
<c:if test="${not empty message}">
  <p>${message}</p>
</c:if>
<form:form modelAttribute="document" action="uploadDocument" method="post" enctype="multipart/form-data">
  Tiêu đề: <form:input path="title"/> <br>
  Mô tả: <form:textarea path="description"></form:textarea> <br>
  File: <input type="file" name="file"/> <br>
  <button type="submit">Upload</button>
</form:form>
</body>
</html>