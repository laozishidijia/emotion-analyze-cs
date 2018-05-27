package edu.zut.cs.emotion.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.emotion.admin.dao.AttributesDao;
import edu.zut.cs.emotion.admin.domain.Attributes;
import edu.zut.cs.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.data.service.AttributesManager;



@Service
public class AttributesManagerImpl extends GenericManagerImpl<Attributes, Long>implements AttributesManager{
	AttributesDao attributeDao;
	@Autowired
	public void setAttributesDao(AttributesDao attributeDao)
	{
		this.attributeDao=attributeDao;
		this.dao=this.attributeDao;
		
	}

}
