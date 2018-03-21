<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<style>
.menu a {
	cursor: pointer;
}

.menu .hide {
	display: none;
}
</style>
</head>
<body>

	<script>
		$(document).ready(function() {
			$(".menu>a").click(function() {
				$(this).next("ul").toggleClass("hide");
			});
		});
	</script>

	<div>
		<ul>
			<li class="menu"><a>고객</a>
				<ul class="hide">
					<li><a href="inqueryInputForm.jsp" target="screen">고객정보조회</a></li>
					<li><a href="register.jsp" target="screen">고객등록/변경</a></li>
					<li><a href="pointForm.jsp" target="screen">포인트정보조회</li>
				</ul></li>
			<br>

			<li class="menu"><a>승인TNDM</a>
				<ul class="hide">
					<li>승인내역조회</li>
				</ul></li>
			<br>

			<li class="menu"><a>승인HOST</a>
				<ul class="hide">
					<li>승인내역조회</li>
				</ul></li>
			<br>

			<li class="menu"><a>매입/가맹</a>
				<ul class="hide">
					<li>매출전표조</li>
					<li>가맹점 등록/변경</li>
				</ul></li>
			<br>

			<li class="menu"><a>청구/회수</a>
				<ul class="hide">
					<li>청구전표조회</li>
					<li>이용대금명세서조회</li>
				</ul></li>
			<br>


		</ul>
	</div>



</body>
</html>