package com.dao;

import java.util.ArrayList;

import com.entity.Cosmetics;

public interface CosmeticsDao{
	/**
	 * ��ѯ��ױƷ
	 */
	 Cosmetics selectcosmetics();
   /**
	 * �������л�ױƷ
	 * @return
	 */
   ArrayList< Cosmetics> selectCosmetics();
	

}
