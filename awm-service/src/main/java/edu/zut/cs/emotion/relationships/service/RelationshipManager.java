package edu.zut.cs.emotion.relationships.service;

import edu.zut.cs.emotion.admin.relationships.domain.Relationship;
import edu.zut.cs.emotion.base.service.GenericManager;

public interface RelationshipManager extends GenericManager<Relationship,Long> {

	public Relationship findByRelationshipId(Long RelationshipId); 
}
