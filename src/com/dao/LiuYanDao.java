package com.dao;

import java.util.ArrayList;

import com.entity.LiuYan;

public interface LiuYanDao {
	LiuYan oneLiuYan();
		  
	ArrayList< LiuYan> selectLiuYan(); 	
}
