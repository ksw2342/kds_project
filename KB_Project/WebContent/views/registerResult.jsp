<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Books Store Application</title>
</head>
<body>
	<center>
		<h1>Users Management</h1>
		<h2>
			<a href="<c:url value="/list"/>">List All User</a>
		</h2>
	</center>
	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>List of Users</h2>
			</caption>
			<tr>
				<th>UID</th>
				<th>ID</th>
				<th>Name</th>
				<th>Phone</th>
				<th>RegiDate</th>
				<th>CardNum</th>
				<th>Point</th>
			</tr>
			<c:forEach var="user" items="${listUser}">
				<tr>
					<td><c:out value="${user.u_id}" /></td>
					<td><c:out value="${user.id}" /></td>
					<td><c:out value="${user.name}" /></td>
					<td><c:out value="${user.phone}" /></td>
					<td><c:out value="${user.regidate}" /></td>
					<td><c:out value="${user.cardnum}" /></td>
					<td><c:out value="${user.point}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>