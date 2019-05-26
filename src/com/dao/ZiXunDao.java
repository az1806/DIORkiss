package com.dao;

import java.util.ArrayList;

import com.entity.ZiXun;



public interface ZiXunDao {
	ZiXun oneZiXun();
	  
	   ArrayList< ZiXun> selectZiXun();
}
