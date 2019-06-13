package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.ZiXunFenLeiDao;

import com.entity.ChanPinFenLei;
import com.entity.ZiXunFenLei;
import com.util.JdbcUtil;

public class ZiXunFenLeiDaoImpl implements ZiXunFenLeiDao {

	public ZiXunFenLei oneZiXunFenLei() {
		ZiXunFenLei zxfl = new ZiXunFenLei();
		ResultSet rs = JdbcUtil.querySQL("select * from ZiXunFenLei limit 6");
		// 查询限定行数
		try {
			while (rs.next()) {
				zxfl.setId(rs.getInt("id"));
				zxfl.setName(rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return zxfl;
	}

	public ArrayList<ZiXunFenLei> selectZiXunFenLei() {
		ArrayList<ZiXunFenLei> zxfls = new ArrayList<ZiXunFenLei>();

		ResultSet rs = JdbcUtil.querySQL("select * from ZiXunFenLei");
		if (rs != null) {
			try {
				while (rs.next()) {
					ZiXunFenLei zxfl = new ZiXunFenLei();
					zxfl.setId(rs.getInt("id"));
					zxfl.setName(rs.getString("name"));
					zxfls.add(zxfl);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return zxfls;
	}

	public ArrayList<ZiXunFenLei> selectZiXunFenLei(int type) {
		ArrayList<ZiXunFenLei> zxfls = new ArrayList<ZiXunFenLei>();

		ResultSet rs = JdbcUtil.querySQL("select * from ZiXunFenLei where tid="+type);
		if (rs != null) {
			try {
				while (rs.next()) {
					ZiXunFenLei zxfl = new ZiXunFenLei();
					zxfl.setId(rs.getInt("id"));
					zxfl.setName(rs.getString("name"));
					zxfls.add(zxfl);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return zxfls;
	}

	public int addzxfl( String name) {
		
		return JdbcUtil.updateSQL("INSERT into zixunfenlei(name) VALUES('"+name+"')");
	}

	public int delzxfl(int id) {
		
		return JdbcUtil.updateSQL("delete from zixunfenlei where id="+id);
	}


	public ZiXunFenLei onezxfl(int id) {
		ZiXunFenLei zxfl = new ZiXunFenLei();
		ResultSet rs = JdbcUtil.querySQL("select * from ZiXunFenLei where id="+id);
		// 查询限定行数
		try {
			while (rs.next()) {
				zxfl.setId(rs.getInt("id"));
				zxfl.setName(rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return zxfl;
	}

	public int updatezxfl(int id,String name) {
		
		return JdbcUtil.updateSQL("UPDATE zixunfenlei SET name='"+name+"' WHERE id='"+id+"' ");
	}
}
