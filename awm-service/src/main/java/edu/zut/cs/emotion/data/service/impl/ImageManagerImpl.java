package edu.zut.cs.emotion.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.emotion.admin.dao.ImageDao;
import edu.zut.cs.emotion.admin.domain.Image;
import edu.zut.cs.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.data.service.ImageManager;

@Component
public class ImageManagerImpl extends GenericManagerImpl<Image,Long> implements ImageManager{

	ImageDao imageDao;
	
	@Autowired
	public void setImageDao(ImageDao imageDao) {
		this.imageDao = imageDao;
		this.dao=this.imageDao;
	}

	public Image findByImage_id(Long image_id) {
		Image image=this.imageDao.findByImage_id(image_id);
		return image;
	}

}
