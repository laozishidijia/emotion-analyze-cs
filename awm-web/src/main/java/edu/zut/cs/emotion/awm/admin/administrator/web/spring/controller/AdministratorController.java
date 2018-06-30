package edu.zut.cs.emotion.awm.admin.administrator.web.spring.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.zut.cs.emotion.admin.administrator.domain.Administrator;
import edu.zut.cs.emotion.administrator.service.AdministratorManager;
import edu.zut.cs.emotion.base.web.spring.controller.GenericController;


@Controller
@RequestMapping("/administrator")
public class AdministratorController extends GenericController<Administrator,Long,AdministratorManager>{
	
	AdministratorManager administratorManager;
	@Autowired
	public void setAdministratorManager(AdministratorManager administratorManager) {
		this.administratorManager = administratorManager;
		this.manager=this.administratorManager;
	}
	@RequestMapping(value ="/index.html")
	public String index(HttpServletRequest request)
	{
			if(request.getSession().getAttribute("username")==null)
			{
				return "/administrator/login";
			}else {
				return "/administrator/index";
			}
	}
	@RequestMapping(value ="/login.html",method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request)
	{
			ModelAndView mov = new ModelAndView();
			HttpSession session = request.getSession();
			String result="/administrator/login";
		    String key="98k";
		 	String username=request.getParameter("username");
	        String password=request.getParameter("password");
	        String encodedpassword=DigestUtils.md5Hex(password + key);
	        Administrator admin= administratorManager.findByUsername(username);
	        if(admin.getPassword().equals(encodedpassword))
	        {
	        	session.setAttribute("username", username);
	        	session.setAttribute("password", encodedpassword);
	        	mov.addObject("username", username);
	        	result= "/administrator/index";
	        }
	        mov.setViewName(result);
	    	return mov;
	}
}
