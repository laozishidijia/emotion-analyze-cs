package edu.zut.cs.emotion.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cd.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.admin.damain.Traindemo;
import edu.zut.cs.emotion.admin.dao.TraindemoDao;
import edu.zut.cs.emotion.data.service.TraindemoManager;
@Component
public class TraindemoManagerImpl extends GenericManagerImpl<Traindemo, Long>implements TraindemoManager{
	TraindemoDao traindemodao;
	@Autowired
	public void setTraindemodao(TraindemoDao traindemodao) {
		this.traindemodao = traindemodao;
		this.dao=this.traindemodao;
	}
	
}
