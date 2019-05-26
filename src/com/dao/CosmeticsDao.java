package com.dao;

import java.util.ArrayList;

import com.entity.Cosmetics;

public interface CosmeticsDao{
	/**
	 * 查询化妆品
	 */
	 Cosmetics selectcosmetics();
   /**
	 * 返回所有化妆品
	 * @return
	 */
   ArrayList< Cosmetics> selectCosmetics();
	

}
