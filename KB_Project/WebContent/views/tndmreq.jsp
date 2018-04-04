<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>포인트 요청 처리 화면</title>
</head>
<body>
   <center><br><br>
      <caption>
         <h2>포인트 요청 테스트</h2>
      </caption><br><br>
      
      <form action="<c:url value="/tndm_req"/>" method="post">
         <input type="submit" value="요청">
      </form>      
      
   </center>
</body>
</html>