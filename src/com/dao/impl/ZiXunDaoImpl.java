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
		ResultSet rs = JdbcUtil.querySQL("select * from ZiXun where tid="+type);
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

	public ArrayList<ZiXun> selectZiXun(int type) {
		ArrayList<ZiXun> zxs = new ArrayList<ZiXun>();

		ResultSet rs = JdbcUtil.querySQL("select * from ZiXun where tid="+type);
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
