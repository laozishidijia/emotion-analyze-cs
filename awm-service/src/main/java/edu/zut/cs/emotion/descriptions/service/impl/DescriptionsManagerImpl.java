package edu.zut.cs.emotion.descriptions.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.emotion.admin.descriptions.dao.DescriptionsDao;
import edu.zut.cs.emotion.admin.descriptions.domain.Descriptions;
import edu.zut.cs.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.descriptions.service.DescriptionsManager;

@Component
public class DescriptionsManagerImpl extends GenericManagerImpl<Descriptions, Long> implements DescriptionsManager {

	DescriptionsDao descriptionsDao;

	@Autowired
	public void setDescriptionsDao(DescriptionsDao descriptionsDao) {
		this.descriptionsDao = descriptionsDao;
		this.dao = this.descriptionsDao;
	}

	@Override
	public Descriptions findByImage_id(Long image_id) {
		// TODO Auto-generated method stub
		return null;
	}


}