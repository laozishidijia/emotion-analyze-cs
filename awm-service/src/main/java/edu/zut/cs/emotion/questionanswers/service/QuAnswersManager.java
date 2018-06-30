package edu.zut.cs.emotion.questionanswers.service;

import java.util.List;

import edu.zut.cs.emotion.admin.questionanswers.domain.QuAnswers;
import edu.zut.cs.emotion.base.service.GenericManager;

public interface QuAnswersManager extends GenericManager<QuAnswers,Long>{
	public QuAnswers findByQuAnswers_id(Long question_id);
	public List<QuAnswers> findByImage_id(Long image_id);
}
