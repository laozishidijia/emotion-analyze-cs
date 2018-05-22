package edu.zut.cs.emotion.data.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cd.emotion.base.service.impl.GenericTreeManagerImpl;
import edu.zut.cs.emotion.admin.dao.JsonDao;
import edu.zut.cs.emotion.admin.domain.Json;
import edu.zut.cs.emotion.data.service.JsonManager;

@Service("jsonManager")
@Transactional
public class JsonManagerImpl extends GenericTreeManagerImpl<Json,Long>implements JsonManager{
	JsonDao jsonDao;

	@Autowired
	public void setJsonDao(JsonDao jsonDao) {
		this.jsonDao = jsonDao;
		this.treeDao=this.jsonDao;
		this.dao=this.jsonDao;
	}
	

}
