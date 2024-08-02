package com.LinkedIn.entity;

public class LinkedInUser {
	String name;
	String mail;
	int mnum;
	String upMail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getMnum() {
		return mnum;
	}
	public void setMnum(int mnum) {
		this.mnum = mnum;
	}
	public void setupMail(String upMail) {
		this.upMail=upMail;
	}
	public String getupMail() {
		return upMail;
	}
	public String toString() {
		return name+" "+mail+" "+mnum;
	}

}
