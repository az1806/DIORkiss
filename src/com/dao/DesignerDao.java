package com.dao;

import java.util.ArrayList;

import com.entity.Designer;

public interface DesignerDao {
	  ArrayList<Designer> selectDesigner();
	  int adddes(String name,String position,String img);
	  int deldesigner(int id);
	  Designer onedesigner(int id);
	  int updatedes(int id,String name,String position, String img);
}
