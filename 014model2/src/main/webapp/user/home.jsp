<%@ page language="java" contentType="text/html; charset=EUC-KR"%>

<%@ page import="spring.model2.service.user.vo.UserVO" %>


<% 
	UserVO userVO = (UserVO)session.getAttribute("userVO");
	
%>


<%
	//if(userVO==null||!userVO.isActive()){%>
		<%-- <jsp:forward page="logon.jsp"/>--%>
	<%//}%>
	

<html>
	<head></head>
	<body>
		<p>Simple Model2 Examples</p>
		<p> ȯ���մϴ�. : <%=userVO.getUserId() %>��</p>
		
		<br/><br/>
		<hr/>
		:: info <%= request.getAttribute("info") %>
		<hr/>
	</body>
</html>
