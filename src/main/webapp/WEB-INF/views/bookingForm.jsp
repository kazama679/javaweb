<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 19/05/2025
  Time: 10:01 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
  <title>Đặt Vé Rạp Phim</title>
</head>
<body>
<h2>Đặt Vé</h2>
<form:form modelAttribute="ticket" action="bookTicket" method="post">
  Tên phim: <form:input path="movieTitle" /> <br><br>

  Thời gian chiếu (dd-MM-yyyy HH:mm): <form:input path="showTime" /> <br><br>

  Chọn ghế:<br>
  <c:forEach var="seat" items="${availableSeats}">
    <input type="checkbox" name="seats" value="${seat.seatNumber}" />${seat.seatNumber} &nbsp;
  </c:forEach>
  <br><br>

  <button type="submit">Đặt vé</button>
</form:form>
</body>
</html>