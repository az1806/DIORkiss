package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.KouHongDao;
import com.entity.KouHong;

import com.util.JdbcUtil;

public class KouHongDaoImpl implements KouHongDao{

	public KouHong selectkouhong(int type) {
		// TODO Auto-generated method stub
		KouHong kh=new KouHong();
		ResultSet rs = JdbcUtil.querySQL("select * from KouHong where id="+type);
		try {
			while (rs.next()){
				kh.setId(rs.getInt(1));
				kh.setName(rs.getString(2));
				kh.setColoursize(rs.getString(3));
				kh.setColour(rs.getString(4));
				kh.setEffect(rs.getString(5));
				kh.setPrice(rs.getDouble(6));
				kh.setImg(rs.getString(7));
				
			}
			
			System.out.println(kh);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return kh;
		
	}

	public ArrayList<KouHong> selectKouHong() {
		// TODO Auto-generated method stub
		ArrayList<KouHong> khs = new ArrayList<KouHong>();

		ResultSet rs = JdbcUtil.querySQL("select * from KouHong");
		if (rs != null) {
			try {
				while (rs.next()) {
					KouHong u = new KouHong();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setColoursize(rs.getString("coloursize"));
					u.setColour(rs.getString("colour"));
					u.setEffect(rs.getString("effect"));
					u.setPrice(rs.getDouble("price"));
					u.setImg(rs.getString("img"));
					khs.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return khs;
		
	}

}
