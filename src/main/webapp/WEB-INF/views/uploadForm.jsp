<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 19/05/2025
  Time: 9:08 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Upload Avatar</h2>
<c:if test="${not empty message}">
    <p>${message}</p>
    <c:if test="${not empty username}">
        <p>Username: ${username}</p>
        <img src="${avatarPath}" alt="Avatar" width="150">
    </c:if>
</c:if>
<form:form modelAttribute="userProfile" action="uploadAvatar" method="post" enctype="multipart/form-data">
    Tên người dùng: <form:input path="username"/> <br>
    Ảnh đại diện: <input type="file" name="avatar"/> <br>
    <button type="submit">Upload</button>
</form:form>
</body>
</html>