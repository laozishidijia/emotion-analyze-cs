package edu.zut.cs.emotion.admin.damain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;

@Table(name="TrainCases")
@Entity
public class TrainCases  extends BaseEntity {
	private static final long serialVersionUID = -1751952224371998469L;
	
	@Column(name="example")
	private String example;
	

	@Column(name="specific")
	private String specific;
	
	@Column(name="sentence")
	private String sentence;
	

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	public String getSpecific() {
		return specific;
	}

	public void setSpecific(String specific) {
		this.specific = specific;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

}
