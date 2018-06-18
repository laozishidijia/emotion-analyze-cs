package edu.zut.cs.emotion.relationships.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.emotion.admin.relationships.dao.SubjectDao;
import edu.zut.cs.emotion.admin.relationships.domain.Subject;
import edu.zut.cs.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.relationships.service.SubjectManager;
@Component
public class SubjectManagerImpl extends GenericManagerImpl<Subject,Long> implements SubjectManager{
	
	SubjectDao subjectDao;
	@Autowired
	public void setSubjectDao(SubjectDao subjectDao) {
		this.subjectDao = subjectDao;
		this.dao = this.subjectDao;
	}
	

}
