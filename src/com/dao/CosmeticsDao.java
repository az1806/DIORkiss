package com.dao;

import java.util.ArrayList;

import com.entity.Cosmetics;

public interface CosmeticsDao {
	/**
	 * ��ѯ��ױƷ
	 */
	Cosmetics selectcosmetics(int id);

	/**
	 * �������л�ױƷ
	 * 
	 * @return
	 */
	ArrayList<Cosmetics> selectCosmetics(int type);

	ArrayList<Cosmetics> selectCosmetics();

	ArrayList<Cosmetics> selectcos(String type);
	
	ArrayList<Cosmetics> selectallCosmetics();

	int delCosmetics(int id);

	int updatecos(int id, int tid, String name, String colour, double price,
			String img, int size, String coloursize, String style,
			String effect, String girlc, String bodyc, String type, double ml);

	int addcos(int tid, String name, String colour, double price, String img,
			int size, String coloursize, String style, String effect,
			String girlc, String bodyc, String type, double ml);
	ArrayList<Cosmetics> selectcos(int tid, String name, String colour,
			 String coloursize, String style,
			String effect, String girlc, String bodyc, String type);
	
	ArrayList<Cosmetics> ssCosmetics(String name);
}
