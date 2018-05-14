package edu.zut.cs.emotion.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cd.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.admin.damain.studentdata;
import edu.zut.cs.emotion.admin.dao.studentdataDao;
import edu.zut.cs.emotion.data.service.studentdataManager;
@Component
public class studentdataManagerImpl extends GenericManagerImpl<studentdata, Long>implements studentdataManager {

	studentdataDao studentDao;
	@Autowired
	public void setTrainDao(studentdataDao studentDao) {
		this.studentDao = studentDao;
		this.dao = this.studentDao;
	}
}
