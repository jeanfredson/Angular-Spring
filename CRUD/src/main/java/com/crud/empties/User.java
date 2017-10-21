package com.crud.empties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String fnome;
	private String lnome;
	
	public User() {
		
	}
	
	public User(String fnome, String lnome) {
		this.fnome = fnome;
		this.lnome = lnome;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFnome() {
		return fnome;
	}
	public void setFnome(String fnome) {
		this.fnome = fnome;
	}
	public String getLnome() {
		return lnome;
	}
	public void setLnome(String lnome) {
		this.lnome = lnome;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fnome=" + fnome + ", lnome=" + lnome + "]";
	}
	
	
	
	

}
