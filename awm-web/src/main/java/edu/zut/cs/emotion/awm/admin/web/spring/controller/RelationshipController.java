package edu.zut.cs.emotion.awm.admin.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.emotion.admin.relationships.domain.Relationship;
import edu.zut.cs.emotion.base.web.spring.controller.GenericController;

import edu.zut.cs.emotion.relationships.service.RelationshipManager;

@Controller
@RequestMapping("/relationships")
public class RelationshipController extends GenericController<Relationship, Long, RelationshipManager>{
	RelationshipManager relationshipManager;
	@Autowired
	public void setRelationshipManager(RelationshipManager relationshipManager) {
		this.relationshipManager = relationshipManager;
		this.manager=this.relationshipManager;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/relationships/index";
		return result;
	}
}
