package edu.zut.cs.emotion.questionanswers.service.impl;

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

}
