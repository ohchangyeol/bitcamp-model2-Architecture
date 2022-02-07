package spring.model2.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewResolver {
	//field
	
	//constructor
	public ViewResolver() {
	}
	
	//method
	
	public void forward(HttpServletRequest req, HttpServletResponse res, ModelAndView modelAndView) throws ServletException, IOException {
		System.out.println("[View Resolver.forward() start .......]");
		
		if(modelAndView.getMedelName() != null) {
			
			req.setAttribute(modelAndView.getMedelName(), modelAndView.getMedelObject());
		}	
		
		req.getRequestDispatcher(modelAndView.getViewName()).forward(req,res);
		System.out.println("[View Resolver.forward() end .......]");

	}
}
