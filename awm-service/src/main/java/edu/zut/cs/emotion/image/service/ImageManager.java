package edu.zut.cs.emotion.image.service;

import org.springframework.data.repository.query.Param;

import edu.zut.cs.emotion.admin.image.domain.Image;
import edu.zut.cs.emotion.base.service.GenericTreeManager;

public interface ImageManager extends GenericTreeManager<Image,Long>{
	
	public Image findByImage_id(Long image_id);
	
	public Integer updateQA_ids(@Param("qa_ids")String qa_ids,@Param("image_id")Long image_id);
	
	public Integer updateRegion_ids(@Param("region_ids")String region_ids,@Param("image_id")Long image_id);

}
