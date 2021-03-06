package edu.zut.cs.emotion.awm.admin.qa.web.spring.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	//通过question_id请求json数据
	@RequestMapping(value = "/qa/{question_id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public QuAnswers getOne(@PathVariable Long question_id) {
		return qaManager.findByQuAnswers_id(question_id);
	}
	//通过/image/image_id.json的请求方式返回image_id的所有question and answer
	@RequestMapping(value = "/image/{image_id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<QuAnswers> getList(@PathVariable Long image_id) {
		List<QuAnswers> qaList = new ArrayList<QuAnswers>();
		qaList= qaManager.findByImage_id(image_id);
		return qaList;
	}
}
