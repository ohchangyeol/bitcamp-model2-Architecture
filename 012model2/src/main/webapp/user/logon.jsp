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
		 ���̵� : <input id ="userId" type='text' name='userId' value ="" ><br/><br/>
		 �н����� : <input id ="userpwd" type='text' name='userPasswd' value ="" ><br/><br/>
		 <input id="submit" type='submit' name ="submit" value='����' />
		</form>
</body>
</html>