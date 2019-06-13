package com.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.DesignerDao;
import com.entity.Designer;

import com.mysql.jdbc.ResultSet;
import com.util.JdbcUtil;

public class DesignerDaoImpl implements DesignerDao {

	public ArrayList<Designer> selectDesigner() {
		ArrayList<Designer> des = new ArrayList<Designer>();

		ResultSet rs = JdbcUtil.querySQL("select * from Designer");
		if (rs != null) {
			try {
				while (rs.next()) {
					Designer u = new Designer();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setImg(rs.getString("img"));
					u.setPosition(rs.getString("position"));
					des.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return des;
	}
	public int adddes(String name, String position, String img) {
		return JdbcUtil.updateSQL("INSERT into designer (name,position,img) VALUES('"+name+"','"+position+"','"+img+"')");
	}

	public int deldesigner(int id) {
		
		return JdbcUtil.updateSQL("delete from designer where id="+id);
	}

	public Designer onedesigner(int id) {
		Designer des = new Designer();
		ResultSet rs = JdbcUtil.querySQL("select * from Designer where id="+id);
		if (rs != null) {
			try {
				while (rs.next()) {
					des.setId(rs.getInt("id"));
					des.setName(rs.getString("name"));
					des.setImg(rs.getString("img"));
					des.setPosition(rs.getString("position"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return des;
	}

	public int updatedes(int id,String name, String position, String img) {
		
		return JdbcUtil.updateSQL("update designer set name='"+name+"',position='"+position+"',img='"+img+"' where id="+id);
	}
}
