package com.dao;

import com.entity.Company;

public interface CompanyDao {

	Company queryCompany();

	// ����ֵ ���������������� ������������������
	int updateCompany(int id, String name, String phone,
			String introduction, String address, String culture, String email,
			String img);
}
