package com.dao;

import java.util.ArrayList;

import com.entity.Cosmetics;

public interface CosmeticsDao{
	/**
	 * 查询化妆品
	 */
	 Cosmetics selectcosmetics(int id);
   /**
	 * 返回所有化妆品
	 * @return
	 */
   ArrayList< Cosmetics> selectCosmetics(int type);
   ArrayList< Cosmetics> selectCosmetics();
   ArrayList< Cosmetics> selectcos(String type);
}
