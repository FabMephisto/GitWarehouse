package com.pojo;

import java.util.Date;

import com.annotation.Primarykey;

public class Userinfo {
	@Primarykey(seqName="seq_userinfo")
	private int u_id;
	private String u_name;
	private String u_sex;
	private String u_phone;
	private String u_pwd;
	private Date u_create_time;
	private Date u_last_time;
	private String u_type;
	private String u_status;
	
	public Userinfo() {
	}
	
	public Userinfo(int u_id, String u_name, String u_sex, String u_phone, String u_pwd, Date u_create_time,
			Date u_last_time, String u_type, String u_status) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_sex = u_sex;
		this.u_phone = u_phone;
		this.u_pwd = u_pwd;
		this.u_create_time = u_create_time;
		this.u_last_time = u_last_time;
		this.u_type = u_type;
		this.u_status = u_status;
	}

	public int getU_id(){
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name(){
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_sex(){
		return u_sex;
	}
	public void setU_sex(String u_sex) {
		this.u_sex = u_sex;
	}
	public String getU_phone(){
		return u_phone;
	}
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}
	public String getU_pwd(){
		return u_pwd;
	}
	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}
	public Date getU_create_time(){
		return u_create_time;
	}
	public void setU_create_time(Date u_create_time) {
		this.u_create_time = u_create_time;
	}
	public Date getU_last_time(){
		return u_last_time;
	}
	public void setU_last_time(Date u_last_time) {
		this.u_last_time = u_last_time;
	}
	public String getU_type(){
		return u_type;
	}
	public void setU_type(String u_type) {
		this.u_type = u_type;
	}
	public String getU_status(){
		return u_status;
	}
	public void setU_status(String u_status) {
		this.u_status = u_status;
	}
}