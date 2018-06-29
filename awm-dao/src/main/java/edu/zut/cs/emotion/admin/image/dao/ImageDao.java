package edu.zut.cs.emotion.admin.image.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.zut.cs.emotion.admin.image.domain.Image;
import edu.zut.cs.emotion.base.dao.GenericTreeDao;

public interface ImageDao extends GenericTreeDao<Image,Long>{
	@Query(value="select image from Image image where image.image_id=?1")
	public Image findByImage_id(Long image_id);
	
	@Modifying
	@Query("update Image image set image.qa_ids = :qa_ids where image.image_id = :image_id")
	public Integer updateQA_ids(@Param("qa_ids")String qa_ids,@Param("image_id")Long image_id);
	
	@Modifying
	@Query("update Image image set image.region_ids = :region_ids where image.image_id = :image_id")
	public Integer updateRegion_ids(@Param("region_ids")String region_ids,@Param("image_id")Long image_id);
	
}
