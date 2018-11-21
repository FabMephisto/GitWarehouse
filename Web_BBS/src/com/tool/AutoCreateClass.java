package com.tool;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AutoCreateClass {
	Connection conn;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	public void creatClass(String tableName,String packagePath){
		String tanameToLow = tableName.toLowerCase();
		String taname  = tanameToLow.substring(0, 1).toUpperCase()+tanameToLow.substring(1);
		String sql = "select column_name,data_type from USER_TAB_COLS where table_name = '"+tableName+"'";
		String javabean = "public class "+taname+" {\r\n";
		String setAndGet = "";
		try{
			conn =JDBCFactory.getConn();
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			boolean DatePack = true;
			while (rs.next()) {
				String colname = rs.getString(1).toLowerCase();
				String da_type = rs.getString(2);
				String datype="";
				String colnameCharToUp = colname.substring(0,1).toUpperCase()+colname.substring(1);
				if("DATE".equals(da_type)&&DatePack){
					javabean = "import java.util.Date;\r\n\r\n"+javabean;
					DatePack = false;
				}
				switch (da_type) {
				case "NUMBER":
					datype ="int";
					break;
				case "VARCHAR2":
					datype ="String";				
					break;
				case "CHAR":
					datype ="String";	
					break;
				case "DATE":
					datype ="Date";	
					break;
				default:
					break;
				}
			javabean += "\tprivate "+datype+" "+colname+";\r\n";
			setAndGet += "\r\n\tpublic "+datype+" get"+colnameCharToUp+"(){\r\n\t\treturn "+colname+";\r\n\t}";
			setAndGet += "\r\n\tpublic void set"+colnameCharToUp+"("+datype+" "+colname+") {\r\n\t\tthis."+colname+" = "+colname+";\r\n\t}";
			}
			
			javabean = "package "+packagePath+";\r\n\r\n"+javabean;
			javabean += setAndGet+"\r\n}";
			String filePath = "src/"+packagePath.replace(".", "/")+"/";
		File fi = new File(filePath+taname+".java");
			FileOutputStream f= new FileOutputStream(fi);
			PrintWriter p = new PrintWriter(f);
			p.write(javabean);
			p.flush();
			p.close();
			System.out.println(tableName+"实体类已生成");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(tableName+"实体类生成失败");
		}finally {
			JDBCFactory.allClose(conn, st, rs);
		}
	}
}
