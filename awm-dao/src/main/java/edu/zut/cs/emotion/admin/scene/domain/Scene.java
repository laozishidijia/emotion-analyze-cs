package edu.zut.cs.emotion.admin.scene.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import edu.zut.cs.emotion.admin.relationships.domain.Relationship;
import edu.zut.cs.emotion.base.domain.BaseEntity;

@Table(name="EMOTION_ANALYZE_SCENE")
@Entity
public class Scene extends BaseEntity{
	
	private static final long serialVersionUID = -5L;
	
	@OneToMany(mappedBy = "sence", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	Set<Relationship> relationshipList;
	
	@OneToMany(mappedBy = "sence", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	Set<Object> objectsList;
	
	@Column(name="image_id")
	String imageId;

	public Set<Relationship> getRelationshipList() {
		return relationshipList;
	}

	public void setRelationshipList(Set<Relationship> relationshipList) {
		this.relationshipList = relationshipList;
	}

	public Set<Object> getObjectsList() {
		return objectsList;
	}

	public void setObjectsList(Set<Object> objectsList) {
		this.objectsList = objectsList;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	@Override
	public String toString() {
		return "Scene [relationshipList=" + relationshipList + ", objectsList=" + objectsList + ", imageId=" + imageId
				+ "]";
	}

}
