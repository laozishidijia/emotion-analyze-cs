package edu.zut.cs.emotion.awm.admin.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.emotion.admin.relationships.domain.Subject;
import edu.zut.cs.emotion.base.web.spring.controller.GenericController;
import edu.zut.cs.emotion.relationships.service.SubjectManager;

@Controller
@RequestMapping("/subject")
public class SubjectController extends GenericController<Subject, Long, SubjectManager>{
	SubjectManager subjectManager;
	@Autowired
	public void setSubjectManager(SubjectManager subjectManager) {
		this.subjectManager = subjectManager;
		this.manager=this.subjectManager;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/subject/index";
		return result;
	}
}
