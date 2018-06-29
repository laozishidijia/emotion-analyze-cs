package edu.zut.cs.emotion.region.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.emotion.admin.region.dao.RegionDao;
import edu.zut.cs.emotion.admin.region.domain.Region;
import edu.zut.cs.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.region.service.RegionManager;

@Component
public class RegionManagerImpl extends GenericManagerImpl<Region,Long> 
							implements RegionManager{

	RegionDao regionDao;
	
	@Autowired
	public void setRegionDao(RegionDao regionDao) {
		this.regionDao = regionDao;
		this.dao=this.regionDao;
	}

	public Region findByRegion_id(Long region_id) {
		Region region=this.regionDao.findByRegion_id(region_id);
		return region;
	}

	public List<Region> findByImage_id(Long image_id) {
		List<Region> regions=this.regionDao.findByImage_id(image_id);
		return regions;
	}

}
