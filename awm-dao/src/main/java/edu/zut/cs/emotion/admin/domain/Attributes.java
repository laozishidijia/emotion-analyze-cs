package edu.zut.cs.emotion.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;


@Table(name="Attributes")
@Entity

public class Attributes extends BaseEntity{
	private static final long serialVersionUID = 8462412232619290034L;
	
	@Column(name="IMAGE_ID")
	long image_id;
	@Column(name="SYNSETS")
	private String synsets;
	@Column(name="H")
	private String h;
	@Column(name="OBJECT_ID")
	private int object_id;
	@Column(name="Names")
	private String names;
	@Column(name="W")
	private String w;
	@Column(name="Y")
	private String y;
	@Column (name="X")
	private String x;
	
	
	public long getImage_id() {
		return image_id;
	}
	public void setImage_id(long image_id) {
		this.image_id = image_id;
	}
	public String getSynsets() {
		return synsets;
	}
	public void setSynsets(String synsets) {
		this.synsets = synsets;
	}
	public String getH() {
		return h;
	}
	public void setH(String h) {
		this.h = h;
	}
	public int getObject_id() {
		return object_id;
	}
	public void setObject_id(int i) {
		this.object_id = i;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getW() {
		return w;
	}
	public void setW(String w) {
		this.w = w;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	@Override
   public String toString()
   {
		return "Attributes[image_id"+image_id+"synsets"+synsets+"h"+h+"object_id"+object_id+"names"+names+
				"w"+ w +"y"+y+"x"+ x +"]";
   }

}

