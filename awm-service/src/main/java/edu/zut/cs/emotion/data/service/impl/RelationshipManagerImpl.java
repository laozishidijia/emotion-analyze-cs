package edu.zut.cs.emotion.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cd.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.admin.damain.Relationship;
import edu.zut.cs.emotion.admin.dao.RelationshipDao;
import edu.zut.cs.emotion.data.service.RelationshipManager;
@Component
public class RelationshipManagerImpl extends GenericManagerImpl<Relationship,Long>implements RelationshipManager {
	RelationshipDao relationshipDao;

	@Autowired
	public void setRelationshipDao(RelationshipDao relationshipDao) {
		this.relationshipDao = relationshipDao;
		this.dao=this.relationshipDao;
	}
	
}
