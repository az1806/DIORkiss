package com.servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DesignerDao;
import com.dao.LiuYanDao;
import com.dao.impl.DesignerDaoImpl;
import com.dao.impl.LiuYanDaoImpl;
import com.entity.Designer;
import com.entity.LiuYan;

public class DesignerServlet extends BaseServlet {
DesignerDao desdao=new DesignerDaoImpl();
	LiuYanDao lydao=new LiuYanDaoImpl();
	public void getalldesigner(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Designer> des=desdao.selectDesigner();
		request.setAttribute("des", des);
		request.getRequestDispatcher("product-designer.jsp").forward(request,
 				response);
		
	}
	
	
	
	
	
	
	
	
	public void adddesigner(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = java.net.URLDecoder.decode(request.getParameter("name"), "utf-8");
		String position = java.net.URLDecoder.decode(request.getParameter("position"), "utf-8");
		String img = java.net.URLDecoder.decode(request.getParameter("img"), "utf-8");
        int n=desdao.adddes(name, position, img);
        if(n>0){
		ArrayList<Designer> des=desdao.selectDesigner();
		request.setAttribute("des", des);
		request.getRequestDispatcher("product-designer.jsp").forward(request,
 				response);
		}else{
			System.out.println("Ìí¼ÓÊ§°Ü");
		}
	}
	
	
	
	
	
	
	public void deldesigner(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    int id=Integer.parseInt(request.getParameter("type"));
    int n=desdao.deldesigner(id);
    if(n>0){
    	ArrayList<Designer> des=desdao.selectDesigner();
		request.setAttribute("des", des);
		request.getRequestDispatcher("product-designer.jsp").forward(request,
 				response);
    }else{
		System.out.println("É¾³ýÊ§°Ü");
	}
     }
	
	
	
	
	
	public void getonedes(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	int id=Integer.parseInt(request.getParameter("type"));
    Designer des=desdao.onedesigner(id);
    request.setAttribute("des", des);
    request.getRequestDispatcher("windowdesigner.jsp").forward(request,
				response);
	}
	
	public void updatedes(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name = java.net.URLDecoder.decode(request.getParameter("name"), "utf-8");
		String position = java.net.URLDecoder.decode(request.getParameter("position"), "utf-8");
		String img = java.net.URLDecoder.decode(request.getParameter("img"), "utf-8");
        int n=desdao.updatedes(id,name, position, img);
        if(n>0){
		ArrayList<Designer> des=desdao.selectDesigner();
		request.setAttribute("des", des);
		request.getRequestDispatcher("product-designer.jsp").forward(request,
 				response);
		}else{
			System.out.println("Ìí¼ÓÊ§°Ü");
		}
	}
	
	
	
	
	public void getallliuyan(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<LiuYan> lys=lydao.selectLiuYan();
		request.setAttribute("lys", lys);
		request.getRequestDispatcher("liuyan.jsp").forward(request,
 				response);
	}
	public void liuyan(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("type"));
		LiuYan lys=lydao.oneLiuYan(id);
		request.setAttribute("lys", lys);
		request.getRequestDispatcher("addliuyan.jsp").forward(request,
 				response);
	}
	
	public void addliuyan(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("type"));
		String hf = java.net.URLDecoder.decode(request.getParameter("hf"), "utf-8");
        int n=lydao.addliuyan(id, hf);
        if(n>0){
		ArrayList<LiuYan> lys=lydao.selectLiuYan();
		request.setAttribute("lys", lys);
		request.getRequestDispatcher("liuyan.jsp").forward(request,
 				response);
		}else{
			System.out.println("Ìí¼ÓÊ§°Ü");
		}
	}
	

	public void delliuyan(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    int id=Integer.parseInt(request.getParameter("type"));
    int n=lydao.delly(id);
    if(n>0){
    	ArrayList<LiuYan> lys=lydao.selectLiuYan();
		request.setAttribute("lys", lys);
		request.getRequestDispatcher("liuyan.jsp").forward(request,
 				response);
    }else{
		System.out.println("É¾³ýÊ§°Ü");
	}
     }
	public void chaxunly(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String zt = java.net.URLDecoder.decode(request.getParameter("hft"), "utf-8");
        ArrayList<LiuYan>  lys=lydao.chaxunly(zt);
		request.setAttribute("lys", lys);
		request.getRequestDispatcher("liuyan.jsp").forward(request,
 				response);
    
     }
	
}
