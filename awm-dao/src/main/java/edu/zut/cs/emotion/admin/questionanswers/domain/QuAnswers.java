package edu.zut.cs.emotion.admin.questionanswers.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.emotion.admin.image.domain.Image;
import edu.zut.cs.emotion.base.domain.BaseEntity;

@Table(name = "EMOTION_ANALYZE_QUANSWERS")
@Entity
public class QuAnswers extends BaseEntity {

	private static final long serialVersionUID = -3L;

	@Column(name = "QUESTION")
	String question;

	@Column(name = "IMAGE_ID")
	long image_id;

	@Column(name = "qa_id")
	long qa_id;

	@Column(name = "ANSWER")
	String answer;
	
	@ManyToOne
	@JoinColumn(name = "MY_IMAGE_ID")
	Image image;

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public long getImage_id() {
		return image_id;
	}

	public void setImage_id(long image_id) {
		this.image_id = image_id;
	}

	public long getQa_id() {
		return qa_id;
	}

	public void setQa_id(long qa_id) {
		this.qa_id = qa_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getA_objects() {
		return a_objects;
	}

	public void setA_objects(String a_objects) {
		this.a_objects = a_objects;
	}

	public String getQ_objects() {
		return q_objects;
	}

	public void setQ_objects(String q_objects) {
		this.q_objects = q_objects;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name = "a_objects")
	String a_objects;

	@Column(name = "q_objects")
	String q_objects;

}
