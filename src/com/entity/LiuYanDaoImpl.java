package com.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.LiuYanDao;
import com.util.JdbcUtil;

public class LiuYanDaoImpl implements LiuYanDao {

	public LiuYan oneLiuYan() {
		LiuYan ly = new LiuYan();
		ResultSet rs = JdbcUtil.querySQL("select * from FuZhuang limit 3");
		//查询限定行数
		try {
			while (rs.next()) {
				ly.setId(rs.getInt(1));
				ly.setName(rs.getString(2));
				ly.setPhone(rs.getString(3));
				ly.setEmail(rs.getString(4));
				ly.setContent(rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ly;
	}

	public ArrayList<LiuYan> selectLiuYan() {
		ArrayList<LiuYan> lys = new ArrayList<LiuYan>();

		ResultSet rs = JdbcUtil.querySQL("select * from LiuYan");
		if (rs != null) {
			try {
				while (rs.next()) {
					LiuYan u = new LiuYan();
					u.setId(rs.getInt(1));
					u.setName(rs.getString(2));
					u.setPhone(rs.getString(3));
					u.setEmail(rs.getString(4));
					u.setContent(rs.getString(5));
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
