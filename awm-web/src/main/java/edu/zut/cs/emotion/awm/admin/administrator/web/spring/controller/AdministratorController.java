package edu.zut.cs.emotion.awm.admin.administrator.web.spring.controller;

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
	
	@RequestMapping("/index.html")
	public String index()
	{
		return "/administrator/index";
	}
	
}
