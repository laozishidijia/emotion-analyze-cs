package edu.zut.cs.emotion.data.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cd.emotion.base.service.GenericGenerator;
import edu.zut.cs.emotion.admin.damain.TestCases;

public class TestCasesManagerTest extends GenericGenerator {

	
	@Autowired
	TestCasesManager testcaseManager;
	@Test
	public void testresource()
	{
		for(int i=0;i<100;i++)
		{
		TestCases test=new TestCases();

		test.setExample(""+i);
		this.testcaseManager.save(test);
		}
	}
	

}
