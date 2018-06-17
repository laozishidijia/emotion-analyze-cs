package edu.zut.cs.emotion.data.object.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.emotion.admin.object.dao.MyObjectDao;
import edu.zut.cs.emotion.admin.object.domain.MyObject;
import edu.zut.cs.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.data.object.service.MyObjectManager;

@Component
public class MyObjectManagerImpl extends GenericManagerImpl<MyObject,Long> implements MyObjectManager{

	MyObjectDao myObjectDao;

	@Autowired
	public void setMyObjectDao(MyObjectDao myObjectDao) {
		
		this.myObjectDao = myObjectDao;
		this.dao=this.myObjectDao;
		
	}


	public MyObject findByObject_id(Long object_id) {
		
		MyObject myObject=this.myObjectDao.findByObject_id(object_id);
		
		return myObject;
	}

}
