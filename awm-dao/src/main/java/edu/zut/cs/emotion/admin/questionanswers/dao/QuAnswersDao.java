package edu.zut.cs.emotion.admin.questionanswers.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import edu.zut.cs.emotion.admin.questionanswers.domain.QuAnswers;
import edu.zut.cs.emotion.base.dao.GenericDao;

public interface QuAnswersDao extends GenericDao<QuAnswers,Long>{
	
	@Query(value="select q from QuAnswers q where q.qa_id=?1")
	public QuAnswers findByQuAnswers_id(Long question_id);
	
	@Query(value="select q from QuAnswers q where q.image_id=?1")
	public List<QuAnswers> findByImage_id(Long image_id);
}
