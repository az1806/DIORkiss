package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.HouTaiLiuYanDao;


import com.entity.HouTaiLiuYan;
import com.util.JdbcUtil;

public class HouTaiLiuYanDaoImpl implements  HouTaiLiuYanDao{

	public HouTaiLiuYan oneHouTaiLiuYan() {
		HouTaiLiuYan htly = new HouTaiLiuYan();
		ResultSet rs = JdbcUtil.querySQL("select * from HouTaiLiuYan limit 6");
		//查询限定行数
		try {
			while (rs.next()) {
				
				htly.setId(rs.getInt(1));
				htly.setName(rs.getString(2));
				htly.setPhone(rs.getString(3));
				htly.setEmail(rs.getString(4));
				htly.setContent(rs.getString(5));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return htly;
	}

	public ArrayList<HouTaiLiuYan> selectHouTaiLiuYan() {

		ArrayList<HouTaiLiuYan> htlys= new ArrayList<HouTaiLiuYan>();

		ResultSet rs = JdbcUtil.querySQL("select * from HouTaiLiuYan");
		if (rs != null) {
			try {
				while (rs.next()) {
					HouTaiLiuYan u = new HouTaiLiuYan();
					u.setId(rs.getInt(1));
					u.setName(rs.getString(2));
					u.setPhone(rs.getString(3));
					u.setEmail(rs.getString(4));
					u.setContent(rs.getString(5));
					htlys.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return htlys;
	}

}
