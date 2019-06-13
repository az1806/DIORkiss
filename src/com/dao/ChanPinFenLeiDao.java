package com.dao;

import java.util.ArrayList;

import com.entity.ChanPinFenLei;

public interface ChanPinFenLeiDao {
	ChanPinFenLei oneChanPinFenLei(int id);

	ArrayList<ChanPinFenLei> selectChanPinFenLei();

	ArrayList<ChanPinFenLei> selectChanPinFenLei(int type);
	int addChanPinFenLei(String name);
	int delChanPinFenLei(int id);
	int updateChanPinFenLei(int id,String name);
}
