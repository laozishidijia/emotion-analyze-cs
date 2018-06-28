package edu.zut.cs.emotion.admin.attributes.dao;

import org.springframework.data.jpa.repository.Query;

import edu.zut.cs.emotion.admin.attributes.domain.Attributes;
import edu.zut.cs.emotion.base.dao.GenericDao;

public interface AttributesDao extends GenericDao<Attributes, Long>{
	@Query(value="slect attribute from Attributes attribute where attribute.image_id=?1")
	public Attributes findByAttributesId(Long image_id);
}
