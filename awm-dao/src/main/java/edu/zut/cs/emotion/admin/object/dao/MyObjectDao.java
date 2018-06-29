package edu.zut.cs.emotion.admin.object.dao;

import org.springframework.data.jpa.repository.Query;

import edu.zut.cs.emotion.admin.object.domain.MyObject;
import edu.zut.cs.emotion.base.dao.GenericDao;

public interface MyObjectDao extends GenericDao<MyObject,Long>{
	
	@Query(value="select myObject from MyObject myObject where myObject.object_id=?1")
	public MyObject findByObject_id(Long object_id);
	
}
