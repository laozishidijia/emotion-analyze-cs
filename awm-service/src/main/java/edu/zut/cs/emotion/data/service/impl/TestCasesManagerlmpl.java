package edu.zut.cs.emotion.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cd.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.admin.damain.TestCases;
import edu.zut.cs.emotion.admin.dao.TestCasesDao;
import edu.zut.cs.emotion.data.service.TestCasesManager;
@Component
public class TestCasesManagerlmpl extends GenericManagerImpl<TestCases,Long> implements TestCasesManager{
	TestCasesDao testcasesDao;
	
	@Autowired
	public void setTestCasesDao(TestCasesDao testcasesDao)
	{
	this.testcasesDao=testcasesDao;
	this.dao=testcasesDao;
	}
}
