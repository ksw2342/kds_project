<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="<c:url value="/input"/>" method="post">
	
		ID : <input type="text" name="id" placeholder="ID"><br>
		이름 : <input type="text" name="name" placeholder="이름"><br>
		전화번호 : <input type="text" name="phone" placeholder="전화번호"><br>
		<input type="reset" value="RESET"><input type="submit" value="SUBMIT">
	</form>
</body>
</html>