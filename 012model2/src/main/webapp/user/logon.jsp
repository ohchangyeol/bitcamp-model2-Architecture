<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<% //UserVO userVO = (UserVO)session.getAttribute("userVO"); %>



<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<form id="login" method="post" action="/012model2/user/logonAction.do">
		 아이디 : <input id ="userId" type='text' name='userId' value ="" ><br/><br/>
		 패스워드 : <input id ="userpwd" type='text' name='userPasswd' value ="" ><br/><br/>
		 <input id="submit" type='submit' name ="submit" value='전송' />
		</form>
</body>
</html>