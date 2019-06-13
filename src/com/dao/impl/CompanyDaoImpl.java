package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.dao.CompanyDao;
import com.entity.Company;


import com.util.JdbcUtil;



public class CompanyDaoImpl implements CompanyDao{

	public Company queryCompany() {
		// TODO Auto-generated method stub
		Company com = new Company();
		ResultSet rs = JdbcUtil.querySQL("select * from company");
		try {
			while (rs.next()) {
				com.setId(rs.getInt("id"));
				com.setName(rs.getString("name"));
				com.setAddress(rs.getString("address"));
				com.setPhone(rs.getString("phone"));
				com.setCulture(rs.getString("culture"));
				com.setEmail(rs.getString("email"));
				com.setIntroduction(rs.getString("introduction"));
				com.setImg(rs.getString("img"));
			}
			System.out.println(com);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return com;
	}

	public int updateCompany(int id, String name, String phone,
			String introduction, String address, String culture, String email,
			String img) {
		return JdbcUtil.updateSQL("UPDATE company SET name='" + name
				 + "',phone='" + phone + "',introduction='"
				+ introduction + "',address='" + address + "',culture='" + culture
				+ "',email='" + email + "',img='" + img + "' WHERE id='"
				+ id + "' ");
	}

}
