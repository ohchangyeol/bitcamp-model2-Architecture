<%@page import="spring.model1.service.user.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<% UserVO userVO = (UserVO)session.getAttribute("userVO"); %>



<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% if(userVO == null || userVO.isActive() != true){%>
		<form id="login" method="post" action="/011model1/user/logonAction.jsp">
		 아이디 : <input id ="userId" type='text' name='userId' value ="" ><br/><br/>
		 패스워드 : <input id ="userpwd" type='text' name='userPasswd' value ="" ><br/><br/>
		 <input id="submit" type='submit' name ="submit" value='전송' />
		</form>
	<%}else{ %>
		<%= userVO.getUserId() %> 님은 이미 로그인 하셨습니다.
	<%} %>
</body>
</html>