<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 19/05/2025
  Time: 10:20 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head><title>Kết Quả Đặt Vé</title></head>
<body>
<h2>Thông tin vé của bạn</h2>
<p>Tên phim: ${ticket.movieTitle}</p>
<p>Thời gian chiếu: ${ticket.showTime}</p>
<p>Ghế đã chọn:</p>
<ul>
    <c:forEach var="seat" items="${ticket.seats}">
        <li>${seat.seatNumber}</li>
    </c:forEach>
</ul>
<p>Tổng tiền: ${ticket.totalAmount} VND</p>
</body>
</html>