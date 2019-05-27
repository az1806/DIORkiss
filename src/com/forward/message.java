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
import com.dao.FuZhuangDao;
import com.dao.KouHongDao;
import com.dao.LiuYanDao;
import com.dao.XiangShuiDao;
import com.dao.ZiXunDao;
import com.dao.impl.ChanPinFenLeiDaoImpl;
import com.dao.impl.CompanyDaoImpl;
import com.dao.impl.CosmeticsDaoImpl;
import com.dao.impl.DongTaiDaoImpl;
import com.dao.impl.FuZhuangDaoImpl;
import com.dao.impl.KouHongDaoImpl;
import com.dao.impl.LiuYanDaoImpl;
import com.dao.impl.XiangShuiDaoImpl;
import com.dao.impl.ZiXunDaoImpl;
import com.entity.ChanPinFenLei;
import com.entity.Company;
import com.entity.Cosmetics;
import com.entity.DongTai;
import com.entity.FuZhuang;
import com.entity.KouHong;
import com.entity.LiuYan;
import com.entity.XiangShui;
import com.entity.ZiXun;

public class message extends HttpServlet {

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
		LiuYanDao lydao=new LiuYanDaoImpl();
		ArrayList<LiuYan> lys = lydao.selectLiuYan();
		request.setAttribute("liuyan", lys);

		DongTaiDao DongTai = new DongTaiDaoImpl();
		ArrayList<DongTai> dt = DongTai.selectDongTai();
		request.setAttribute("dongtai", dt);
		request.getRequestDispatcher("/message.jsp").forward(request, response);
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
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out =response.getWriter();
		CompanyDao comDao = new CompanyDaoImpl();
		Company com = comDao.queryCompany();
		request.setAttribute("company", com);
		
		
String 	name=	request.getParameter("username");
String 	phone=		request.getParameter("phone");
String 	email=		request.getParameter("email");
String 	content=	request.getParameter("content");
	 String	sql="insert liuyan (name,phone,email,content)  values ('"+ name + "','" + phone + "','" + email + "','" +content  + "')";
			LiuYanDao lydao=new LiuYanDaoImpl();

			int ly=lydao.insertLiuYan(sql);
				if(ly>0){
					
					out.println("<script>alert('¡Ù—‘≥…π¶');"+"location.href='/DIORkiss/message'</script>");
					
					
				}else{
					out.println("<script>alert('¡Ù—‘ ß∞‹');"+"location.href='/DIORkiss/message'</script>");
				
				}
		
		

		
		
		
	}

}
