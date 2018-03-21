<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	<center>
		<caption>
			<h2>포인트사용내역조회</h2>
		</caption>
		<br>

		<form action="<c:url value="/point"/>" method="post">

			<input type="String" name="uid" placeholder="User ID" /> <input
				type="date" name="start" /> <input type="date" name="end" /> <input
				type="submit" name="point" value="조회" />
		</form>
		<br>
		<br>
		<div align="center">
			<table border="1" cellpadding="5">

				<tr>
					<th>회원일련번호</th>
					<th>회원명</th>
					<th>승인일</th>
					<th>승인시각</th>
					<th>매출승인번호</th>
					<th>사용가맹점명</th>
					<th>포인트금액</th>
					<th>구분(차감/복원)</th>
				</tr>
				<c:forEach var="list" items="${listPoint}">
					<tr>
						<td><c:out value="${list.u_id}" /></td>
						<td><c:out value="${list.a_num}" /></td>
						<td><c:out value="${list.cardnum}" /></td>
						<td><c:out value="${list.a_date}" /></td>
						<td><c:out value="${list.a_time}" /></td>
						<td><c:out value="${list.mem_store_num}" /></td>
						<td><c:out value="${list.division}" /></td>
						<td><c:out value="${list.point}" /></td>
					</tr>
				</c:forEach>
			</table>
		</div>


	</center>

</body>
</html>