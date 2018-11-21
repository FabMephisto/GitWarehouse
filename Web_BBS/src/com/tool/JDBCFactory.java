package com.tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCFactory {
	private static String DRIVER;
	private static String URL;
	private static String USERNAME;
	private static String PASSWORD;
	static{
		//Properties pro = new Properties();
		//InputStream in = JDBCFactory.class.getResourceAsStream("jdbc.properties");
		try {
			//pro.load(in);
			DRIVER ="oracle.jdbc.driver.OracleDriver";
			URL = "jdbc:oracle:thin:@localhost:1521:orcl";
			USERNAME ="FabMephisto";
			PASSWORD ="123456";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConn() {
		try {
			Class.forName(DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return conn;
	}
	
	public static void allClose(Connection conn,Statement st,ResultSet rs) {
		try {
			try {
				if(rs!=null)
					rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				if(st!=null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn!=null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
