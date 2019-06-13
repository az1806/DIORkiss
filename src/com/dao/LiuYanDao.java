package com.dao;

import java.util.ArrayList;

import com.entity.LiuYan;

public interface LiuYanDao {
	LiuYan oneLiuYan();
	int insertLiuYan(String sql);
	ArrayList<LiuYan> selectLiuYan();
	LiuYan oneLiuYan(int id);
	int addliuyan(int id,String hf);
	int delly(int id);
	ArrayList<LiuYan> chaxunly(String zt);
}
