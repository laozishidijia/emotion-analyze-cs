package edu.zut.cs.emotion.attributes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.emotion.admin.attributes.dao.AttributesDao;
import edu.zut.cs.emotion.admin.attributes.domain.Attributes;
import edu.zut.cs.emotion.attributes.service.AttributesManager;
import edu.zut.cs.emotion.base.service.impl.GenericManagerImpl;

@Component
public class AttributesManagerImpl extends GenericManagerImpl<Attributes,Long> implements AttributesManager{
	AttributesDao attributesDao;
	@Autowired
	public void setAttributesDao(AttributesDao attributesDao) {
		this.attributesDao=attributesDao;
		this.dao =this.attributesDao;
	}

	
	public Attributes findByAttributesId(Long attributesId) {
		Attributes attributes=attributesDao.findByAttributesId(attributesId);
		return attributes;
		
	}
	
	
	
	

}
