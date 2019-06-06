package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.ZiXunFenLeiDao;

import com.entity.ChanPinFenLei;
import com.entity.ZiXunFenLei;
import com.util.JdbcUtil;

public class ZiXunFenLeiDaoImpl implements ZiXunFenLeiDao {

	public ZiXunFenLei oneZiXunFenLei() {
		ZiXunFenLei zxfl = new ZiXunFenLei();
		ResultSet rs = JdbcUtil.querySQL("select * from ZiXunFenLei limit 6");
		// 查询限定行数
		try {
			while (rs.next()) {
				zxfl.setId(rs.getInt("id"));
				zxfl.setName(rs.getString("name"));
				zxfl.setContent(rs.getString("content"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return zxfl;
	}

	public ArrayList<ZiXunFenLei> selectZiXunFenLei() {
		ArrayList<ZiXunFenLei> zxfls = new ArrayList<ZiXunFenLei>();

		ResultSet rs = JdbcUtil.querySQL("select * from ZiXunFenLei");
		if (rs != null) {
			try {
				while (rs.next()) {
					ZiXunFenLei zxfl = new ZiXunFenLei();
					zxfl.setId(rs.getInt("id"));
					zxfl.setName(rs.getString("name"));
					zxfl.setContent(rs.getString("content"));
					zxfls.add(zxfl);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return zxfls;
	}

	public ArrayList<ZiXunFenLei> selectZiXunFenLei(int type) {
		ArrayList<ZiXunFenLei> zxfls = new ArrayList<ZiXunFenLei>();

		ResultSet rs = JdbcUtil.querySQL("select * from ZiXunFenLei where tid="+type);
		if (rs != null) {
			try {
				while (rs.next()) {
					ZiXunFenLei zxfl = new ZiXunFenLei();
					zxfl.setId(rs.getInt("id"));
					zxfl.setName(rs.getString("name"));
					zxfl.setContent(rs.getString("content"));
					zxfls.add(zxfl);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return zxfls;
	}

}
