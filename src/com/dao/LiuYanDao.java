package com.dao;

import java.util.ArrayList;

import com.entity.LiuYan;

public interface LiuYanDao {
	LiuYan oneLiuYan();
	int insertLiuYan(String sql);
	ArrayList< LiuYan> selectLiuYan(); 	
}
