package edu.zut.cs.emotion.data.object.service;

import edu.zut.cs.emotion.admin.object.domain.MyObject;
import edu.zut.cs.emotion.base.service.GenericManager;

public interface MyObjectManager extends GenericManager<MyObject,Long>{

	public MyObject findByObject_id(Long object_id);
	
}
