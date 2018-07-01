package edu.zut.cs.emotion.awm.admin.qa.web.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.emotion.admin.questionanswers.domain.QuAnswers;
import edu.zut.cs.emotion.base.web.spring.controller.GenericController;
import edu.zut.cs.emotion.questionanswers.service.QuAnswersManager;

@Controller
@RequestMapping("/questionanswers")
public class QuestionAndAnswerController extends GenericController<QuAnswers,Long,QuAnswersManager> {

	QuAnswersManager qaManager;
	
	@Autowired
	public void setQaManager(QuAnswersManager qaManager) {
		this.qaManager = qaManager;
		this.manager=this.qaManager;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/questionanswers/index";
		return result;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/list.html")
	public String list() {
		String result = "/questionanswers/list";
		return result;
	}
//	@RequestMapping(value = "/image/{id}", method = RequestMethod.GET,  produces = "application/json", consumes = "application/json")
//	public List<QuAnswers> QAList(@PathVariable Long image_id) {
//		List<QuAnswers> qaList = qaManager.findByImage_id(image_id);
//		System.err.println(qaList.size());
//		return qaList;
//	}

}
