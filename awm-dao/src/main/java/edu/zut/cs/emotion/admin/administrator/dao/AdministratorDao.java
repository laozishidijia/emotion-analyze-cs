package edu.zut.cs.emotion.admin.administrator.dao;

import org.springframework.data.jpa.repository.Query;

import edu.zut.cs.emotion.admin.administrator.domain.Administrator;
import edu.zut.cs.emotion.base.dao.GenericDao;

public interface AdministratorDao extends GenericDao<Administrator,Long>{
	
	@Query("select administrator from Administrator administrator where administrator.username=?1")
	Administrator findByUsername(String username);

}
