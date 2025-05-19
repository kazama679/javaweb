<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 19/05/2025
  Time: 9:34 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Tạo Dự Án</title>
</head>
<body>
<h2>Tạo Dự Án Mới</h2>

<c:if test="${not empty message}">
    <p style="color:green;">${message}</p>
</c:if>

<form:form modelAttribute="project" method="post" action="createProject" enctype="multipart/form-data">
    Tên dự án: <form:input path="name"/><br/>
    Mô tả: <form:textarea path="description"/><br/>

    <h3>Tài liệu dự án</h3>

    <table id="documentsTable">
        <tr>
            <th>Mô tả</th>
            <th>File</th>
        </tr>
        <tr>
            <td><input type="text" name="documents[0].description"/></td>
            <td><input type="file" name="documents[0].file"/></td>
        </tr>
    </table>

    <button type="button" onclick="addDocument()">Thêm tài liệu</button><br/><br/>

    <button type="submit">Tạo dự án</button>
</form:form>

<script>
    let docIndex = 1;
    function addDocument() {
        const table = document.getElementById('documentsTable');
        const row = table.insertRow(-1);

        const cellDesc = row.insertCell(0);
        const cellFile = row.insertCell(1);

        cellDesc.innerHTML = `<input type="text" name="documents[${docIndex}].description"/>`;
        cellFile.innerHTML = `<input type="file" name="documents[${docIndex}].file"/>`;

        docIndex++;
    }
</script>

</body>
</html>