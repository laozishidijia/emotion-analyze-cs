package edu.zut.cs.emotion.relationships.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.emotion.admin.relationships.dao.RelationshipDao;
import edu.zut.cs.emotion.admin.relationships.domain.Relationship;
import edu.zut.cs.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.relationships.service.RelationshipManager;

@Component
public class RelationshipManagerImpl extends GenericManagerImpl<Relationship,Long> implements RelationshipManager {

	RelationshipDao relationshipDao;

	@Autowired
	public void setRelationshipDao(RelationshipDao relationshipDao) {
		this.relationshipDao = relationshipDao;
		this.dao = this.relationshipDao;
	}
	public Relationship findByRelationshipId (Long relationshipId)
	{
		Relationship relationship   = relationshipDao.findByRelationshipId(relationshipId);
		return relationship;
	}
}
