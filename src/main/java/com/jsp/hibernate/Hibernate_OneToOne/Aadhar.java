package com.jsp.hibernate.Hibernate_OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aadhar {
	@Id
	private int aadharId;
	private long aadharNo;
	
	
	public int getAadharId() {
		return aadharId;
	}
	public void setAadharId(int aadharId) {
		this.aadharId = aadharId;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	
}
