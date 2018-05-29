package edu.zut.cs.emotion.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.emotion.admin.dao.QuestionAnDao;
import edu.zut.cs.emotion.admin.domain.QuestionAn;
import edu.zut.cs.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.data.service.QuestionAnManager;

@Service
public class QuestionAnMangerImpl extends GenericManagerImpl<QuestionAn,Long>implements QuestionAnManager{
	QuestionAnDao questionAnDao;
	@Autowired
	public void setQuestionAnDao(QuestionAnDao questionAnDao)
	{
		this.questionAnDao=questionAnDao;
		this.dao=this.questionAnDao;
		
	}	
	
}
