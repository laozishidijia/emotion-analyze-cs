package edu.zut.cs.emotion.awm.main.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.emotion.image.service.ImageManager;
import edu.zut.cs.emotion.region.service.RegionManager;
import edu.zut.cs.emotion.relationships.service.RelationshipManager;

@Controller
@RequestMapping("/main")
public class MainController {

	ImageManager imageManager;
	
	@Autowired
	public void setImageManager(ImageManager imageManager) {
		this.imageManager = imageManager;
	}
	
	RegionManager regionManager;

	@Autowired
	public void setRegionManager(RegionManager regionManager) {
		this.regionManager = regionManager;
	}
	
	RelationshipManager relationshipManager;

	@Autowired
	public void setRelationshipManager(RelationshipManager relationshipManager) {
		this.relationshipManager = relationshipManager;
	}

	
	
    @RequestMapping("/index")
    public String index() {
    	System.out.println(this.imageManager.findByImage_id((long) 1).getId());
        return "main/index";
    }

}
