package edu.zut.cs.emotion.questionanswers.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.emotion.admin.questionanswers.dao.QuAnswersDao;
import edu.zut.cs.emotion.admin.questionanswers.domain.QuAnswers;
import edu.zut.cs.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.questionanswers.service.QuAnswersManager;

@Component
public class QuAnswersManagerImpl extends GenericManagerImpl<QuAnswers,Long> implements QuAnswersManager{
	QuAnswersDao quanswersdao;
	
	@Autowired
	public void setquan(QuAnswersDao quanswersdao) {
		this.quanswersdao=quanswersdao;
		this.dao=this.quanswersdao;
		
	}
	public QuAnswers findByQuAnswers_id(Long question_id) {
		QuAnswers qa = this.quanswersdao.findByQuAnswers_id(question_id);
		return qa;
	}
	public List<QuAnswers> findByImage_id(Long image_id){
		List<QuAnswers> qaList = this.quanswersdao.findByImage_id(image_id);
		return qaList;
	}

}
