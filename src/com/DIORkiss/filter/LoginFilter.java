package com.DIORkiss.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.User;

public class LoginFilter implements Filter{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request   =(HttpServletRequest)req;
		HttpServletResponse response =(HttpServletResponse)res;
		HttpSession session= request.getSession();
		
		String path= request.getRequestURI();
		System.out.println(path);
		User user=(User)session.getAttribute("user");
		if(user!=null){
			
			chain.doFilter(request,response);
			
		}else if(path.equals("/DIORkiss/admin/login.jsp")||path.equals("/DIORkiss/admin/user")||path.endsWith(".css")||path.endsWith(".js")||path.endsWith(".png")||path.endsWith(".jpg")){
			chain.doFilter(request,response);//·ÅÐÐ
				
				
		}
		else{
			response.sendRedirect("/DIORkiss/admin/login.jsp");
			
			
		}
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
