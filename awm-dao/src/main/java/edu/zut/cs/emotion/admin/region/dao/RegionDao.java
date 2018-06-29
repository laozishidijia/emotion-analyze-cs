package edu.zut.cs.emotion.admin.region.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import edu.zut.cs.emotion.admin.region.domain.Region;
import edu.zut.cs.emotion.base.dao.GenericDao;

public interface RegionDao extends GenericDao<Region,Long>{
	
	@Query(value="select region from Region region where region.region_id=?1")
	public Region findByRegion_id(Long region_id);
	
	@Query(value="select region from Region region where region.image_id=?1")
	public List<Region> findByImage_id(Long image_id);
}
