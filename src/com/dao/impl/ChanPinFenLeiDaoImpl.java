package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.ChanPinFenLeiDao;
import com.entity.ChanPinFenLei;

import com.util.JdbcUtil;

public class ChanPinFenLeiDaoImpl implements ChanPinFenLeiDao {
	public ChanPinFenLei oneChanPinFenLei() {
		ChanPinFenLei cpfl = new ChanPinFenLei();
		ResultSet rs = JdbcUtil.querySQL("select * from ChanPinFenLei limit 6");
		// 查询限定行数
		try {
			while (rs.next()) {
				cpfl.setId(rs.getInt("id"));
				cpfl.setName(rs.getString("name"));
				cpfl.setClasst(rs.getString("classt"));
				cpfl.setImg(rs.getString("img"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cpfl;
	}

	public ArrayList<ChanPinFenLei> selectChanPinFenLei() {
		ArrayList<ChanPinFenLei> cpfls = new ArrayList<ChanPinFenLei>();

		ResultSet rs = JdbcUtil.querySQL("select * from ChanPinFenLei");
		if (rs != null) {
			try {
				while (rs.next()) {
					ChanPinFenLei cpfl = new ChanPinFenLei();
					cpfl.setId(rs.getInt("id"));
					cpfl.setName(rs.getString("name"));
					cpfl.setClasst(rs.getString("classt"));
					cpfl.setImg(rs.getString("img"));
					cpfls.add(cpfl);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return cpfls;
	}

	public ArrayList<ChanPinFenLei> selectChanPinFenLei(int type) {
		ArrayList<ChanPinFenLei> cpfls = new ArrayList<ChanPinFenLei>();

		ResultSet rs = JdbcUtil.querySQL("select * from ChanPinFenLei where id="+type);
		if (rs != null) {
			try {
				while (rs.next()) {
					ChanPinFenLei cpfl = new ChanPinFenLei();
					cpfl.setId(rs.getInt("id"));
					cpfl.setName(rs.getString("name"));
					cpfl.setClasst(rs.getString("classt"));
					cpfl.setImg(rs.getString("img"));
					cpfls.add(cpfl);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return cpfls;
	}
}
