package com.servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CompanyDao;
import com.dao.impl.CompanyDaoImpl;
import com.entity.Company;

public class CompanyServlet extends BaseServlet {
	
	CompanyDao comdao=new CompanyDaoImpl();
	public void getallcom(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        
        Company com=comdao.queryCompany();
		request.setAttribute("company", com);
		request.getRequestDispatcher("product-company.jsp").forward(request,
				response);
	}

	public void updatecompany(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		String name = java.net.URLDecoder.decode(request.getParameter("name"), "utf-8");
		String phone = java.net.URLDecoder.decode(request.getParameter("phone"), "utf-8");
		String introduction = java.net.URLDecoder.decode(request.getParameter("introduction"), "utf-8");
		String address = java.net.URLDecoder.decode(request.getParameter("address"), "utf-8");
		String culture = java.net.URLDecoder.decode(request.getParameter("culture"), "utf-8");
		String email = java.net.URLDecoder.decode(request.getParameter("email"), "utf-8");
		String img = java.net.URLDecoder.decode(request.getParameter("img"), "utf-8");
		int n = comdao.updateCompany(id, name,phone, introduction, address, culture, email, img);
		if (n > 0) {
			Company com = comdao.queryCompany();
			request.setAttribute("company", com);
			request.getRequestDispatcher("product-company.jsp").forward(request,
					response);
		} else {
			System.out.println("ÃÌº” ß∞‹");

		}
	}

}
