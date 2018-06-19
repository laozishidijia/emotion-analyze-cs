package edu.zut.cs.emotion.admin.region.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import edu.zut.cs.emotion.admin.image.domain.Image;
import edu.zut.cs.emotion.admin.object.domain.MyObject;
import edu.zut.cs.emotion.admin.relationships.domain.Relationship;
import edu.zut.cs.emotion.admin.synset.domain.Synset;
import edu.zut.cs.emotion.base.domain.BaseEntity;
@Table(name="EMOTION_ANALYZE_REGION")
@Entity
public class Region extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	@Column(name="REGION_ID")
	Long region_id;
	
	@Column(name="WIDTH")
	int width;
	
	@Column(name="HEIGHT")
	int height;
	
	@Column(name="PHRASE")
	String phrase;
	
	@Column(name="X")
	int x;
	
	@Column(name="Y")
	int y;
	
	@ManyToOne
	@JoinColumn(name = "IMAGE_ID")
	Image image;

	@OneToMany(mappedBy = "relationship_region", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	Set<Relationship> relationships;
	
	@OneToMany(mappedBy = "synset_region", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	Set<Synset> synsets;
	
	@OneToMany(mappedBy = "myObject_region", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	Set<MyObject> myObjects;
	
	public Long getRegion_id() {
		return region_id;
	}

	public void setRegion_id(Long region_id) {
		this.region_id = region_id;
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

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String toString() {
		return "Region [region_id=" + region_id + ", width=" + width + ", height=" + height
				+ ", phrase=" + phrase + ", x=" + x + ", y=" + y + ", image=" + image + "]";
	}
	
}
