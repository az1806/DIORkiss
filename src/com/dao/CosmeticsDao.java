package com.dao;

import java.util.ArrayList;

import com.entity.Cosmetics;

public interface CosmeticsDao{
	/**
	 * ��ѯ��ױƷ
	 */
	 Cosmetics selectcosmetics(int id);
   /**
	 * �������л�ױƷ
	 * @return
	 */
   ArrayList< Cosmetics> selectCosmetics(int type);
   ArrayList< Cosmetics> selectCosmetics();
   ArrayList< Cosmetics> selectcos(String type);
}
