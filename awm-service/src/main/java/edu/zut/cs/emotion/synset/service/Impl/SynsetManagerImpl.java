package edu.zut.cs.emotion.synset.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.emotion.admin.synset.dao.SynsetDao;
import edu.zut.cs.emotion.admin.synset.domain.Synset;
import edu.zut.cs.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.synset.service.SynsetManager;

@Component
public class SynsetManagerImpl extends GenericManagerImpl<Synset,Long> implements SynsetManager{

	SynsetDao synsetDao;

	@Autowired
	public void setSynsetDao(SynsetDao synsetDao) {
		
		this.synsetDao = synsetDao;
		
		this.dao=this.synsetDao;
		
	}
	
}
