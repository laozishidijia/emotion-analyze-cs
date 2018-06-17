package edu.zut.cs.emotion.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;

@Table(name="EMOTION_ANALYZE_IMAGE")
@Entity
public class Image extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	
	@Column(name="IMAGE_ID")
	Long image_id;
	
	@Column(name="URL")
	String url;
	
	@Column(name="WIDTH")
	int width;
	
	@Column(name="HEIGHT")
	int height;
	
	@Column(name="COCO_ID")
	Long coco_id;
	
	@Column(name="FLICKR_ID")
	Long flickr_id;

	public Long getImage_id() {
		return image_id;
	}

	public void setImage_id(Long image_id) {
		this.image_id = image_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Long getCoco_id() {
		return coco_id;
	}

	public void setCoco_id(Long coco_id) {
		this.coco_id = coco_id;
	}

	public Long getFlickr_id() {
		return flickr_id;
	}

	public void setFlickr_id(Long flickr_id) {
		this.flickr_id = flickr_id;
	} 
	
}