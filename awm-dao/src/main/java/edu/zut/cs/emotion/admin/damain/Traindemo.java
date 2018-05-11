package edu.zut.cs.emotion.admin.damain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;
@Table(name="Traindemo")
@Entity
public class Traindemo extends BaseEntity{
	private static final long serialVersionUID = -1751952224371998469L;

	@Column(name="question")
	String question;
	@Column(name="sqlSentence")
	String sqlSentence;
	@Column(name="answer")
	String answer;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getSqlSentence() {
		return sqlSentence;
	}
	public void setSqlSentence(String sqlSentence) {
		this.sqlSentence = sqlSentence;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
