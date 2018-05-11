package edu.zut.cs.emotion.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cd.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.admin.damain.Testdemo;
import edu.zut.cs.emotion.admin.dao.TestdemoDao;
import edu.zut.cs.emotion.data.service.TestdemoManager;

@Component
public class TestdemoManagerImpl extends GenericManagerImpl<Testdemo, Long>implements TestdemoManager{
	TestdemoDao testdemoDao;

	@Autowired
	public void setTestdemoDao(TestdemoDao testdemoDao) {
		this.testdemoDao = testdemoDao;
		this.dao=this.testdemoDao;
	}

	
}
