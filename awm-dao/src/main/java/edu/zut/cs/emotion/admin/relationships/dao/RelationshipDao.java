package edu.zut.cs.emotion.admin.relationships.dao;
import org.springframework.data.jpa.repository.Query;
import edu.zut.cs.emotion.admin.relationships.domain.Relationship;
import edu.zut.cs.emotion.base.dao.GenericDao;



public interface RelationshipDao extends GenericDao<Relationship,Long> {
	
	@Query(value="select relationship from Relationship relationship where relationship.relationshipId=?1")
	public Relationship findByRelationshipId(Long relationshipId);
}
