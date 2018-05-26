package edu.zut.cs.emotion.admin.domain;

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
	
	private String synsets;
	
	private String predicate;
	
	private long object_id;
	
	private long subject_id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "region_relationship")
	private Region region_relationship;

	public String getSynsets() {
		return synsets;
	}

	public void setSynsets(String synsets) {
		this.synsets = synsets;
	}

	public String getPredicate() {
		return predicate;
	}

	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}

	public long getObject_id() {
		return object_id;
	}

	public void setObject_id(long object_id) {
		this.object_id = object_id;
	}

	public Region getRegion_relationship() {
		return region_relationship;
	}

	public void setRegion_relationship(Region region_relationship) {
		this.region_relationship = region_relationship;
	}

	public long getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(long subject_id) {
		this.subject_id = subject_id;
	}
	
	

}
