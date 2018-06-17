package edu.zut.cs.emotion.admin.dao;

import org.springframework.data.jpa.repository.Query;

import edu.zut.cs.emotion.admin.domain.Image;
import edu.zut.cs.emotion.base.dao.GenericDao;

public interface ImageDao extends GenericDao<Image,Long>{
	@Query(value="select image from Image where image.image_id=?1",nativeQuery=true)
	public Image findByImage_id(Long image_id);
	
}
