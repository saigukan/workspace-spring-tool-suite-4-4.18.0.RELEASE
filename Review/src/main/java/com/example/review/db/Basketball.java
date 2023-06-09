package com.example.review.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Basketball {
	@Id
	private int no;
	private String name;
	private String jno;
	private String team;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJno() {
		return jno;
	}
	public void setJno(String jno) {
		this.jno = jno;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

}
