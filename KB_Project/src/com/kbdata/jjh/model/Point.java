package com.kbdata.jjh.model;

public class Point {

	private int u_id; // ȸ���Ϸù�ȣ
	private int approval_num; // ������ι�ȣ
	private int card_num; // ī���ȣ
	private String approval_date; // ������
	private String approval_time; // ���νð�
	private int store_num; // ��������ȣ
	private String sale_division; // ����or���� ����
	private int point; // ����Ʈ�ݾ�
	
	public Point(int u_id, int approval_num, int card_num, String approval_date, String approval_time, int store_num, String sale_division,
			int point) {
		this.u_id = u_id;
		this.approval_num = approval_num;
		this.card_num = card_num;
		this.approval_date = approval_date;
		this.approval_time = approval_time;
		this.store_num = store_num;
		this.sale_division = sale_division;
		this.point = point;
	}
		
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public int getApproval_num() {
		return approval_num;
	}
	public void setApproval_num(int approval_num) {
		this.approval_num = approval_num;
	}
	public int getCard_num() {
		return card_num;
	}
	public void setCard_num(int card_num) {
		this.card_num = card_num;
	}
	public String getApproval_date() {
		return approval_date;
	}
	public void setApproval_date(String approval_date) {
		this.approval_date = approval_date;
	}
	public String getApproval_time() {
		return approval_time;
	}
	public void setApproval_time(String approval_time) {
		this.approval_time = approval_time;
	}
	public int getStore_num() {
		return store_num;
	}
	public void setStore_num(int store_num) {
		this.store_num = store_num;
	}
	public String getSale_division() {
		return sale_division;
	}
	public void setSale_division(String sale_division) {
		this.sale_division = sale_division;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}

