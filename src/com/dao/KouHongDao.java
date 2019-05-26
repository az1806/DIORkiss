package com.dao;

import java.util.ArrayList;

import com.entity.KouHong;



public interface KouHongDao {
	/**
	 * 查询口红品种
	 */
   KouHong selectkouhong(int type);
   /**
	 * 返回所有口红
	 * @return
	 */
   ArrayList<KouHong> selectKouHong();
	

}

