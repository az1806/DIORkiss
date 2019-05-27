package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.CosmeticsDao;
import com.entity.Cosmetics;

import com.util.JdbcUtil;

public class CosmeticsDaoImpl implements CosmeticsDao {

	public Cosmetics selectcosmetics( int id) {
		// TODO Auto-generated method stub
		Cosmetics u = new Cosmetics();
		ResultSet rs = JdbcUtil.querySQL("select * from Cosmetics where id="+id);
		try {
			while (rs.next()) {
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setImg(rs.getString("img"));
				u.setColour(rs.getString("colour"));
				u.setPrice(rs.getDouble("price"));
				u.setBodyc(rs.getString("bodyc"));
				u.setTid(rs.getInt("tid"));
				u.setType(rs.getString("type"));
				u.setColoursize(rs.getString("coloursize"));
				u.setEffect(rs.getString("effect"));
				u.setGirlc(rs.getString("girlc"));
				u.setMl(rs.getDouble("ml"));
				u.setSize(rs.getInt("size"));
				u.setStyle(rs.getString("style"));
			}
			System.out.println(u);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	public ArrayList<Cosmetics> selectCosmetics(int type) {
		ArrayList<Cosmetics> cos = new ArrayList<Cosmetics>();
		ResultSet rs = JdbcUtil.querySQL("select * from Cosmetics where tid="+type);
		if (rs != null) {
			try {
				while (rs.next()) {
					Cosmetics u = new Cosmetics();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setImg(rs.getString("img"));
					u.setColour(rs.getString("colour"));
					u.setPrice(rs.getDouble("price"));
					u.setBodyc(rs.getString("bodyc"));
					u.setTid(rs.getInt("tid"));
					u.setType(rs.getString("type"));
					u.setColoursize(rs.getString("coloursize"));
					u.setEffect(rs.getString("effect"));
					u.setGirlc(rs.getString("girlc"));
					u.setMl(rs.getDouble("ml"));
					u.setSize(rs.getInt("size"));
					u.setStyle(rs.getString("style"));
					cos.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cos;
	}
	public ArrayList<Cosmetics> selectCosmetics() {
		ArrayList<Cosmetics> cos = new ArrayList<Cosmetics>();
		ResultSet rs = JdbcUtil.querySQL("select * FROM cosmetics ORDER BY RAND() LIMIT 6");
		if (rs != null) {
			try {
				while (rs.next()) {
					Cosmetics u = new Cosmetics();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setImg(rs.getString("img"));
					u.setColour(rs.getString("colour"));
					u.setPrice(rs.getDouble("price"));
					u.setBodyc(rs.getString("bodyc"));
					u.setTid(rs.getInt("tid"));
					u.setType(rs.getString("type"));
					u.setColoursize(rs.getString("coloursize"));
					u.setEffect(rs.getString("effect"));
					u.setGirlc(rs.getString("girlc"));
					u.setMl(rs.getDouble("ml"));
					u.setSize(rs.getInt("size"));
					u.setStyle(rs.getString("style"));
					cos.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cos;
	}
	public ArrayList<Cosmetics> selectcos(String type) {
		ArrayList<Cosmetics> cos = new ArrayList<Cosmetics>();
		ResultSet rs = JdbcUtil.querySQL("select * from Cosmetics where name like '%"+type+"%'");
		if (rs != null) {
			try {
				while (rs.next()) {
					Cosmetics u = new Cosmetics();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setImg(rs.getString("img"));
					u.setColour(rs.getString("colour"));
					u.setPrice(rs.getDouble("price"));
					u.setBodyc(rs.getString("bodyc"));
					u.setTid(rs.getInt("tid"));
					u.setType(rs.getString("type"));
					u.setColoursize(rs.getString("coloursize"));
					u.setEffect(rs.getString("effect"));
					u.setGirlc(rs.getString("girlc"));
					u.setMl(rs.getDouble("ml"));
					u.setSize(rs.getInt("size"));
					u.setStyle(rs.getString("style"));
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
