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
		<p>ȯ���մϴ�. : <%= userVO.getUserId() %>�縶</p>
	</body>
</html>
	