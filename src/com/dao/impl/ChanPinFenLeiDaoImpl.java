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
				cpfl.setId(rs.getInt(1));
				cpfl.setName(rs.getString(4));
				cpfl.setTid(rs.getInt(3));
				cpfl.setClasst(rs.getString(2));
				cpfl.setImg(rs.getString(5));
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
					cpfl.setId(rs.getInt(1));
					cpfl.setName(rs.getString(4));
					cpfl.setTid(rs.getInt(3));
					cpfl.setClasst(rs.getString(2));
					cpfl.setImg(rs.getString(5));
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

		ResultSet rs = JdbcUtil.querySQL("select * from ChanPinFenLei where tid="+type);
		if (rs != null) {
			try {
				while (rs.next()) {
					ChanPinFenLei cpfl = new ChanPinFenLei();
					cpfl.setId(rs.getInt(1));
					cpfl.setName(rs.getString(4));
					
					cpfl.setClasst(rs.getString(2));
					cpfl.setImg(rs.getString(5));
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
