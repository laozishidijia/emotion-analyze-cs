package edu.zut.cs.emotion.admin.image.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseTreeEntity;

@Table(name="EMOTION_ANALYZE_IMAGE")
@Entity
@NamedQueries({ @NamedQuery(name = "Image.getRoot", query = "select image from Image image where image.parent is null") })
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
	
	@Column(name="REGION_IDS")
	String region_ids;
	
	@Column(name="QA_IDS",columnDefinition="LONGTEXT")
	String qa_ids;
	
	public String getRegion_ids() {
		return region_ids;
	}

	public void setRegion_ids(String region_ids) {
		this.region_ids = region_ids;
	}

	public String getQa_ids() {
		return qa_ids;
	}

	public void setQa_ids(String qa_ids) {
		this.qa_ids = qa_ids;
	}

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
				+ coco_id + ", flickr_id=" + flickr_id + ", region_ids=" + region_ids + ", qa_ids=" + qa_ids + "]";
	}


	
}
