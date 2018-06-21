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

@Table(name = "EMOTION_ANALYZE_SCENE")
@Entity
public class Scene extends BaseEntity {

	private static final long serialVersionUID = -5L;
	@Column(name = "relationshipsId",columnDefinition="LONGTEXT")
	String relationshipsId;
	@Column(name = "imageId")
	Long imageId;
	@Column(name = "objectId",columnDefinition="LONGTEXT")
	String objectsId;

	public String getRelationshipsId() {
		return relationshipsId;
	}

	public void setRelationshipsId(String relationshipsId) {
		this.relationshipsId = relationshipsId;
	}

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public String getObjectsId() {
		return objectsId;
	}

	public void setObjectsId(String objectsId) {
		this.objectsId = objectsId;
	}

}
