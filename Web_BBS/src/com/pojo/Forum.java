package com.pojo;

import java.util.Date;

import com.annotation.Primarykey;

public class Forum {
	@Primarykey(seqName="seq_forum")
	private int f_id;
	private int p_id;
	private String f_name;
	private String f_des;
	private int f_total;
	private Date f_last_time;
	private String f_photo;
	private String f_status;

	public int getF_id(){
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public int getP_id(){
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getF_name(){
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getF_des(){
		return f_des;
	}
	public void setF_des(String f_des) {
		this.f_des = f_des;
	}
	public int getF_total(){
		return f_total;
	}
	public void setF_total(int f_total) {
		this.f_total = f_total;
	}
	public Date getF_last_time(){
		return f_last_time;
	}
	public void setF_last_time(Date f_last_time) {
		this.f_last_time = f_last_time;
	}
	public String getF_photo(){
		return f_photo;
	}
	public void setF_photo(String f_photo) {
		this.f_photo = f_photo;
	}
	public String getF_status(){
		return f_status;
	}
	public void setF_status(String f_status) {
		this.f_status = f_status;
	}
}