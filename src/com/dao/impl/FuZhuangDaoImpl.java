package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.FuZhuangDao;

import com.entity.FuZhuang;

import com.util.JdbcUtil;

public class FuZhuangDaoImpl  implements FuZhuangDao{

	public FuZhuang oneFuZhuang() {
		FuZhuang fz = new FuZhuang();
		ResultSet rs = JdbcUtil.querySQL("select * from FuZhuang limit 6");
		//查询限定行数
		try {
			while (rs.next()) {
				
				fz.setId(rs.getInt(1));
				fz.setBodyc(rs.getString(2));
				fz.setGirlc(rs.getString(3));
				fz.setStyle(rs.getString(4));
				fz.setSize(rs.getInt(5));
				fz.setColour(rs.getString(6));
				fz.setPrice(rs.getDouble(7));
				fz.setImg(rs.getString(8));
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return fz;
	}

	public ArrayList<FuZhuang> selectFuZhuang() {
		
		ArrayList<FuZhuang> fzs = new ArrayList<FuZhuang>();

		ResultSet rs = JdbcUtil.querySQL("select * from FuZhuang");
		if (rs != null) {
			try {
				while (rs.next()) {
					FuZhuang u = new FuZhuang();
					u.setId(rs.getInt(1));
					u.setBodyc(rs.getString(2));
					u.setGirlc(rs.getString(3));
					u.setStyle(rs.getString(4));
					u.setSize(rs.getInt(5));
					u.setColour(rs.getString(6));
					u.setPrice(rs.getDouble(7));
					u.setImg(rs.getString(8));
					fzs.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return fzs;
		
	}
		
}
