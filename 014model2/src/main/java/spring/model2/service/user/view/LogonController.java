package spring.model2.service.user.view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spring.model2.control.Controller;
import spring.model2.control.ModelAndView;
import spring.model2.service.user.dao.UserDao;
import spring.model2.service.user.vo.UserVO;

public class LogonController implements Controller {


	//@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("[LogonController.getController() start]");
		
		HttpSession session = req.getSession(true);
		
		if (session.isNew()||session.getAttribute("userVO")==null) {
			session.setAttribute("userVO", new UserVO());
			
		}
		//==> ��� 2 : session ObjectScope userVO ����
		UserVO userVO = (UserVO)session.getAttribute("userVO");
		
		String requestPage = "/user/logon.jsp";
		
		if (userVO.isActive()) {
			
			requestPage = "/user/home.jsp";
		}
		
//		RequestDispatcher rd = req.getRequestDispatcher(requestPage);
//		rd.forward(req, res);
		
		System.out.println("[LogonController.getController() end]");
		
		return new ModelAndView(requestPage, "info","LogonController Message] :: Welcome");
		
		}
}// end of class