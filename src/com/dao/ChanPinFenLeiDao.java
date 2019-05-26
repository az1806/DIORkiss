package com.dao;

import java.util.ArrayList;

import com.entity.ChanPinFenLei;

public interface ChanPinFenLeiDao {
	ChanPinFenLei oneChanPinFenLei();
	ArrayList< ChanPinFenLei> selectChanPinFenLei();
	   ArrayList< ChanPinFenLei> selectChanPinFenLei(int type);
}
