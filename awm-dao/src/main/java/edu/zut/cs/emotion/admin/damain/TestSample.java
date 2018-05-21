package edu.zut.cs.emotion.admin.damain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;
@Table(name="TestSample")
@Entity
public class TestSample extends BaseEntity {

	private static final long serialVersionUID = -1751952224371998469L;
	
	@Column(name = "Words1")
	private String Word1;
	
	@Column(name = "Word2")
	private String Word2;

	@Column(name = "Word3")
	private String Word3;

    @Column(name ="Lables")
    private String Lables;

	public String getWord1() {
		return Word1;
	}

	public void setWord1(String word1) {
		Word1 = word1;
	}

	public String getWord2() {
		return Word2;
	}

	public void setWord2(String word2) {
		Word2 = word2;
	}

	public String getWord3() {
		return Word3;
	}

	public void setWord3(String word3) {
		Word3 = word3;
	}

	public String getLables() {
		return Lables;
	}

	public void setLables(String lables) {
		Lables = lables;
	}
    
}

