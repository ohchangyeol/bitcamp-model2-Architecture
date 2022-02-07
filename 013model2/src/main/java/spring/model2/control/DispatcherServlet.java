package spring.model2.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spring.model2.service.user.dao.UserDao;
import spring.model2.service.user.vo.UserVO;

//@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("\n[ DispatcherServlet.service() start ]");
		
		String actionPage = this.getURI(req.getRequestURI());
		System.out.println("::URI? =>:" +req.getRequestURI());
		System.out.println("::client�� �䱸������? => : " + actionPage);
		
		/// => CONTROLLER :: ��ó��/��������� �ִٸ�
		//=> �� ����: �ѱ�ó�� / SESSION ����, ó�� / ��, ����ó��
		req.setCharacterEncoding("euc-kr");
		
		/// => CONTROLLER :: client �䱸���� ó�� �� Business logic ó��
		Controller controller = null;
		
		ControllerMapping cf = ControllerMapping.getInstance();
		controller = cf.getController(actionPage);
		
		controller.execute(req,res);
		
		System.out.println("[ DispatcherServlet.service() start ]");
		
		
	} // end of service
	
	private String getURI(String requestURI) {
		int start = requestURI.lastIndexOf('/')+1;
		int end = requestURI.lastIndexOf(".do");
		String actionPage = requestURI.substring(start,end);
		return actionPage;
	}

}// end of class