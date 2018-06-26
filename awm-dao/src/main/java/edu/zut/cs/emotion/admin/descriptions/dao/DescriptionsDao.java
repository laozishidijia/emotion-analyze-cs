package edu.zut.cs.emotion.admin.descriptions.dao;

import org.springframework.data.jpa.repository.Query;

import edu.zut.cs.emotion.admin.descriptions.domain.Descriptions;
import edu.zut.cs.emotion.base.dao.GenericDao;

public interface DescriptionsDao extends GenericDao<Descriptions,Long>{
	@Query(value="select image from Descriptions image where image.image_id=?1")
	public Descriptions findByImage_id(Long image_id);
	
}