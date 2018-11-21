package com.sevice;

import java.util.Date;

import com.DAO.IUserinfoDAO;
import com.DAO.UserinfoDAO;
import com.pojo.Userinfo;

public class UserinfoSevice implements IUserinfoSevice {
	IUserinfoDAO userdao = new UserinfoDAO();
	@Override
	public int regUser(Userinfo user) {
		user.setU_create_time(new Date());
		user.setU_status("0");
		user.setU_type("0");
		return userdao.addUserinfo(user);
	}

}
