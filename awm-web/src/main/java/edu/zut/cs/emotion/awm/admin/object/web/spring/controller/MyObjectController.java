package edu.zut.cs.emotion.awm.admin.object.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.emotion.admin.object.domain.MyObject;
import edu.zut.cs.emotion.base.web.spring.controller.GenericController;
import edu.zut.cs.emotion.object.service.MyObjectManager;

@Controller
@RequestMapping("/myObject")
public class MyObjectController extends GenericController<MyObject, Long, MyObjectManager>{
	MyObjectManager myObjectManager;
	@Autowired
	public void setMyObjectManager(MyObjectManager myObjectManager) {
		this.myObjectManager = myObjectManager;
		this.manager=this.myObjectManager;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/myObject/index";
		return result;
	}
}
