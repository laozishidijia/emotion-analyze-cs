package edu.zut.cs.emotion.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;
@Table(name="EMOTION_ANALYZE_QUES_AN")
@Entity
public class QuestionAn extends BaseEntity{
	/*
	 * 
	 */
	private static final long serialVersionUID = 8462412232619290034L;
	@Column(name="QUESTION")
	String question;
	@Column(name="IMAGE_ID")
	long image_id;
	@Column(name="QA_ID")
	long qa_id;
	@Column(name="ANSWER")
	String answer;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="JSON_ID")
	Json json_ques;
	public Json getJson_ques() {
		return json_ques;
	}
	public void setJson_ques(Json json_ques) {
		this.json_ques = json_ques;
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
	
}
