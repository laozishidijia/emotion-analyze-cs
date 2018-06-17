package edu.zut.cs.emotion.data.service;

import edu.zut.cs.emotion.admin.domain.Image;
import edu.zut.cs.emotion.base.service.GenericManager;

public interface ImageManager extends GenericManager<Image,Long>{
	
	public Image findByImage_id(Long image_id);

}
