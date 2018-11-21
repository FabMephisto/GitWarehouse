package com.DAO;

import java.util.List;

import com.pojo.Userinfo;

public interface IUserinfoDAO {
	public int addUserinfo (Userinfo user);
	
	public int subUserinfo (Userinfo user);
	
	public int updUserinfo (Userinfo user);

	public List<Userinfo> selUserinfo (String sql);


}
