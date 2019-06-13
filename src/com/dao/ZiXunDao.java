package com.dao;

import java.util.ArrayList;

import com.entity.ZiXun;

public interface ZiXunDao {
	ZiXun oneZiXun(int type);

	ArrayList<ZiXun> selectZiXun(int type);

	ArrayList<ZiXun> selectZiXun();

	int addzixun(int tid, String h, String name, String content);

	int delzixun(int id);

	ZiXun getonezixun(int id);

	int updatezixun(int id, String h, String name, String content, int tid);
	ArrayList<ZiXun>  cxzx(int tid,String h,String content);
}
