package edu.zut.cs.emotion.descriptions.service;

import edu.zut.cs.emotion.admin.descriptions.domain.Descriptions;
import edu.zut.cs.emotion.base.service.GenericManager;

public interface DescriptionsManager extends GenericManager<Descriptions,Long>{
	public Descriptions findByImage_id(Long image_id);

}