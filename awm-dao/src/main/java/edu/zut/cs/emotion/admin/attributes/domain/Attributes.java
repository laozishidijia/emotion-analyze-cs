package edu.zut.cs.emotion.admin.attributes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.emotion.admin.image.domain.Image;
import edu.zut.cs.emotion.admin.region.domain.Region;
import edu.zut.cs.emotion.admin.scene.domain.Scene;
import edu.zut.cs.emotion.base.domain.BaseEntity;

@Table(name="EMOTION_ANALYZE_Attributes")
@Entity
public class Attributes extends BaseEntity{
	private static final long serialVersionUID = -3L;
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
	
	@ManyToOne
	@JoinColumn(name = "Region_ID")
	Region myObject_region;
	
	@ManyToOne
	@JoinColumn(name="SCENE_ID")
	Scene scene;

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Region getMyObject_region() {
		return myObject_region;
	}

	public void setMyObject_region(Region myObject_region) {
		this.myObject_region = myObject_region;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}
	

	
}
