package edu.zut.cs.emotion.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;
@Table(name="EMOTION_ANALYZE_MYOBJECT")
@Entity
public class MyObject extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8462412232619290034L;
	@Column(name="SYNSETS",columnDefinition="LONGTEXT")
	String synsets;
	@Column(name="H")
	int h;
	@Column(name="OBJECT_ID")
	long object_id;
	@Column(name="MERGED_OBJECT_IDS",columnDefinition="LONGTEXT")
	String merged_object_ids;
	@Column(name="NAMES",columnDefinition="LONGTEXT")
	String names;
	@Column(name="W")
	int w;  
	@Column(name="Y")
	int y;
	@Column(name="X")
	int x;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JSON_ID")
	Json json_object;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Region_ID")
	Region region_object;

	public Json getJson_object() {
		return json_object;
	}
	public void setJson_object(Json json_object) {
		this.json_object = json_object;
	}
	public String getSynsets() {
		return synsets;
	}
	public void setSynsets(String synsets) {
		this.synsets = synsets;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public long getObject_id() {
		return object_id;
	}
	public void setObject_id(long object_id) {
		this.object_id = object_id;
	}

	public String getMerged_object_ids() {
		return merged_object_ids;
	}
	public void setMerged_object_ids(String merged_object_ids) {
		this.merged_object_ids = merged_object_ids;
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
	public Region getRegion_object() {
		return region_object;
	}
	public void setRegion_object(Region region_object) {
		this.region_object = region_object;
	}
	
}