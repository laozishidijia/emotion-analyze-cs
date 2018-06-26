package edu.zut.cs.emotion.awm.admin.image.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.emotion.admin.image.domain.Image;
import edu.zut.cs.emotion.base.web.spring.controller.GenericController;
import edu.zut.cs.emotion.image.service.ImageManager;
@Controller
@RequestMapping("/image")
public class ImageController extends GenericController<Image,Long,ImageManager>{
	
	ImageManager imageManager;
	
	@Autowired
	public void setImageManager(ImageManager imageManager) {
		this.imageManager = imageManager;
		this.manager=this.imageManager;
	}
	@RequestMapping(method=RequestMethod.GET,value="/index.html")
	public String index()
	{
		return "/image/index";
	}

}
