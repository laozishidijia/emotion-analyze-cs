package edu.zut.cs.emotion.admin.dao;

import org.springframework.data.jpa.repository.Query;

import edu.zut.cs.emotion.admin.domain.Image;
import edu.zut.cs.emotion.base.dao.GenericTreeDao;

public interface ImageDao extends GenericTreeDao<Image,Long>{
	@Query(value="select image from Image image where image.image_id=?1")
	public Image findByImage_id(Long image_id);
	
}
