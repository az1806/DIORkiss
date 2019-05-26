package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.ZiXunDao;

import com.entity.ZiXun;
import com.util.JdbcUtil;

public class ZiXunDaoImpl implements ZiXunDao{

	public ZiXun oneZiXun() {
		ZiXun zx = new ZiXun();
		ResultSet rs = JdbcUtil.querySQL("select * from ZiXun limit 6");
		//查询限定行数
		try {
			while (rs.next()) {
				zx.setId(rs.getInt(1));
				zx.setH(rs.getString(2));
				
				zx.setContent(rs.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
					u.setContent(rs.getString(3));
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
