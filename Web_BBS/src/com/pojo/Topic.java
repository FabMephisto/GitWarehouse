package com.pojo;

import java.util.Date;

public class Topic {
	private int id;
	private int u_id;
	private int f_id;
	private String t_name;
	private String t_content;
	private String t_path;
	private String filename;
	private Date create_time;
	private String is_top;
	private Date top_time;
	private String t_status;

	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getU_id(){
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public int getF_id(){
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public String getT_name(){
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_content(){
		return t_content;
	}
	public void setT_content(String t_content) {
		this.t_content = t_content;
	}
	public String getT_path(){
		return t_path;
	}
	public void setT_path(String t_path) {
		this.t_path = t_path;
	}
	public String getFilename(){
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public Date getCreate_time(){
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getIs_top(){
		return is_top;
	}
	public void setIs_top(String is_top) {
		this.is_top = is_top;
	}
	public Date getTop_time(){
		return top_time;
	}
	public void setTop_time(Date top_time) {
		this.top_time = top_time;
	}
	public String getT_status(){
		return t_status;
	}
	public void setT_status(String t_status) {
		this.t_status = t_status;
	}
}