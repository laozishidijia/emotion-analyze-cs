package edu.zut.cs.emotion.data.service.impl;

import org.junit.Test;
import org.springframework.stereotype.Service;

import edu.zut.cs.emotion.admin.dao.RegionDao;
import edu.zut.cs.emotion.admin.domain.Region;
import edu.zut.cs.emotion.base.service.impl.GenericTreeManagerImpl;
import edu.zut.cs.emotion.data.service.RegionManager;
@Service
public class RegionManagerImpl extends GenericTreeManagerImpl<Region,Long> implements RegionManager{
	RegionDao regionDao;
	@Test
	public void setRegionDao(RegionDao regionDao) {
		this.regionDao = regionDao;
		this.treeDao=this.regionDao;
		this.dao=this.regionDao;
	}
	
}
