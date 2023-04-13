<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tour Details</title>
</head>
<body>
	<h1>Chương trình chi tiết</h1>
	<h3>
		${tour.description}
	</h3>
	<p>
		Số ngày: ${tour.days}
	</p>
	<p>
		Phương tiện: ${tour.transportation}
	</p>
	<p>
		Lịch khởi hành: ${tour.departureSchedule}
	</p>
</body>
</html>