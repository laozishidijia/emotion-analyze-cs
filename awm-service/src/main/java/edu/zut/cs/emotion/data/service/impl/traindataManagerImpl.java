package edu.zut.cs.emotion.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.zut.cd.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.admin.damain.TrainData;
import edu.zut.cs.emotion.admin.dao.traindataDao;
import edu.zut.cs.emotion.data.service.traindataManager;

@Component
public class traindataManagerImpl extends GenericManagerImpl<TrainData, Long>implements traindataManager {
	
	traindataDao trainDao;
	@Autowired
	public void setTrainDao(traindataDao trainDao) {
		this.trainDao = trainDao;
		this.dao = this.trainDao;
	}
	
	
}
