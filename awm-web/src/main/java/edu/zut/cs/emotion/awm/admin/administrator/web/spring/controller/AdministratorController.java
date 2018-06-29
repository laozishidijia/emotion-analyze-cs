package edu.zut.cs.emotion.awm.admin.administrator.web.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
			if(request.getSession()==null)
			{
				return "/administrator/index";
			}else {
				return "/administrator/login";
			}
	}
	@RequestMapping(value ="/login.html")
	public String login(HttpServletRequest request)
	{
			String result="/administrator/login";
		    String key="98k";
		 	String username=request.getParameter("username");
	        String password=request.getParameter("password");
	        String encodedpassword=DigestUtils.md5Hex(password + key);
	        Administrator admin= administratorManager.findByUsername(username);
	        if(admin.getPassword().equals(encodedpassword))
	        {
	        	result= "/administrator/index";
	        }
	    	return result;
	}
	
}
