package com.DAO;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.annotation.Primarykey;
import com.pojo.Panel;
import com.pojo.Userinfo;

public class BaseDAO {
	Connection conn;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	
	public static void main(String[] args) {
		BaseDAO bs = new BaseDAO();
		bs.saveObject(new Userinfo());
	}
	
	public int saveObject (Object o){
		try {
			conn = JDBCFactory.getConn();
			Class c = o.getClass();
			Field[] fields = c.getDeclaredFields();
			String questionMark ="";
			String colNames = "";//拼接所有字段名
			String seqName = ""; //获取序列名
			if (fields!=null) {
				for (int i = 0; i < fields.length; i++) {
					Field f = fields[i];
					Primarykey pk = f.getAnnotation(Primarykey.class);
					
					if (pk!=null) {
						questionMark += pk.seqName()+".nextval";
						colNames += f.getName();
					}else{
						questionMark += "?";
						colNames += f.getName();
					}
					
					if (i!=fields.length-1) {
						colNames += ",";
						questionMark += ",";
					}
				}
			}
			String sql = "insert into "+o.getClass().getSimpleName()+" ("+colNames+")values ("+questionMark+")";
			System.out.println(sql);
			//ps = conn.prepareStatement(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCFactory.allClose(conn, st, rs);
		}
		return 0;
	}
}
