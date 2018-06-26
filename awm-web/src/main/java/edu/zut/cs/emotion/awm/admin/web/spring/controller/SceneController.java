package edu.zut.cs.emotion.awm.admin.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.emotion.admin.scene.domain.Scene;
import edu.zut.cs.emotion.base.web.spring.controller.GenericController;
import edu.zut.cs.emotion.scene.service.SceneManager;


@Controller
@RequestMapping("/scene")
public class SceneController extends GenericController<Scene, Long, SceneManager>{
	SceneManager sceneManager;
	@Autowired
	public void setSceneManager(SceneManager sceneManager) {
		this.sceneManager = sceneManager;
		this.manager=this.sceneManager;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/scene/index";
		return result;
	}
}
