<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>고객등록/변경</title>
</head>
<body>
	<center><br><br>
		<caption>
			<h2>고객등록/변경</h2>
		</caption><br><br>
		
		<form action="<c:url value="/input"/>" method="post" id="joinForm">
			ID : <input type="text" name="id" placeholder="영문+숫자, 4글자 이상" pattern="^[a-z0-9]{4,16}$">
			<input type="button" class="btn btn-theme" style="margin-left:15px;" id="idCheck" value="중복체크"></input><br>
			이름 : <input type="text" name="name" placeholder="이름"><br>
			전화번호 : <input type="text" name="phone" placeholder="'-' 제외 최대 11자" pattern="^[0-9]{10,11}$"><br><br>
			<input type="reset" value="RESET"><input type="submit" value="등록">
		</form>		
	</center>
</body>
</html>