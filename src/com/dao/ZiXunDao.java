package com.dao;

import java.util.ArrayList;

import com.entity.ZiXun;



public interface ZiXunDao {
	ZiXun oneZiXun(int type);
	 ArrayList< ZiXun> selectZiXun(int type);
	   ArrayList< ZiXun> selectZiXun();
}
