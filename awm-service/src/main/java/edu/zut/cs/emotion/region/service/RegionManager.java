package edu.zut.cs.emotion.region.service;

import java.util.List;

import edu.zut.cs.emotion.admin.region.domain.Region;
import edu.zut.cs.emotion.base.service.GenericManager;

public interface RegionManager extends GenericManager<Region,Long>{
	
	public Region findByRegion_id(Long region_id);
	
	public List<Region> findByImage_id(Long image_id);

}
