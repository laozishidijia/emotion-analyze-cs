package edu.zut.cs.eomtion.dao.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.emotion.admin.damain.Json;
import edu.zut.cs.emotion.admin.dao.JsonDao;
import edu.zut.cs.emotion.base.dao.GenericTreeDaoTestCase;


public class JsonDaoTest extends GenericTreeDaoTestCase<Long, Json, JsonDao>{
	JsonDao jsonDao;
	@Autowired
	public void setJsonDao(JsonDao jsonDao) {
		this.jsonDao = jsonDao;
		this.dao=this.jsonDao;
	}
	@Test
	public void getRoot() {
		int root_size=10;
		for(int i=0;i<root_size;i++)
		{
			Json json=new Json();
			json.setImage_id(i);
			this.jsonDao.save(json);
		}
	}

}
