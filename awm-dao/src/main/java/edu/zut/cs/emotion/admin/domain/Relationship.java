package edu.zut.cs.emotion.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;

@Table(name="RELATIONSHIP_2")
@Entity
public class Relationship extends BaseEntity {
	private static final long serialVersionUID = 8462412232619290034L;
	@Column(name="SYNSETS")
	private String synset;
	@Column(name="PREDICATE")
	private String predicate;
	@Column(name="RELATIONSHIP_ID")
	private int relationship_id;
	@Column(name="OBJECT_ID")
	private int object_id;
	@Column(name="SUBJECT_ID")
	private int subject_id;
	@Column(name="IMAGE_ID")
	private int image_id;
	@Column(name="H")
	private int h;
	@Column(name="NAMES")
	private String names;
	@Column(name="W")
	private int w;
	@Column(name="Y")
	private int y;
	@Column(name="X")
	private int x;
	@Override
	public String toString() {
		return "Relationship [synset=" + synset + ", predicate=" + predicate + ", relationship_id=" + relationship_id
				+ ", object_id=" + object_id + ", subject_id=" + subject_id + ", image_id=" + image_id + ", h=" + h
				+ ", names=" + names + ", w=" + w + ", y=" + y + ", x=" + x + "]";
	}
	public int getImage_id() {
		return image_id;
	}
	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
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
	public String getSynset() {
		return synset;
	}
	public void setSynset(String synset) {
		this.synset = synset;
	}
	public String getPredicate() {
		return predicate;
	}
	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}
	public int getRelationship_id() {
		return relationship_id;
	}
	public void setRelationship_id(int relationship_id) {
		this.relationship_id = relationship_id;
	}
	public int getObject_id() {
		return object_id;
	}
	public void setObject_id(int object_id) {
		this.object_id = object_id;
	}
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
}
