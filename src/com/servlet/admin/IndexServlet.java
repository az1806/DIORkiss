package com.servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ChanPinFenLeiDao;
import com.dao.CosmeticsDao;
import com.dao.UserDao;
import com.dao.impl.ChanPinFenLeiDaoImpl;
import com.dao.impl.CosmeticsDaoImpl;
import com.dao.impl.UserDaoImpl;
import com.entity.ChanPinFenLei;
import com.entity.Cosmetics;
import com.entity.User;
import com.util.Result;

public class IndexServlet extends BaseServlet {
	UserDao userdao = new UserDaoImpl();
	ChanPinFenLeiDao cpfldao = new ChanPinFenLeiDaoImpl();
	CosmeticsDao cosdao = new CosmeticsDaoImpl();
/**
 * 登陆方法
 * @param request
 * @param response
 * @throws ServletException
 * @throws IOException
 */
	public void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	public void register(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String name = java.net.URLDecoder.decode(request.getParameter("username"), "utf-8");
		String password =java.net.URLDecoder.decode(request.getParameter("pwd"), "utf-8");
		String pwd =java.net.URLDecoder.decode(request.getParameter("pwd2"), "utf-8");
		boolean user = userdao.insertUser(name, password);
		if (user==true) {
//			out.print(Result.toClient(true, "登陆成功"));
			request.getRequestDispatcher("index.jsp").forward(request,
					response);
		} else {
			out.print("<script>alert('用户名或密码不正确')</script>");
			request.getRequestDispatcher("register.jsp").forward(request,
					response);
		}
	}
	
	
	
	
/**
 * 获取所有产品类型
 * 
 * @param request
 * @param response
 * @throws ServletException
 * @throws IOException
 */
	public void getall(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<ChanPinFenLei> cpfl = cpfldao.selectChanPinFenLei();
		request.setAttribute("cpfl", cpfl);
		request.getRequestDispatcher("product-cate.jsp").forward(request,
				response);
	}
/**
 * 获取所有产品类型，并转到窗口
 * @param request
 * @param response
 * @throws ServletException
 * @throws IOException
 */
	public void getallcpfl(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("type"));
		ChanPinFenLei cpfl = cpfldao.oneChanPinFenLei(id);
		request.setAttribute("cpfl", cpfl);
		request.getRequestDispatcher("windowcpfl.jsp").forward(request,
				response);
	}
/**
 * 向产品类型里面添加
 * @param request
 * @param response
 * @throws ServletException
 * @throws IOException
 */
	public void addcpfl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = java.net.URLDecoder.decode(request.getParameter("cate_name"), "utf-8");
		int n = cpfldao.addChanPinFenLei(name);
		if (n > 0) {
			ArrayList<ChanPinFenLei> cpfl = cpfldao.selectChanPinFenLei();
			request.setAttribute("cpfl", cpfl);
			request.getRequestDispatcher("product-cate.jsp").forward(request,
					response);
		} else {
			System.out.println("添加失败");

		}

	}
/**
 * 删除产品类型
 * @param request
 * @param response
 * @throws ServletException
 * @throws IOException
 */
	public void delcpfl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("cpflid"));
		int n = cpfldao.delChanPinFenLei(id);
		if (n > 0) {
			ArrayList<ChanPinFenLei> cpfl = cpfldao.selectChanPinFenLei();
			request.setAttribute("cpfl", cpfl);
			request.getRequestDispatcher("product-cate.jsp").forward(request,
					response);
		} else {
			System.out.println("添加失败");

		}

	}
/**
 * 更新产品类型
 * @param request
 * @param response
 * @throws ServletException
 * @throws IOException
 */
	public void updatecpfl(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		int id = Integer.parseInt(request.getParameter("cpflid"));
		String name = java.net.URLDecoder.decode(request.getParameter("cpflname"), "utf-8");
		int n = cpfldao.updateChanPinFenLei(id, name);
		if (n > 0) {
			ArrayList<ChanPinFenLei> cpfl = cpfldao.selectChanPinFenLei();
			request.setAttribute("cpfl", cpfl);
			
			request.getRequestDispatcher("product-cate.jsp").forward(request,
					response);
		} else {
			System.out.println("添加失败");
		}
	}

	
	
	
	
	
	
	/**
	 * 获取所有商品对象
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void getcosall(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ArrayList<ChanPinFenLei> cpfl = cpfldao.selectChanPinFenLei();
		request.setAttribute("cpfl", cpfl);
		ArrayList<Cosmetics> cos = cosdao.selectallCosmetics();
		request.setAttribute("cos", cos);
		request.getRequestDispatcher("product-cos.jsp").forward(request,
				response);
	}
/**
 * 删除一个商品
 * @param request
 * @param response
 * @throws ServletException
 * @throws IOException
 */
	public void delcos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("cosid"));
		int n = cosdao.delCosmetics(id);
		if (n > 0) {
			ArrayList<ChanPinFenLei> cpfl = cpfldao.selectChanPinFenLei();
			request.setAttribute("cpfl", cpfl);
			ArrayList<Cosmetics> cos = cosdao.selectallCosmetics();
			request.setAttribute("cos", cos);
			request.getRequestDispatcher("product-cos.jsp").forward(request,
					response);
		} else {
			System.out.println("添加失败");

		}

	}
	/**
	 * 增加一个商品
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void addcos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int tid = Integer.parseInt(request.getParameter("tid"));
		int size=Integer.parseInt(request.getParameter("size"));
		double price=Double.parseDouble(request.getParameter("price"));
		String name = java.net.URLDecoder.decode(request.getParameter("name"), "utf-8");
		String colour = java.net.URLDecoder.decode(request.getParameter("colour"), "utf-8");
		String img = java.net.URLDecoder.decode(request.getParameter("img"), "utf-8");
		String coloursize = java.net.URLDecoder.decode(request.getParameter("coloursize"), "utf-8");
		String style = java.net.URLDecoder.decode(request.getParameter("style"), "utf-8");
		String effect = java.net.URLDecoder.decode(request.getParameter("effect"), "utf-8");
		String girlc = java.net.URLDecoder.decode(request.getParameter("girlc"), "utf-8");
		String bodyc = java.net.URLDecoder.decode(request.getParameter("bodyc"), "utf-8");
		String type = java.net.URLDecoder.decode(request.getParameter("type"), "utf-8");
		double ml=Double.parseDouble(request.getParameter("ml"));
		int n = cosdao.addcos(tid, name, colour, price, img, size, coloursize, style, effect, girlc, bodyc, type, ml);
		if (n > 0) {
			ArrayList<ChanPinFenLei> cpfl = cpfldao.selectChanPinFenLei();
			request.setAttribute("cpfl", cpfl);
			ArrayList<Cosmetics> cos = cosdao.selectallCosmetics();
			request.setAttribute("cos", cos);
			request.getRequestDispatcher("product-cos.jsp").forward(request,
					response);
		} else {
			System.out.println("添加失败");
		}
	}
	
	/**
	 * 获取所有商品类型并转到窗口
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void getallcos(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("type"));
		ArrayList<ChanPinFenLei> cpfl = cpfldao.selectChanPinFenLei();
		request.setAttribute("cpfl", cpfl);
		Cosmetics cos = cosdao.selectcosmetics(id);
		request.setAttribute("cos", cos);
		request.getRequestDispatcher("windowcos.jsp").forward(request,
				response);
	}
	/**
	 * 修改商品属性
	 */
	
	public void updatecos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out =response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		int tid = Integer.parseInt(request.getParameter("tid"));
		int size=Integer.parseInt(request.getParameter("size"));
		double price=Double.parseDouble(request.getParameter("price"));
		String name = java.net.URLDecoder.decode(request.getParameter("name"), "utf-8");
		String colour = java.net.URLDecoder.decode(request.getParameter("colour"), "utf-8");
		String img = java.net.URLDecoder.decode(request.getParameter("img"), "utf-8");
		String coloursize = java.net.URLDecoder.decode(request.getParameter("coloursize"), "utf-8");
		String style = java.net.URLDecoder.decode(request.getParameter("style"), "utf-8");
		String effect = java.net.URLDecoder.decode(request.getParameter("effect"), "utf-8");
		String girlc = java.net.URLDecoder.decode(request.getParameter("girlc"), "utf-8");
		String bodyc = java.net.URLDecoder.decode(request.getParameter("bodyc"), "utf-8");
		String type = java.net.URLDecoder.decode(request.getParameter("type"), "utf-8");
		double ml=Double.parseDouble(request.getParameter("ml"));
		int n = cosdao.updatecos(id,tid, name, colour, price, img, size, coloursize, style, effect, girlc, bodyc, type, ml);
		if (n > 0) {
			ArrayList<ChanPinFenLei> cpfl = cpfldao.selectChanPinFenLei();
			request.setAttribute("cpfl", cpfl);
			ArrayList<Cosmetics> cos = cosdao.selectallCosmetics();
			request.setAttribute("cos", cos);
			request.getRequestDispatcher("product-cos.jsp").forward(request,
					response);
			out.print("<script>window.parent.location.reload()</script>");
			
		} else {
			System.out.println("添加失败");
		}
	}
	
	
	public void chaxun(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = java.net.URLDecoder.decode(request.getParameter("namet"), "utf-8");
		String colour = java.net.URLDecoder.decode(request.getParameter("colourt"), "utf-8");
		String coloursize = java.net.URLDecoder.decode(request.getParameter("coloursizet"), "utf-8");
		String style = java.net.URLDecoder.decode(request.getParameter("stylet"), "utf-8");
		String effect = java.net.URLDecoder.decode(request.getParameter("effectt"), "utf-8");
		String girlc = java.net.URLDecoder.decode(request.getParameter("girlct"), "utf-8");
		String bodyc = java.net.URLDecoder.decode(request.getParameter("bodyct"), "utf-8");
		String type = java.net.URLDecoder.decode(request.getParameter("typet"), "utf-8");
		String tids = request.getParameter("tidt");
		int tid = 0;
		if (tids != null && !tids.equals("")) {
			tid = Integer.parseInt(tids);
		}
		ArrayList<ChanPinFenLei> cpfl = cpfldao.selectChanPinFenLei();
		request.setAttribute("cpfl", cpfl);
		ArrayList<Cosmetics> cos = cosdao.selectcos(tid, name, colour, coloursize, style, effect, girlc, bodyc, type);
			request.setAttribute("cos", cos);
			request.getRequestDispatcher("product-cos.jsp").forward(request,
					response);
	}
	
}
