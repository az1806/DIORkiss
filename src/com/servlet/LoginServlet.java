package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.entity.User;
import com.util.Result;

/**
 * 处理登录请求
 * 
 * @author Administrator
 * 
 */
public class LoginServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		

	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		UserDao userdao = new UserDaoImpl();
		String name = java.net.URLDecoder.decode(request.getParameter("username"), "utf-8");
		String password =java.net.URLDecoder.decode(request.getParameter("password"), "utf-8");
		User user = userdao.selectUserByName(name, password);
		if (user != null && user.getPwd().equals(password)) {
			out.print(Result.toClient(true, "登陆成功"));
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			request.getRequestDispatcher("/admin/index.jsp").forward(request,
					response);
		} else {
			out.print("<script>alert('用户名或密码不正确')</script>");
			request.getRequestDispatcher("/DIORkiss/admin/register.jsp").forward(request,
					response);
		}
	}

}
