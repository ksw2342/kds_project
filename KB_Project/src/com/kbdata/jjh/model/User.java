package com.kbdata.jjh.model;

import java.util.Date;

public class User {
	private int u_id;
	private String id;
	private String name;
	private String phone;
	private Date regi_date;
	private String card_num;
	private int point;
	
	public User() {
		
	}
	public User(String id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public User(int u_id, String id, String name, String phone, Date regi_date, String card_num, int point) {
		this.u_id = u_id;
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.regi_date = regi_date;
		this.card_num = card_num;
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

	public Date getRegi_date() {
		return regi_date;
	}

	public void setRegi_date(Date regi_date) {
		this.regi_date = regi_date;
	}
	
	public String getCard_num() {
		return card_num;
	}

	public void setCard_num(String card_num) {
		this.card_num = card_num;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
