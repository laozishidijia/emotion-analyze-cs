package edu.zut.cs.emotion.awm.admin.region.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.emotion.admin.region.domain.Region;
import edu.zut.cs.emotion.base.web.spring.controller.GenericController;
import edu.zut.cs.emotion.region.service.RegionManager;

@Controller
@RequestMapping("/region")
public class RegionController extends GenericController<Region,Long,RegionManager>{

	RegionManager regionManager;

	@Autowired
	public void setRegionManager(RegionManager regionManager) {
		this.regionManager = regionManager;
		this.manager=this.regionManager;
	}
	
	@RequestMapping("/index.html")
	public String index()
	{
		return "/region/index";
	}
}
