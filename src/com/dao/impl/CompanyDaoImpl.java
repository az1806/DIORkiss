package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.CompanyDao;
import com.entity.Company;


import com.util.JdbcUtil;



public class CompanyDaoImpl implements CompanyDao{

	

	public Company queryCompany() {
		// TODO Auto-generated method stub
		Company com=new Company();
		ResultSet rs = JdbcUtil.querySQL("select * from company");
		try {
			while (rs.next()){
				com.setId(rs.getInt(1));
				com.setName(rs.getString(2));
				com.setAddress(rs.getString(4));
				com.setPhone(rs.getString(3));
			    com.setCulture(rs.getString(6));
				com.setEmail(rs.getString(5));
				com.setIntroduction(rs.getString(7));
				com.setImg(rs.getString(8));
				com.setBeiyong(rs.getString(9));
				
			}
			
			System.out.println(com);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return com;
	}

	

	

}
