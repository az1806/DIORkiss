package com.dao;

import java.util.ArrayList;

import com.entity.KouHong;



public interface KouHongDao {
	/**
	 * ��ѯ�ں�Ʒ��
	 */
   KouHong selectkouhong(int type);
   /**
	 * �������пں�
	 * @return
	 */
   ArrayList<KouHong> selectKouHong();
	

}

