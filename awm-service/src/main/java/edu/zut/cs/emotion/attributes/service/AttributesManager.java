package edu.zut.cs.emotion.attributes.service;

import edu.zut.cs.emotion.admin.attributes.domain.Attributes;
import edu.zut.cs.emotion.base.service.GenericManager;

public interface AttributesManager extends GenericManager<Attributes, Long>{

	public Attributes findByAttributesId(Long AttributesId);
}
