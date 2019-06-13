package com.dao;

import com.entity.Company;

public interface CompanyDao {

	Company queryCompany();

	// 返回值 方法名（参数类型 参数名，。。。。）
	int updateCompany(int id, String name, String phone,
			String introduction, String address, String culture, String email,
			String img);
}
