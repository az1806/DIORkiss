package com.dao;

import java.util.ArrayList;

import com.entity.FuZhuang;



public interface FuZhuangDao {
	   FuZhuang oneFuZhuang();
	  
	   ArrayList< FuZhuang> selectFuZhuang(); 									
}
