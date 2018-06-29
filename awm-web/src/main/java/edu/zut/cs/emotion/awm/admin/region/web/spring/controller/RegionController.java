package edu.zut.cs.emotion.awm.admin.region.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping(value = "/image/", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Page<Region> getJsonAboutImage(@RequestParam(name = "page", defaultValue = "0") String pageNumber)
	{
				
		return page;
		
	}
}
