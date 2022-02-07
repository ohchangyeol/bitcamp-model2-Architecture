<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="spring.model1.service.user.vo.UserVO"%>

<% UserVO userVO = (UserVO)session.getAttribute("userVO"); %>


<% if(userVO == null || !userVO.isActive()){%>
		<jsp:forward page = "logon.jsp"/>
	<%} %>
	
<html>
	<head></head>
	<body>
		<p>Simplemodel2 Examples</p>
		<p>환영합니다. : <%= userVO.getUserId() %>사마</p>
	</body>
</html>
	