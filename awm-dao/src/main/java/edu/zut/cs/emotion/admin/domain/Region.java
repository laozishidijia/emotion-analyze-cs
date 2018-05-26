package edu.zut.cs.emotion.admin.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseTreeEntity;
@Table(name="EMOTION_ANALYZE_REGION")
@Entity
public class Region extends BaseTreeEntity<Region>{

	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "region_relationship", cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE}, fetch = FetchType.EAGER)
	private Set<Relationship> relationships=new HashSet<Relationship>();
	@Column(name="REGION_ID")
	private long region_id;
	@Column(name="WIDTH")
	private int width;
	@Column(name="SYNSETS",columnDefinition="LONGTEXT")
	private String synsets;
	@Column(name="HEIGHT")
	private int heigiht;
	@Column(name="IMAGE_ID")
	private long image_id;
	@OneToMany(mappedBy = "region_object", cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE}, fetch = FetchType.EAGER)
	private Set<MyObject> myObjects=new HashSet<MyObject>();
	@Column(name="PHRASE")
	private String phrase;
	@Column(name="X")
	private int x;
	@Column(name="Y")
	private int y;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JSON_ID")
	Json json_region;

	public Set<MyObject> getMyObjects() {
		return myObjects;
	}

	public void setMyObjects(Set<MyObject> myObjects) {
		this.myObjects = myObjects;
	}

	public Json getJson_region() {
		return json_region;
	}

	public void setJson_region(Json json_region) {
		this.json_region = json_region;
	}

	public Set<Relationship> getRelationships() {
		return relationships;
	}

	public void setRelationships(Set<Relationship> relationships) {
		this.relationships = relationships;
	}

	public long getRegion_id() {
		return region_id;
	}

	public void setRegion_id(long region_id) {
		this.region_id = region_id;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getSynsets() {
		return synsets;
	}

	public void setSynsets(String synsets) {
		this.synsets = synsets;
	}

	public int getHeigiht() {
		return heigiht;
	}

	public void setHeigiht(int heigiht) {
		this.heigiht = heigiht;
	}

	public long getImage_id() {
		return image_id;
	}

	public void setImage_id(long image_id) {
		this.image_id = image_id;
	}

	public String getPhrase() {
		return phrase;
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
