package com.kbdata.jjh.model;

public class Point {

	private int u_id; // ȸ���Ϸù�ȣ
	private int a_num; // ������ι�ȣ
	private int cardnum; // ī���ȣ
	private String a_date; // ������
	private String a_time; // ���νð�
	private int mem_store_num; // ��������ȣ
	private String division; // ����or���� ����
	private int point; // ����Ʈ�ݾ�
	
	public Point(int u_id, int a_num, int cardnum, String a_date, String a_time, int mem_store_num, String division,
			int point) {
		this.u_id = u_id;
		this.a_num = a_num;
		this.cardnum = cardnum;
		this.a_date = a_date;
		this.a_time = a_time;
		this.mem_store_num = mem_store_num;
		this.division = division;
		this.point = point;
	}
	
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public int getA_num() {
		return a_num;
	}
	public void setA_num(int a_num) {
		this.a_num = a_num;
	}
	public int getCardnum() {
		return cardnum;
	}
	public void setCardnum(int cardnum) {
		this.cardnum = cardnum;
	}
	public String getA_date() {
		return a_date;
	}
	public void setA_date(String a_date) {
		this.a_date = a_date;
	}
	public String getA_time() {
		return a_time;
	}
	public void setA_time(String a_time) {
		this.a_time = a_time;
	}
	public int getMem_store_num() {
		return mem_store_num;
	}
	public void setMem_store_num(int mem_store_num) {
		this.mem_store_num = mem_store_num;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
