package edu.zut.cs.emotion.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cd.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.admin.damain.TestSample;
import edu.zut.cs.emotion.admin.dao.TestSampleDao;
import edu.zut.cs.emotion.data.service.TestSampleManager;

@Component
public class TestSampleManagerImpl extends GenericManagerImpl<TestSample, Long>implements TestSampleManager{
	TestSampleDao TestSampleDao;

	@Autowired
	public void setTestdemoDao(TestSampleDao TestSsampleDao) {
		this.TestSampleDao = TestSampleDao;
		this.dao=this.TestSampleDao;
	}

	
}
