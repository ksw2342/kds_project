<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../css/vendor/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="../css/vendor/font-awesome.min.css" type="text/css" rel="stylesheet">
<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600' rel='stylesheet' type='text/css'>
<link href="../css/jquery.bdt.min.css" type="text/css" rel="stylesheet">
<link href="../css/style.css" type="text/css" rel="stylesheet">
<title>Application</title>
</head>
<body>
<div class="container">
    <div class="row">
            <div class="box clearfix">
            <h1> Management</h1>
		<h2>
			<form action="<c:url value="/list"/>" method="post">
				<input type="date" name="start" /> <input type="date" name="end" />
				<input type="submit" name="inquery" value="조회" />
			</form>
		</h2>
            <div class="table-header"><div class="pull-left"></div></div>
	
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