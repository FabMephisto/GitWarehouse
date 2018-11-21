package com.tool;

public class SplitPageSqlUtil {
	public String splitSql(String sql,int pageindex,int pagecount) {
		String splitsql = "select * from (select t.*,rownum n from ("+sql+") t) tab where tab.n>"+(pageindex-1)*pagecount+"and tab.n<="+pageindex*pagecount;	
		return splitsql;
	}
}
