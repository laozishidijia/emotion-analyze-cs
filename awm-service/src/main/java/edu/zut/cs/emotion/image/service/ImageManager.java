package edu.zut.cs.emotion.image.service;

import edu.zut.cs.emotion.admin.image.domain.Image;
import edu.zut.cs.emotion.base.service.GenericTreeManager;

public interface ImageManager extends GenericTreeManager<Image,Long>{
	
	public Image findByImage_id(Long image_id);

}
