package com.servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ZiXunDao;
import com.dao.ZiXunFenLeiDao;
import com.dao.impl.ZiXunDaoImpl;
import com.dao.impl.ZiXunFenLeiDaoImpl;
import com.entity.ZiXun;
import com.entity.ZiXunFenLei;

public class ZiXunServlet extends BaseServlet {
	ZiXunFenLeiDao zxfldao = new ZiXunFenLeiDaoImpl();
	ZiXunDao zixundao = new ZiXunDaoImpl();

	public void getallzixun(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ArrayList<ZiXunFenLei> zxfl = zxfldao.selectZiXunFenLei();
		request.setAttribute("zxfl", zxfl);
		request.getRequestDispatcher("product-zxfl.jsp").forward(request,
				response);
	}

	public void getallzxfl(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("type"));
		ZiXunFenLei zxfl = zxfldao.onezxfl(id);
		request.setAttribute("zxfl", zxfl);
		request.getRequestDispatcher("windowzxfl.jsp").forward(request,
				response);
	}

	public void addzxfl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = java.net.URLDecoder.decode(request.getParameter("name"),
				"utf-8");
		int n = zxfldao.addzxfl(name);
		if (n > 0) {
			ArrayList<ZiXunFenLei> zxfl = zxfldao.selectZiXunFenLei();
			request.setAttribute("zxfl",zxfl);
			request.getRequestDispatcher("product-zxfl.jsp").forward(request,
					response);
		} else {
			System.out.println("ÃÌº” ß∞‹");

		}
	}

	public void delzxfl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("zxflid"));
		int n = zxfldao.delzxfl(id);
		if (n > 0) {
			ArrayList<ZiXunFenLei> zxfl = zxfldao.selectZiXunFenLei();
			request.setAttribute("zxfl",zxfl);
			request.getRequestDispatcher("product-zxfl.jsp").forward(request,
					response);
		} else {
			System.out.println("ÃÌº” ß∞‹");
		}
	}

	public void updatezxfl(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = java.net.URLDecoder.decode(request.getParameter("name"),
				"utf-8");
		int n = zxfldao.updatezxfl(id, name);
		if (n > 0) {
			ArrayList<ZiXunFenLei> zxfl = zxfldao.selectZiXunFenLei();
			request.setAttribute("zxfl",zxfl);
			request.getRequestDispatcher("product-zxfl.jsp").forward(request,
					response);
		} else {
			System.out.println("ÃÌº” ß∞‹");
		}
	}

	public void getallzixunt(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ArrayList<ZiXunFenLei> zxfl = zxfldao.selectZiXunFenLei();
		request.setAttribute("zxfl",zxfl);
		ArrayList<ZiXun> zixun = zixundao.selectZiXun();
		request.setAttribute("zixun",zixun);
		request.getRequestDispatcher("product-zixun.jsp").forward(request,
				response);
	}

	public void addzixun(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int tid = Integer.parseInt(request.getParameter("tid"));
		String name = java.net.URLDecoder.decode(request.getParameter("name"),
				"utf-8");
		String content = java.net.URLDecoder.decode(
				request.getParameter("content"), "utf-8");
		String h = java.net.URLDecoder.decode(request.getParameter("h"),
				"utf-8");
		int n = zixundao.addzixun(tid, h, name, content);
		if (n > 0) {
			ArrayList<ZiXunFenLei> zxfl = zxfldao.selectZiXunFenLei();
			request.setAttribute("zxfl",zxfl);
			ArrayList<ZiXun> zixun = zixundao.selectZiXun();
			request.setAttribute("zixun",zixun);
			request.getRequestDispatcher("product-zixun.jsp").forward(request,
					response);
		} else {
			System.out.println("ÃÌº” ß∞‹");

		}
	}

	public void delzixun(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("zixunid"));
		int n = zixundao.delzixun(id);
		if (n > 0) {
			ArrayList<ZiXunFenLei> zxfl = zxfldao.selectZiXunFenLei();
			request.setAttribute("zxfl",zxfl);
			ArrayList<ZiXun> zixun = zixundao.selectZiXun();
			request.setAttribute("zixun",zixun);
			request.getRequestDispatcher("product-zixun.jsp").forward(request,
					response);
		} else {
			System.out.println("ÃÌº” ß∞‹");

		}
	}

	public void getonezixun(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("type"));
		ZiXun zixun = zixundao.getonezixun(id);
		ArrayList<ZiXunFenLei> zxfl = zxfldao.selectZiXunFenLei();
		request.setAttribute("zxfl",zxfl);
		request.setAttribute("zixun",zixun);
		request.getRequestDispatcher("windowzixun.jsp").forward(request,
				response);
	}

	public void updatezixun(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		int tid = Integer.parseInt(request.getParameter("tid"));
		String h = java.net.URLDecoder.decode(request.getParameter("h"),
				"utf-8");
		String name = java.net.URLDecoder.decode(request.getParameter("name"),
				"utf-8");
		String content = java.net.URLDecoder.decode(
				request.getParameter("content"), "utf-8");
		int n = zixundao.updatezixun(id, h, name, content, tid);
		if (n > 0) {
			ArrayList<ZiXunFenLei> zxfl = zxfldao.selectZiXunFenLei();
			request.setAttribute("zxfl",zxfl);
			ArrayList<ZiXun> zixun = zixundao.selectZiXun();
			request.setAttribute("zixun",zixun);
			out.print("<script>document.parent.href ='product-zixun.jsp';</script>");
			request.getRequestDispatcher("product-zixun.jsp").forward(request,
					response);
		} else {
			System.out.println("ÃÌº” ß∞‹");
		}
	}
	
	public void chaxun(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String h = java.net.URLDecoder.decode(request.getParameter("ht"),
				"utf-8");
		String content = java.net.URLDecoder.decode(
				request.getParameter("contentt"), "utf-8");
		String tids = request.getParameter("tidt");
		int tid = 0;
		if (tids != null && !tids.equals("")) {
			tid = Integer.parseInt(tids);
		}
		ArrayList<ZiXunFenLei> zxfl = zxfldao.selectZiXunFenLei();
		request.setAttribute("zxfl",zxfl);
		ArrayList<ZiXun> zixun = zixundao.cxzx(tid, h, content);
		request.setAttribute("zixun",zixun);
		request.getRequestDispatcher("product-zixun.jsp").forward(request,
				response);
	}
}
