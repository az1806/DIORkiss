package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.ZiXunDao;

import com.entity.ZiXun;
import com.util.JdbcUtil;

public class ZiXunDaoImpl implements ZiXunDao{

	public ZiXun oneZiXun(int type) {
		ZiXun zx = new ZiXun();
		ResultSet rs = JdbcUtil.querySQL("select * from ZiXun where tid="+type +" limit 1");
		//查询限定行数
		try {
			while (rs.next()) {
				zx.setId(rs.getInt("id"));
				zx.setH(rs.getString("h"));
				zx.setName(rs.getString("name"));
				zx.setContent(rs.getString("content"));
				zx.setTid(rs.getInt("tid"));
				zx.setTime(rs.getDate("time"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(zx);
		return zx;
		
	}

	public ArrayList<ZiXun> selectZiXun() {
		ArrayList<ZiXun> zxs = new ArrayList<ZiXun>();

		ResultSet rs = JdbcUtil.querySQL("select * from ZiXun");
		if (rs != null) {
			try {
				while (rs.next()) {
					ZiXun u = new ZiXun();
					u.setId(rs.getInt(1));
					u.setH(rs.getString(2));
					u.setName(rs.getString(4));
					u.setContent(rs.getString(3));
					u.setTid(rs.getInt(5));
					u.setTime(rs.getDate(6));
					zxs.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return zxs;
	}

	public ArrayList<ZiXun> selectZiXun(int type) {
		ArrayList<ZiXun> zxs = new ArrayList<ZiXun>();

		ResultSet rs = JdbcUtil.querySQL("select * from ZiXun where tid="+type);
		if (rs != null) {
			try {
				while (rs.next()) {
					ZiXun u = new ZiXun();
					u.setId(rs.getInt(1));
					u.setH(rs.getString(2));
					u.setName(rs.getString(4));
					u.setContent(rs.getString(3));
					u.setTid(rs.getInt(5));
					u.setTime(rs.getDate(6));
					zxs.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return zxs;
	}

	public int addzixun(int tid, String h, String name, String content) {
		
		return JdbcUtil.updateSQL("INSERT into zixun(tid,h,name,content) VALUES('"+tid+"','"+h+"','"+name+"','"+content+"')");
	}

	public int delzixun(int id) {
		
		return JdbcUtil.updateSQL("delete from zixun where id="+id);
	}

	public ZiXun getonezixun(int id) {
		ZiXun zx = new ZiXun();
		ResultSet rs = JdbcUtil.querySQL("select * from ZiXun where id="+id);
		//查询限定行数
		try {
			while (rs.next()) {
				zx.setId(rs.getInt(1));
				zx.setH(rs.getString(2));
				zx.setContent(rs.getString(3));
				zx.setName(rs.getString(4));
				zx.setTid(rs.getInt(5));
				zx.setTime(rs.getDate(6));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return zx;
	}

	public int updatezixun(int id, String h, String name, String content,
			int tid) {
		
		return JdbcUtil.updateSQL("UPDATE zixun SET name='"+name+"',tid='"+tid+"',content='"+content+"',h='"+h+"' WHERE id='"+id+"'");
	}

	public ArrayList<ZiXun> cxzx(int tid, String h, String content) {
		String sql="select * from zixun where 1=1 ";
		if(tid>0){
			sql+="and tid='"+tid+"'";
		}
		if(h!=null&&!h.equals("")){
			sql+="and h like '%"+h+"%'";
		}
		if(content!=null&&!content.equals("")){
			sql+="and content like '%"+content+"%'";
		}
		ArrayList<ZiXun> zxs = new ArrayList<ZiXun>();

		ResultSet rs = JdbcUtil.querySQL(sql);
		if (rs != null) {
			try {
				while (rs.next()) {
					ZiXun u = new ZiXun();
					u.setId(rs.getInt("id"));
					u.setH(rs.getString("h"));
					u.setName(rs.getString("name"));
					u.setContent(rs.getString("content"));
					u.setTid(rs.getInt("tid"));
					u.setTime(rs.getDate("time"));
					zxs.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return zxs;
	}

}
