package edu.zut.cs.emotion.admin.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseTreeEntity;
@Table(name="EMOTION_ANALYZE_JSON")
@Entity
public class Json extends BaseTreeEntity<Json>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4510982760119097775L;
	/**
	 * 
	 */
	@Column(name="IMAGE_ID")
	long image_id;
	@Column(name="IMAGE_URL")
	String image_url;
	@OneToMany(mappedBy = "json_object", cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE}, fetch = FetchType.EAGER)
	Set<MyObject> myObjects=new HashSet<MyObject>();
	@OneToMany(mappedBy = "json_region", cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE}, fetch = FetchType.EAGER)
	Set<Region> regions=new HashSet<Region>();

	public long getImage_id() {
		return image_id;
	}
	public void setImage_id(long image_id) {
		this.image_id = image_id;
	}
	public Set<Region> getRegions() {
		return regions;
	}
	public void setRegions(Set<Region> regions) {
		this.regions = regions;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public Set<MyObject> getMyObjects() {
		return myObjects;
	}
	public void setMyObjects(Set<MyObject> myObjects) {
		this.myObjects = myObjects;
	}
	
}
