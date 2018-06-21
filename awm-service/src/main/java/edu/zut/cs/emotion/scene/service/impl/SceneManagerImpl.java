package edu.zut.cs.emotion.scene.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.emotion.admin.scene.dao.SceneDao;
import edu.zut.cs.emotion.admin.scene.domain.Scene;
import edu.zut.cs.emotion.base.service.impl.GenericManagerImpl;
import edu.zut.cs.emotion.scene.service.SceneManager;
@Component
public class SceneManagerImpl extends GenericManagerImpl<Scene,Long> implements SceneManager {

	SceneDao sceneDao;
	@Autowired
	public void setSceneDao(SceneDao sceneDao) {
		this.sceneDao = sceneDao;
		this.dao = this.sceneDao;
	}

}
