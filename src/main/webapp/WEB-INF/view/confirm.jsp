<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirm Tour</title>
</head>
<body>

	<form>
		<h2>Thông tin khách hàng</h2>

		<table>
			<tr>
				<td>Họ tên</td>
				<td><input type="text" name="name" value="${customer.name}" readonly></td>
			</tr>
			<tr>
				<td>Địa chỉ</td>
				<td><input type="text" name="address" value="${customer.address}" readonly></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="${customer.email}" readonly></td>
			</tr>
			<tr>
				<td>Điện thoại</td>
				<td><input type="text" name="phone" value="${customer.phone}" readonly></td>
			</tr>
		</table>

		<h2>Thông tin chuyến đi</h2>
		<table>
			<tr>
				<td>Ngày khởi hành</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td>Số người lớn</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td>Số trẻ em</td>
				<td><input type="text"></td>
			</tr>

		</table>
		
	</form>
</body>
</html>