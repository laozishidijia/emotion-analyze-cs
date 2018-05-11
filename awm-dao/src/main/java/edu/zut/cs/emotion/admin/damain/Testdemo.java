package edu.zut.cs.emotion.admin.damain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;
@Table(name = "Question")
@Entity
public class Testdemo extends BaseEntity{
	private static final long serialVersionUID = -1751952224371998469L;
	@Column(name="question")
	String question;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

}
