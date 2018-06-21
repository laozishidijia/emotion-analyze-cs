package edu.zut.cs.emotion.admin.object.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.emotion.admin.image.domain.Image;
import edu.zut.cs.emotion.admin.region.domain.Region;
import edu.zut.cs.emotion.base.domain.BaseEntity;

@Table(name="EMOTION_ANALYZE_MYOBJECTS")
@Entity
public class MyObject extends BaseEntity{

	private static final long serialVersionUID = -1L;
	@ManyToOne
	@JoinColumn(name="IMAGE_ID")
	Image image;
	
	@Column(name="SYNSETS")
	String synsets;
	
	@Column(name="OBJECT_ID")
	Long object_id;
	
	@Column(name="NAMES")
	String names;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="X")
	int x;
	
	@Column(name="Y")
	int y;
	
	@Column(name="W")
	int w;
	
	@Column(name="H")
	int h;
	
	@Column(name="MERGED_OBJECT_IDS")
	String merged_object_ids;
	
	@ManyToOne
	@JoinColumn(name = "Region_ID")
	Region myObject_region;

	public Region getMyObject_region() {
		return myObject_region;
	}

	public void setMyObject_region(Region myObject_region) {
		this.myObject_region = myObject_region;
	}
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSynsets() {
		return synsets;
	}

	public void setSynsets(String synsets) {
		this.synsets = synsets;
	}

	public Long getObject_id() {
		return object_id;
	}

	public void setObject_id(Long object_id) {
		this.object_id = object_id;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
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

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public String getMerged_object_ids() {
		return merged_object_ids;
	}

	public void setMerged_object_ids(String merged_object_ids) {
		this.merged_object_ids = merged_object_ids;
	}

}
