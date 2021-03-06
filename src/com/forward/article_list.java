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
import com.dao.DongTaiDao;
import com.dao.LiuYanDao;
import com.dao.ZiXunDao;
import com.dao.ZiXunFenLeiDao;
import com.dao.impl.ChanPinFenLeiDaoImpl;
import com.dao.impl.CompanyDaoImpl;
import com.dao.impl.DongTaiDaoImpl;
import com.dao.impl.LiuYanDaoImpl;
import com.dao.impl.ZiXunDaoImpl;
import com.dao.impl.ZiXunFenLeiDaoImpl;
import com.entity.ChanPinFenLei;
import com.entity.Company;
import com.entity.DongTai;
import com.entity.LiuYan;
import com.entity.ZiXun;
import com.entity.ZiXunFenLei;

public class article_list extends HttpServlet {

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
		request.setAttribute("cpfl", cpfl);
		
		
		ZiXunFenLeiDao zxfldao = new ZiXunFenLeiDaoImpl();
		ArrayList<ZiXunFenLei> zxfl = zxfldao.selectZiXunFenLei();
		
		int type;
		if(request.getParameter("type")==null){
			type=zxfl.get(0).getId();
		}else{
			type=Integer.parseInt(request.getParameter("type"));
		}
		ZiXunDao zxdao = new ZiXunDaoImpl();
		ArrayList<ZiXun> zx = zxdao.selectZiXun(type);
		request.setAttribute("zixun", zx);
		request.setAttribute("zxfl", zxfl);
		
		
		LiuYanDao lydao = new LiuYanDaoImpl();
		ArrayList<LiuYan> ly = lydao.selectLiuYan();
		request.setAttribute("liuyan", ly);
		
		
		DongTaiDao DongTai = new DongTaiDaoImpl();
		ArrayList<DongTai> dt = DongTai.selectDongTai();
		request.setAttribute("dongtai", dt);
		request.getRequestDispatcher("/article_list.jsp").forward(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
