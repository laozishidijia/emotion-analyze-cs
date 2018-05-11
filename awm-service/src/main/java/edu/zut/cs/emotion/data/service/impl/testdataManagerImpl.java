package edu.zut.cs.emotion.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cd.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.admin.damain.testdata;
import edu.zut.cs.emotion.admin.dao.testdataDao;
import edu.zut.cs.emotion.data.service.testdataManager;
@Component
public class testdataManagerImpl extends GenericManagerImpl<testdata, Long>implements testdataManager {

	testdataDao testDao;
	@Autowired
	public void setTrainDao(testdataDao TestDao) {
		this.testDao = TestDao;
		this.dao = this.testDao;
	}
}
