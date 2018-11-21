package com.pojo;

import com.annotation.Primarykey;

public class Panel {
	@Primarykey(seqName="seq_panel")
	private int p_id;
	private String p_name;
	private String p_order;
	private String p_ad;
	private String p_status;
	
	public Panel() {
	}
	public Panel(String p_name, String p_order, String p_ad, String p_status) {
		super();
		this.p_name = p_name;
		this.p_order = p_order;
		this.p_ad = p_ad;
		this.p_status = p_status;
	}
	public int getP_id(){
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name(){
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_order(){
		return p_order;
	}
	public void setP_order(String p_order) {
		this.p_order = p_order;
	}
	public String getP_ad(){
		return p_ad;
	}
	public void setP_ad(String p_ad) {
		this.p_ad = p_ad;
	}
	public String getP_status(){
		return p_status;
	}
	public void setP_status(String p_status) {
		this.p_status = p_status;
	}
}