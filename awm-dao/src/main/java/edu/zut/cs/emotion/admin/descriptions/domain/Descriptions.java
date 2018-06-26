package edu.zut.cs.emotion.admin.descriptions.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;

@Table(name="EMOTION_ANALYZE_DESCRIOTIONS")
@Entity
public class Descriptions extends BaseEntity{
	private static final long serialVersionUID = 1L;
	@Column(name="REGION_ID")
	int region_id;
	@Column(name="WIDTH")
	int width;
	@Column(name="HEIGHT")
	int height;
	@Column(name="IMAGE_ID")
	int image_id;
	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}
	@Column(name="PHRASE")
	String phrase;
	@Column(name="Y")
	int y;
	@Column(name="X")
	int x;
	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "Region [region_id=" + region_id + ", width=" + width + ", height=" + height
				+ ", phrase=" + phrase + ", y=" + y + ", x=" + x + ", image_id=" + image_id + "]";
	}
	
	
}