package edu.zut.cs.emotion.administrator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.emotion.admin.administrator.dao.AdministratorDao;
import edu.zut.cs.emotion.admin.administrator.domain.Administrator;
import edu.zut.cs.emotion.administrator.service.AdministratorManager;
import edu.zut.cs.emotion.base.service.impl.GenericManagerImpl;
@Component
public class AdministratorImpl extends GenericManagerImpl<Administrator,Long> implements AdministratorManager{

	AdministratorDao administratorDao;
	
	@Autowired
	public void setAdministratorDao(AdministratorDao administratorDao) {
		this.administratorDao = administratorDao;
		this.dao=this.administratorDao;
	}


	public Administrator findByUsername(String username) {
		
		Administrator administrator=this.administratorDao.findByUsername(username);
		
		return administrator;
	}

}
