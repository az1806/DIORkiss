package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.CosmeticsDao;
import com.entity.Cosmetics;

import com.util.JdbcUtil;

public class CosmeticsDaoImpl implements CosmeticsDao {

	public Cosmetics selectcosmetics() {
		// TODO Auto-generated method stub
		Cosmetics co = new Cosmetics();
		ResultSet rs = JdbcUtil.querySQL("select * from Cosmetics");
		try {
			while (rs.next()) {
				co.setName(rs.getString(2));
				co.setPrice(rs.getDouble(4));
				co.setColour(rs.getString(3));
				co.setId(rs.getInt(1));
				co.setImg(rs.getString(5));
			}
			System.out.println(co);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return co;
	}
	public ArrayList<Cosmetics> selectCosmetics() {
		ArrayList<Cosmetics> cos = new ArrayList<Cosmetics>();
		ResultSet rs = JdbcUtil.querySQL("select * from Cosmetics");
		if (rs != null) {
			try {
				while (rs.next()) {
					Cosmetics u = new Cosmetics();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setImg(rs.getString("img"));
					u.setColour(rs.getString("colour"));
					u.setPrice(rs.getDouble("price"));
					cos.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cos;
	}
}
