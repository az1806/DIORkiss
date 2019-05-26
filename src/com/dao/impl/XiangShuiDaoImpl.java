package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.XiangShuiDao;


import com.entity.XiangShui;
import com.util.JdbcUtil;




public class XiangShuiDaoImpl  implements  XiangShuiDao{
	
	
	

	public XiangShui oneXiangShui() {
		// TODO Auto-generated method stub
		XiangShui xs=new XiangShui();
		ResultSet rs = JdbcUtil.querySQL("select * from XiangShui limit 6");
		try {
			while (rs.next()){
				xs.setId(rs.getInt(1));
				xs.setName(rs.getString(2));
				xs.setType(rs.getString(3));
				xs.setMl(rs.getDouble(4));
				xs.setPrice(rs.getDouble(5));
				xs.setImg(rs.getString(6));
	
				
			}
			
			System.out.println(xs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return xs;
		
	}
	
	



	public ArrayList<XiangShui> selectXiangShui() {

		ArrayList<XiangShui> xss = new ArrayList<XiangShui>();

		ResultSet rs = JdbcUtil.querySQL("select * from XiangShui");
		if (rs != null) {
			try {
				while (rs.next()) {

					XiangShui xs = new XiangShui();
					xs.setId(rs.getInt(1));
					xs.setName(rs.getString(2));
					xs.setType(rs.getString(3));
					xs.setMl(rs.getDouble(4));
					xs.setPrice(rs.getDouble(5));
					xs.setImg(rs.getString(6));
					xss.add(xs);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return xss;

	}


}
