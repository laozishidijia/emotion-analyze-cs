package edu.zut.cs.emotion.admin.relationships.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import edu.zut.cs.emotion.admin.image.domain.Image;
import edu.zut.cs.emotion.admin.object.domain.MyObject;
import edu.zut.cs.emotion.admin.region.domain.Region;
import edu.zut.cs.emotion.base.domain.BaseEntity;
@Table(name="EMOTION_ANALYZE_RELATIONSHIP")
@Entity
public class Relationship extends BaseEntity{
	
	private static final long serialVersionUID = -3L;
	
	@ManyToOne
	@JoinColumn(name="IMAGE_ID",referencedColumnName="IMAGE_ID")
	Image image;
	
	@Column(name="predicate")
	String predicate;
	
	@OneToOne
    @JoinColumn(name="OBJECT_ID")
	MyObject myObject;
	
	@Column(name="relationshipId")
	Long relationshipId;
	
	@Column(name="synsets")
	String synsets;
	
	@OneToOne(mappedBy="relationship")
	Subject subject;
	
	@Column(name="SUBJECT_ID")
	Long subject_id;
	
	@ManyToOne
	@JoinColumn(name = "REGION_ID")
	Region relationship_region;

	public Region getRelationship_region() {
		return relationship_region;
	}

	public void setRelationship_region(Region relationship_region) {
		this.relationship_region = relationship_region;
	}

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

	public Long getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(Long subject_id) {
		this.subject_id = subject_id;
	}
}
