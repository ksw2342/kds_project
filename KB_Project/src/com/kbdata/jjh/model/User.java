package com.kbdata.jjh.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class User {
	private int u_id;
	private String id;
	private String name;
	private String phone;
	private String regidate;
	private String cardnum;
	private int point;
	
	public User() {
		
	}
	public User(String id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public User(int u_id, String id, String name, String phone, String regidate, String cardnum, int point) {
		this.u_id = u_id;
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.regidate = regidate;
		this.cardnum = cardnum;
		this.point = point;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRegidate() {
		return regidate;
	}

	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}

	public String getCardnum() {
		return cardnum;
	}

	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
