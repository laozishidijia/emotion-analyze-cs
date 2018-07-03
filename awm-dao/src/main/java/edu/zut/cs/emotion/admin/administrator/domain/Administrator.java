package edu.zut.cs.emotion.admin.administrator.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.emotion.base.domain.BaseEntity;

@Table(name="EMOTION_ANALYZE_ADMINISTRATOR")
@Entity
public class Administrator extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	@Column(name="USER_NAME")
	String username;
	
	@Column(name="PASSWORD")
	String password;
	
	@Column(name="LOGIN_TIMES")
	int logintimes;

	public int getLogintimes() {
		return logintimes;
	}

	public void setLogintimes(int logintimes) {
		this.logintimes = logintimes;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Administrator [username=" + username + ", password=" + password + "]";
	}
	

}
