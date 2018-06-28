package edu.zut.cs.emotion.administrator.service;

import edu.zut.cs.emotion.admin.administrator.domain.Administrator;
import edu.zut.cs.emotion.base.service.GenericManager;

public interface AdministratorManager extends GenericManager<Administrator,Long>{
	
	Administrator findByUsername(String username);

}
