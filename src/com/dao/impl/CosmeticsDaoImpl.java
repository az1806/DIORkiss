package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.CosmeticsDao;
import com.entity.Cosmetics;
import com.entity.ZiXun;

import com.util.JdbcUtil;

public class CosmeticsDaoImpl implements CosmeticsDao {
	public Cosmetics selectcosmetics(int id) {
		// TODO Auto-generated method stub
		Cosmetics u = new Cosmetics();
		ResultSet rs = JdbcUtil.querySQL("select * from Cosmetics where id="
				+ id);
		try {
			while (rs.next()) {
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setImg(rs.getString("img"));
				u.setColour(rs.getString("colour"));
				u.setPrice(rs.getDouble("price"));
				u.setBodyc(rs.getString("bodyc"));
				u.setTid(rs.getInt("tid"));
				u.setType(rs.getString("type"));
				u.setColoursize(rs.getString("coloursize"));
				u.setEffect(rs.getString("effect"));
				u.setGirlc(rs.getString("girlc"));
				u.setMl(rs.getDouble("ml"));
				u.setSize(rs.getInt("size"));
				u.setStyle(rs.getString("style"));
			}
			System.out.println(u);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	public ArrayList<Cosmetics> selectCosmetics(int type) {
		ArrayList<Cosmetics> cos = new ArrayList<Cosmetics>();
		ResultSet rs = JdbcUtil.querySQL("select * from Cosmetics where tid="
				+ type);
		if (rs != null) {
			try {
				while (rs.next()) {
					Cosmetics u = new Cosmetics();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setImg(rs.getString("img"));
					u.setColour(rs.getString("colour"));
					u.setPrice(rs.getDouble("price"));
					u.setBodyc(rs.getString("bodyc"));
					u.setTid(rs.getInt("tid"));
					u.setType(rs.getString("type"));
					u.setColoursize(rs.getString("coloursize"));
					u.setEffect(rs.getString("effect"));
					u.setGirlc(rs.getString("girlc"));
					u.setMl(rs.getDouble("ml"));
					u.setSize(rs.getInt("size"));
					u.setStyle(rs.getString("style"));
					cos.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cos;
	}

	public ArrayList<Cosmetics> selectCosmetics() {
		ArrayList<Cosmetics> cos = new ArrayList<Cosmetics>();
		ResultSet rs = JdbcUtil
				.querySQL("select * FROM cosmetics ORDER BY RAND() LIMIT 3");
		if (rs != null) {
			try {
				while (rs.next()) {
					Cosmetics u = new Cosmetics();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setImg(rs.getString("img"));
					u.setColour(rs.getString("colour"));
					u.setPrice(rs.getDouble("price"));
					u.setBodyc(rs.getString("bodyc"));
					u.setTid(rs.getInt("tid"));
					u.setType(rs.getString("type"));
					u.setColoursize(rs.getString("coloursize"));
					u.setEffect(rs.getString("effect"));
					u.setGirlc(rs.getString("girlc"));
					u.setMl(rs.getDouble("ml"));
					u.setSize(rs.getInt("size"));
					u.setStyle(rs.getString("style"));
					cos.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cos;
	}

	public ArrayList<Cosmetics> selectallCosmetics() {
		ArrayList<Cosmetics> cos = new ArrayList<Cosmetics>();
		ResultSet rs = JdbcUtil.querySQL("select * FROM cosmetics ");
		if (rs != null) {
			try {
				while (rs.next()) {
					Cosmetics u = new Cosmetics();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setImg(rs.getString("img"));
					u.setColour(rs.getString("colour"));
					u.setPrice(rs.getDouble("price"));
					u.setBodyc(rs.getString("bodyc"));
					u.setTid(rs.getInt("tid"));
					u.setType(rs.getString("type"));
					u.setColoursize(rs.getString("coloursize"));
					u.setEffect(rs.getString("effect"));
					u.setGirlc(rs.getString("girlc"));
					u.setMl(rs.getDouble("ml"));
					u.setSize(rs.getInt("size"));
					u.setStyle(rs.getString("style"));
					cos.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cos;
	}

	public ArrayList<Cosmetics> selectcos(String type) {
		ArrayList<Cosmetics> cos = new ArrayList<Cosmetics>();
		ResultSet rs = JdbcUtil
				.querySQL("select * from Cosmetics where name like '%" + type
						+ "%'");
		if (rs != null) {
			try {
				while (rs.next()) {
					Cosmetics u = new Cosmetics();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setImg(rs.getString("img"));
					u.setColour(rs.getString("colour"));
					u.setPrice(rs.getDouble("price"));
					u.setBodyc(rs.getString("bodyc"));
					u.setTid(rs.getInt("tid"));
					u.setType(rs.getString("type"));
					u.setColoursize(rs.getString("coloursize"));
					u.setEffect(rs.getString("effect"));
					u.setGirlc(rs.getString("girlc"));
					u.setMl(rs.getDouble("ml"));
					u.setSize(rs.getInt("size"));
					u.setStyle(rs.getString("style"));
					cos.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cos;
	}

	public int delCosmetics(int id) {
		// TODO Auto-generated method stub
		return JdbcUtil.updateSQL("delete from cosmetics where id=" + id);
	}

	public int addcos(int tid, String name, String colour, double price,
			String img, int size, String coloursize, String style,
			String effect, String girlc, String bodyc, String type, double ml) {

		return JdbcUtil
				.updateSQL("INSERT into cosmetics(tid,name,colour,price,img,size,coloursize,style,effect,girlc,bodyc,type,ml) VALUES('"
						+ tid
						+ "','"
						+ name
						+ "','"
						+ colour
						+ "','"
						+ price
						+ "','"
						+ img
						+ "','"
						+ size
						+ "','"
						+ coloursize
						+ "','"
						+ style
						+ "','"
						+ effect
						+ "','"
						+ girlc
						+ "','" + bodyc + "','" + type + "','" + ml + "')");
	}

	public int updatecos(int id, int tid, String name, String colour,
			double price, String img, int size, String coloursize,
			String style, String effect, String girlc, String bodyc,
			String type, double ml) {
		
		return JdbcUtil.updateSQL("UPDATE cosmetics SET tid='"
		+tid+"',name='"+name+"',colour='"+colour
		+"',price='"+price+"',img='"+img+"',size='"
		+size+"',coloursize='"+coloursize+"',style='"
		+style+"',effect='"+effect+"',girlc='"+girlc
		+"',bodyc='"+bodyc+"',type='"+type
		+"',ml='"+ml+"' WHERE id='"+id+"' ");
	}

	public ArrayList<Cosmetics> selectcos(int tid, String name, String colour,
			  String coloursize,
			String style, String effect, String girlc, String bodyc,
			String type) {
		String sql="select * from cosmetics where 1=1 ";
		if(tid>0){
			sql+="and tid='"+tid+"'";
		}
		if(name!=null&&!name.equals("")){
			sql+="and name like '%"+name+"%'";
		}
		if(colour!=null&&!colour.equals("")){
			sql+="and colour like '%"+colour+"%'";
		}
		
		if(coloursize!=null&&!coloursize.equals("")){
			sql+="and coloursize like '%"+coloursize+"%'";
		}
		if(style!=null&&!style.equals("")){
			sql+="and style like '%"+style+"%'";
		}
		if(effect!=null&&!effect.equals("")){
			sql+="and effect like '%"+effect+"%'";
		}
		if(girlc!=null&&!girlc.equals("")){
			sql+="and girlc like '%"+girlc+"%'";
		}
		if(bodyc!=null&&!bodyc.equals("")){
			sql+="and bodyc like '%"+bodyc+"%'";
		}
		if(type!=null&&!type.equals("")){
			sql+="and type like '%"+type+"%'";
		}
		
		ArrayList<Cosmetics> cos = new ArrayList<Cosmetics>();

		ResultSet rs = JdbcUtil.querySQL(sql);
		if (rs != null) {
			try {
				while (rs.next()) {
					Cosmetics u = new Cosmetics();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setImg(rs.getString("img"));
					u.setColour(rs.getString("colour"));
					u.setPrice(rs.getDouble("price"));
					u.setBodyc(rs.getString("bodyc"));
					u.setTid(rs.getInt("tid"));
					u.setType(rs.getString("type"));
					u.setColoursize(rs.getString("coloursize"));
					u.setEffect(rs.getString("effect"));
					u.setGirlc(rs.getString("girlc"));
					u.setMl(rs.getDouble("ml"));
					u.setSize(rs.getInt("size"));
					u.setStyle(rs.getString("style"));
					cos.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return cos;
	}

	public ArrayList<Cosmetics> ssCosmetics(String name) {
		ArrayList<Cosmetics> cos = new ArrayList<Cosmetics>();
		ResultSet rs = JdbcUtil.querySQL("select * from Cosmetics where name like '%"+name+"%'");
		if (rs != null) {
			try {
				while (rs.next()) {
					Cosmetics u = new Cosmetics();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setImg(rs.getString("img"));
					u.setColour(rs.getString("colour"));
					u.setPrice(rs.getDouble("price"));
					u.setBodyc(rs.getString("bodyc"));
					u.setTid(rs.getInt("tid"));
					u.setType(rs.getString("type"));
					u.setColoursize(rs.getString("coloursize"));
					u.setEffect(rs.getString("effect"));
					u.setGirlc(rs.getString("girlc"));
					u.setMl(rs.getDouble("ml"));
					u.setSize(rs.getInt("size"));
					u.setStyle(rs.getString("style"));
					cos.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cos;
	}
}
