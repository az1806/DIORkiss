package com.forward;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ChanPinFenLeiDao;
import com.dao.CompanyDao;
import com.dao.CosmeticsDao;
import com.dao.DongTaiDao;
import com.dao.LiuYanDao;
import com.dao.ZiXunDao;
import com.dao.impl.ChanPinFenLeiDaoImpl;
import com.dao.impl.CompanyDaoImpl;
import com.dao.impl.CosmeticsDaoImpl;
import com.dao.impl.DongTaiDaoImpl;
import com.dao.impl.LiuYanDaoImpl;
import com.dao.impl.ZiXunDaoImpl;
import com.entity.ChanPinFenLei;
import com.entity.Company;
import com.entity.Cosmetics;
import com.entity.DongTai;
import com.entity.LiuYan;
import com.entity.ZiXun;

public class productlist extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		CompanyDao comDao = new CompanyDaoImpl();
		Company com = comDao.queryCompany();
		request.setAttribute("company", com);
		
		ChanPinFenLeiDao cpfldao = new ChanPinFenLeiDaoImpl();
		ArrayList<ChanPinFenLei> cpfl = cpfldao.selectChanPinFenLei();
		
		int type;
		if(request.getParameter("type")==null){
			type=cpfl.get(0).getId();
		}else{
			type=Integer.parseInt(request.getParameter("type"));
		}
		CosmeticsDao cosmeticsDao = new CosmeticsDaoImpl();
		ArrayList<Cosmetics> co = cosmeticsDao.selectCosmetics(type);
		request.setAttribute("Cosmetics", co);
		request.setAttribute("cpfl", cpfl);		
		
		LiuYanDao lydao = new LiuYanDaoImpl();
		ArrayList<LiuYan> ly = lydao.selectLiuYan();
		request.setAttribute("liuyan", ly);

		ZiXunDao zxdao = new ZiXunDaoImpl();
		ArrayList<ZiXun> zx = zxdao.selectZiXun();
		request.setAttribute("zixun", zx);
		
		
		DongTaiDao DongTai = new DongTaiDaoImpl();
		ArrayList<DongTai> dt = DongTai.selectDongTai();
		request.setAttribute("dongtai", dt);
		
		
		 String ss = request.getParameter("sousuo");
		    if(ss!=null){
		    CosmeticsDao  cosdao=new CosmeticsDaoImpl();
		    ArrayList<Cosmetics> cos=cosdao.ssCosmetics(ss);
		    request.setAttribute("cosmeticst", cos);
			}

		request.getRequestDispatcher("productlist.jsp").forward(request, response);
	}

	
	
}
