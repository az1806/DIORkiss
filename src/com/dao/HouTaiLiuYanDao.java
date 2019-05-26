package com.dao;

import java.util.ArrayList;

import com.entity.HouTaiLiuYan;



public interface HouTaiLiuYanDao {
	HouTaiLiuYan oneHouTaiLiuYan();
	  
	   ArrayList< HouTaiLiuYan> selectHouTaiLiuYan();
}
