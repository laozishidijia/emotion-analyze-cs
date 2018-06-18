package edu.zut.cs.emotion.admin.relationships.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import edu.zut.cs.emotion.admin.domain.Image;
import edu.zut.cs.emotion.admin.object.domain.MyObject;
import edu.zut.cs.emotion.base.domain.BaseEntity;
@Table(name="EMOTION_ANALYZE_RELATIONSHIP")
@Entity
public class Relationship extends BaseEntity{
	
	private static final long serialVersionUID = -2L;
	
	@ManyToOne
	@JoinColumn(name = "IMAGE_ID")
	Image image;
	
	@Column(name="predicate")
	String predicate;
	
	 @OneToOne(cascade={CascadeType.ALL})
     @JoinColumn(name="OBJECT_ID")
	MyObject myObject;
	
	@Column(name="relationshipId")
	Long relationshipId;
	
	@Column(name="synsets")
	String synsets;
	
	@OneToOne(cascade={CascadeType.ALL})
	@PrimaryKeyJoinColumn(name = "relationshipId", referencedColumnName="ID")
	Subject subject;

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getPredicate() {
		return predicate;
	}

	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}

	public MyObject getMyObject() {
		return myObject;
	}

	public void setMyObject(MyObject myObject) {
		this.myObject = myObject;
	}

	public Long getRelationshipId() {
		return relationshipId;
	}

	public void setRelationshipId(Long relationshipId) {
		this.relationshipId = relationshipId;
	}

	public String getSynsets() {
		return synsets;
	}

	public void setSynsets(String synsets) {
		this.synsets = synsets;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
}
