package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.LiuYanDao;
import com.entity.LiuYan;

import com.util.JdbcUtil;

public class LiuYanDaoImpl implements LiuYanDao{

	public LiuYan oneLiuYan() {
		LiuYan ly = new LiuYan();
		ResultSet rs = JdbcUtil.querySQL("select * from LiuYan limit 6");
		//查询限定行数
		try {
			while (rs.next()) {
				ly.setId(rs.getInt("id"));
				ly.setName(rs.getString("name"));
				ly.setPhone(rs.getString("phone"));
				ly.setEmail(rs.getString("email"));
				ly.setContent(rs.getString("content"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ly;
	}

	public ArrayList<LiuYan> selectLiuYan() {
		ArrayList<LiuYan> zxs = new ArrayList<LiuYan>();

		ResultSet rs = JdbcUtil.querySQL("select * from LiuYan");
		if (rs != null) {
			try {
				while (rs.next()) {
					LiuYan u = new LiuYan();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setPhone(rs.getString("phone"));
					u.setEmail(rs.getString("email"));
					u.setContent(rs.getString("content"));
					u.setHf(rs.getString("hf"));
					zxs.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return zxs;
	}

	public int insertLiuYan(String sql) {
		int n = JdbcUtil.updateSQL(sql);
		if (n == 1) {
			return 1;
		}
		return 0;
	}

	public LiuYan oneLiuYan(int id) {
		LiuYan ly = new LiuYan();
		ResultSet rs = JdbcUtil.querySQL("select * from LiuYan where id='"+id+"'");
		//查询限定行数
		try {
			while (rs.next()) {
				ly.setId(rs.getInt("id"));
				ly.setName(rs.getString("name"));
				ly.setPhone(rs.getString("phone"));
				ly.setEmail(rs.getString("email"));
				ly.setContent(rs.getString("content"));
				ly.setHf(rs.getString("hf"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ly;
	}

	public int addliuyan(int id, String hf) {
		return JdbcUtil.updateSQL("UPDATE liuyan SET hf='"+hf+"' where id='"+id+"'");
	}
	public int delly(int id) {
		return JdbcUtil.updateSQL("delete from liuyan where id=" + id);
	}

	public ArrayList<LiuYan> chaxunly(String zt) {
		ArrayList<LiuYan> lys = new ArrayList<LiuYan>();

		ResultSet rs = JdbcUtil.querySQL("select * from LiuYan where hf like '%"+zt+"%'");
		if (rs != null) {
			try {
				while (rs.next()) {
					LiuYan u = new LiuYan();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setPhone(rs.getString("phone"));
					u.setEmail(rs.getString("email"));
					u.setContent(rs.getString("content"));
					u.setHf(rs.getString("hf"));
					lys.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return lys;
	}
}
