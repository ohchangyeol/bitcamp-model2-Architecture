package spring.model2.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.ant.jmx.JMXAccessorQueryTask;

import spring.model2.service.user.dao.UserDao;
import spring.model2.service.user.vo.UserVO;


public class ControlServlet extends HttpServlet {

	public void init(ServletConfig sc) throws ServletException {
		super.init(sc);
		
		System.out.println("\n\n =========================== ");
		System.out.println("ControlServlet의 init() method 호출 ");
		System.out.println("\n\n =========================== ");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		
		System.out.println("컨트롤 서비스 메서드 호출 시작 ");
		
		String actionPage = this.getURI(req.getRequestURI());
		System.out.println("URI = "+ req.getRequestURI());
		System.out.println("클라이언트의 요구사항은 ? ="+ actionPage);
		
		req.setCharacterEncoding("euc-kr");
		HttpSession session = req.getSession(true);
		
		String requestPage = "/user/logon.jsp";
		
		if (session.isNew() || session.getAttribute("userVO")== null) {
			session.setAttribute("userVO", new UserVO());
		}
		
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		
		if (userVO != null && userVO.isActive()) {
			requestPage = "/user/home.jsp";
		}else if (actionPage.equals("logon")) {
			
		}else if (actionPage.equals("logonAction")) {
			String userId = req.getParameter("userId");
			String userPasswd = req.getParameter("userPasswd");
			
			userVO.setUserId(userId);
			userVO.setUserPasswd(userPasswd);
			
			UserDao userDao = new UserDao();
			userDao.getUser(userVO);
			
			if (userVO.isActive()) {
				requestPage= "/user/home.jsp";
			}
		}else if(actionPage.equals("home")) {
			
		}
		
		System.out.println("최종 결정된 view 페이지는 : [["+requestPage + ".jsp]]");
		
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher(requestPage);
		rd.forward(req,res);
		
		System.out.println("컨트롤 서비스 메서드 호출 종료 ");
		
	}
	
	private String getURI(String requestURI) {
		int start = requestURI.lastIndexOf('/')+1;
		int end = requestURI.lastIndexOf(".do");
		String actionPage = requestURI.substring(start, end);
		return actionPage;
		
	}
	
	
	
	
}
