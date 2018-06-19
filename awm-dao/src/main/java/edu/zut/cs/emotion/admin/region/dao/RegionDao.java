package edu.zut.cs.emotion.admin.region.dao;

import org.springframework.data.jpa.repository.Query;

import edu.zut.cs.emotion.admin.region.domain.Region;
import edu.zut.cs.emotion.base.dao.GenericDao;

public interface RegionDao extends GenericDao<Region,Long>{
	
	@Query(value="select region from Region region where region.region_id=?1")
	public Region findByRegion_id(Long region_id);

}
