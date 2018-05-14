package edu.zut.cs.emotion.admin.damain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;
@Table(name="student")
@Entity

public class studentdata extends BaseEntity {
	private static final long serialVersionUID = -1751952224371998469L;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private String age;
    @Column(name="gotime")
    private String gotime;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGotime() {
		return gotime;
	}
	public void setGotime(String gotime) {
		this.gotime = gotime;
	}
}
