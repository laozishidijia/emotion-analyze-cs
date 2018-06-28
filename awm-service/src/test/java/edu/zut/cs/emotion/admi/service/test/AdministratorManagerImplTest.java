package edu.zut.cs.emotion.admi.service.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.emotion.administrator.service.AdministratorManager;
import edu.zut.cs.emotion.base.service.GenericGenerator;

public class AdministratorManagerImplTest extends GenericGenerator{

	@Autowired
	AdministratorManager administratorManager;
	
	@Test
	public void testFind()
	{
		System.out.println(this.administratorManager.findByUsername("dqq1"));
	}
	
}
