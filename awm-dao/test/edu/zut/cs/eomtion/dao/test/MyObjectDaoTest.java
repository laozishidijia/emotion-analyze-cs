package edu.zut.cs.eomtion.dao.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.emotion.admin.dao.JsonDao;
import edu.zut.cs.emotion.admin.dao.MyObjectDao;
import edu.zut.cs.emotion.admin.domain.Json;
import edu.zut.cs.emotion.admin.domain.MyObject;
import edu.zut.cs.emotion.base.dao.GenericDaoTestCase;

public class MyObjectDaoTest extends GenericDaoTestCase<Long,MyObject,MyObjectDao>{
	MyObjectDao myObjectDao;
	@Autowired
	public void setMyObjectDao(MyObjectDao myObjectDao) {
		this.myObjectDao = myObjectDao;
	}
	JsonDao jsonDao;
	@Autowired
	public void setJsonDao(JsonDao jsonDao) {
		this.jsonDao = jsonDao;
	}

	@Test
	public void testAddData() {
		Json json=new Json();
		json.setImage_id(12138);
		for(int i=0;i<10;i++)
		{
			MyObject myobject=new MyObject();
			myobject.setJson(json);
			myobject.setX(66);
			this.myObjectDao.save(myobject);
		}
		this.jsonDao.save(json);
	}

}
