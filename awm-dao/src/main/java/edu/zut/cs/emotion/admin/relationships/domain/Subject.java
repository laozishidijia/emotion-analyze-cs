package edu.zut.cs.emotion.admin.relationships.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;
@Table(name="subject")
@Entity
public class Subject extends BaseEntity {
	private static final long serialVersionUID = 2L;

	@Column(name = "name")
	private String name;

	@Column(name = "h")
	private int h;

	@Column(name = "objectId")
	private Long objectId;

	@Column(name = "synsets")
	private String synsets;

	@Column(name = "w")
	private int w;

	@Column(name = "y")
	private int y;
	
	@Column(name = "x")
	private int x;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "relationshipId",referencedColumnName="relationshipId")
	Relationship relationship;
	
	public Long getObjectId() {
		return objectId;
	}

	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}

	public Relationship getRelationship() {
		return relationship;
	}

	public void setRelationship(Relationship relationship) {
		this.relationship = relationship;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public Long getObject_id() {
		return objectId;
	}

	public void setObject_id(Long object_id) {
		this.objectId = object_id;
	}

	public String getSynsets() {
		return synsets;
	}

	public void setSynsets(String synsets) {
		this.synsets = synsets;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
