package edu.zut.cs.emotion.admin.damain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;

@Table(name = "TestCases")
@Entity
public class TestCases extends BaseEntity{
	

	private static final long serialVersionUID = -1751952224371998469L;
	
	@Column(name="example")
	private String example;
	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

}
