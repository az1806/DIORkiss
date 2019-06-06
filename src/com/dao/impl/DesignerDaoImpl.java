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

}
