<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Tours</title>
</head>
<body>
	<table width="80%" border="1" cellpadding="1" cellspacing="1">
		<tr>
			<th>Chương trình</th>
			<th>Lịch khởi hành</th>
			<th>Giá</th>
			<th>Đặt</th>
		</tr>
		 <c:forEach items="${listTours}" var="tour">
                    <tr>
                        <td>
                        <a href="/tour/${tour.id}">${tour.description}</a>
                        </td>
                        <td>${tour.departureSchedule}</td>
                        <td>${tour.price}</td>
                        <td>
                        <a href="/tour/bookingTour"><input type="button" value="Đặt tour"></a>
                        </td>
                    </tr>
                </c:forEach>
		
	</table>
</body>
</html>