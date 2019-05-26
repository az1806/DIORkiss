package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.DongTaiDao;
import com.entity.DongTai;


import com.util.JdbcUtil;

public class DongTaiDaoImpl implements DongTaiDao {

	public DongTai oneDongTai() {
		DongTai dt = new DongTai();
		ResultSet rs = JdbcUtil.querySQL("select * from DongTai limit 3");
		//查询限定行数
		try {
			while (rs.next()) {
				
				dt.setId(rs.getInt(1));
				dt.setImg(rs.getString(2));
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dt;
	}

	public ArrayList<DongTai> selectDongTai() {
		ArrayList<DongTai> dts = new ArrayList<DongTai>();

		ResultSet rs = JdbcUtil.querySQL("select * from DongTai");
		if (rs != null) {
			try {
				while (rs.next()) {
					DongTai dt = new DongTai();
					dt.setId(rs.getInt(1));
					dt.setImg(rs.getString(2));
					dts.add(dt);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return dts;
	}

}
