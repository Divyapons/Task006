package com.gits.ProjectHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity

public class EmployeeD 
{
	@Id
	private int eid;
	private String ename;
	private String enative;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEnative() {
		return enative;
	}
	public void setEnative(String enative) {
		this.enative = enative;
	}
	
}
