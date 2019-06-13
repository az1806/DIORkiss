package com.dao;

import java.util.ArrayList;

import com.entity.ZiXunFenLei;

public interface ZiXunFenLeiDao {
	ZiXunFenLei oneZiXunFenLei();

	ArrayList<ZiXunFenLei> selectZiXunFenLei();

	ArrayList<ZiXunFenLei> selectZiXunFenLei(int type);
	
	int addzxfl(String name);

	int delzxfl(int id);

	ZiXunFenLei onezxfl(int id);

	int updatezxfl(int id, String name);

}
