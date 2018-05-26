package edu.zut.cs.emotion.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;
@Table(name="EMOTION_ANALYZE_RELATIONSHIP")
@Entity
public class Relationship extends BaseEntity{


	private static final long serialVersionUID = 1L;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REGION_ID")
	private Region region_relationship;
	@Column(name="SYNSETS",columnDefinition="LONGTEXT")
	private String synsets;
	@Column(name="PREDICATE")
	private String predicate;
	@Column(name="RELATIONSHIP_ID")
	private long relationship_id;
	@Column(name="OBJECT_ID")
	private long object_id;
	@Column(name="SUBJECT_ID")
	private long subject_id;
	
	public Region getRegion_relationship() {
		return region_relationship;
	}
	public void setRegion_relationship(Region region_relationship) {
		this.region_relationship = region_relationship;
	}
	public String getPredicate() {
		return predicate;
	}
	
	public long getObject_id() {
		return object_id;
	}
	public void setObject_id(long object_id) {
		this.object_id = object_id;
	}
	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}
	public long getRelationship_id() {
		return relationship_id;
	}
	public void setRelationship_id(long relationship_id) {
		this.relationship_id = relationship_id;
	}
	public long getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(long subject_id) {
		this.subject_id = subject_id;
	}
	public String getSynsets() {
		return synsets;
	}
	public void setSynsets(String synsets) {
		this.synsets = synsets;
	}
	
}
