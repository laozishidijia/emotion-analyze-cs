package edu.zut.cs.emotion.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cd.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.admin.damain.TrainCases;
import edu.zut.cs.emotion.admin.dao.TrainCasesDao;
import edu.zut.cs.emotion.data.service.TrainCasesManager;

public class TrainCasesManagerlmpl extends GenericManagerImpl<TrainCases,Long> implements TrainCasesManager{

	TrainCasesDao trainCasesdao;
	@Autowired

	public void settrainCasesDao(TrainCasesDao trainCasesdao) {
		this.trainCasesdao=trainCasesdao;
		this.dao=dao;
	}

	
	
	
}
