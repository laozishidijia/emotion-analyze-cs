package edu.zut.cs.emotion.admin.image.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import edu.zut.cs.emotion.admin.region.domain.Region;
import edu.zut.cs.emotion.admin.relationships.domain.Relationship;
import edu.zut.cs.emotion.base.domain.BaseTreeEntity;

@Table(name="EMOTION_ANALYZE_IMAGE")
@Entity
public class Image extends BaseTreeEntity<Image>{

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
	
	@OneToMany(mappedBy = "image", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	Set<Relationship> relationships;
	
	@OneToMany(mappedBy = "image", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	Set<Region> regions; 
	
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

	@Override
	public String toString() {
		return "Image [image_id=" + image_id + ", url=" + url + ", width=" + width + ", height=" + height + ", coco_id="
				+ coco_id + ", flickr_id=" + flickr_id + "]";
	} 
	
}
