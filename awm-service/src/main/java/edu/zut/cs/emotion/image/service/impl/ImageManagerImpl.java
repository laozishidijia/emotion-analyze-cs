package edu.zut.cs.emotion.image.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.emotion.admin.image.dao.ImageDao;
import edu.zut.cs.emotion.admin.image.domain.Image;
import edu.zut.cs.emotion.base.service.impl.GenericTreeManagerImpl;
import edu.zut.cs.emotion.image.service.ImageManager;

@Component
public class ImageManagerImpl extends GenericTreeManagerImpl<Image,Long> implements ImageManager{

	ImageDao imageDao;
	
	@Autowired
	public void setImageDao(ImageDao imageDao) {
		this.imageDao = imageDao;
		this.treeDao=this.imageDao;
		this.dao=this.treeDao;
	}

	public Image findByImage_id(Long image_id) {
		Image image=this.imageDao.findByImage_id(image_id);
		return image;
	}

}