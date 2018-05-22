package edu.zut.cs.emotion.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cd.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.admin.dao.MyObjectDao;
import edu.zut.cs.emotion.admin.domain.MyObject;
import edu.zut.cs.emotion.data.service.MyObjectManager;

@Service
public class MyObjectManagerImpl extends GenericManagerImpl<MyObject, Long> implements MyObjectManager{
	MyObjectDao myObjectDao;

	@Autowired
	public void setMyObjectDao(MyObjectDao myObjectDao) {
		this.myObjectDao = myObjectDao;
		this.dao=this.myObjectDao;
	}

}
