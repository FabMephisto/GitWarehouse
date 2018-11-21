package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;

import com.DAO.JDBCFactory;
import com.pojo.Userinfo;

public class UserinfoDAO implements IUserinfoDAO {
	Connection conn;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	@Override
	public int addUserinfo(Userinfo user) {
		conn = JDBCFactory.getConn();
		String sql = "insert into Userinfo values (seq_userinfo.nextval,?,?,?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getU_name());
			ps.setString(2, user.getU_sex());
			ps.setString(3, user.getU_phone());
			ps.setString(4, user.getU_pwd());
			ps.setTimestamp(5,new Timestamp(user.getU_create_time().getTime()));
			ps.setTimestamp(6,new Timestamp(user.getU_last_time().getTime()));
			ps.setString(7, user.getU_type());
			ps.setString(8, user.getU_status());
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCFactory.allClose(conn, ps, rs);
		}	
		return 0;
	}

	@Override
	public int subUserinfo(Userinfo user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updUserinfo(Userinfo user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Userinfo> selUserinfo(String sql) {
		// TODO Auto-generated method stub
		return null;
	}
}