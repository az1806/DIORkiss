package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.entity.User;

/**
 * ´¦ÀíµÇÂ¼ÇëÇó
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

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");

		UserDao ud = new UserDaoImpl();
		User user = ud.selectUserByName(username);

		if (user != null && user.getPwd().equals(pwd)) { //µÇÂ¼³É¹¦
			request.getRequestDispatcher("/success.jsp").forward(request, response);
			return;
		}
		//µÇÂ¼Ê§°Ü
		response.sendRedirect("/DIORkiss/register.jsp");
	}

}
