<%@ page language="java" contentType="text/html; charset=EUC-KR"%>



<% 
	//UserVO userVO = (UserVO)session.getAttribute("userVO");
%>

<html>
<head></head>
<body>
		
<h2>Login ȭ��</h2>
		
	<%	//if(userVO==null||userVO.isActive()!=true){%>
	
		<!-- <form id = "login" method="post" action="/011model1/user/logonAction.jsp"> -->
		 <form id = "login" method="post" action="/014model2/logonAction.do">
		
			�� �� �� : <input id="userId" type="text" name="userId" value=""><br><br/>
			�н����� : <input id="userId" type="text" name="userPasswd" value=""><br><br/>
			<input id="submit" type="submit" name="submit" value="Enter"/>
			
		</form>
	
	<%//} else {%>
		
		<%--<%= userVO.getUserId() %>���� �̹� �α��� �ϼ̽��ϴ�.--%>
			
	<%//}%>
	<br/><br/>

	<hr/>
	:: info <%= request.getAttribute("info") %>
	<hr/>	

</body>
</html>
	