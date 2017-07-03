package com.myqq.entity;

import java.util.Date;

public class User {

	private int qqnum;
	private String nickName;
	private String password;
	private Date registTime;
	private String gender;
	private String introduces;
	private String ip;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getQqnum() {
		return qqnum;
	}
	public void setQqnum(int qqnum) {
		this.qqnum = qqnum;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIntroduces() {
		return introduces;
	}
	public void setIntroduces(String introduces) {
		this.introduces = introduces;
	}
}
