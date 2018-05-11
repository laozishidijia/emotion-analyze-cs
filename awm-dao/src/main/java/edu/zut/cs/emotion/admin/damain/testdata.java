package edu.zut.cs.emotion.admin.damain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;

@Table(name = "testData")
@Entity
public class testdata extends BaseEntity {

	private static final long serialVersionUID = -1751952224371998469L;
	
	@Column(name = "Sentence1")
	private String Sentence1;
	
	@Column(name = "Sentence2")
	private String Sentence2;

	@Column(name = "Label")
	private int Label;

	public String getSentence1() {
		return Sentence1;
	}

	public void setSentence1(String sentence1) {
		Sentence1 = sentence1;
	}

	public String getSentence2() {
		return Sentence2;
	}

	public void setSentence2(String sentence2) {
		Sentence2 = sentence2;
	}

	public int getLabel() {
		return Label;
	}

	public void setLabel(int label) {
		Label = label;
	}



}
