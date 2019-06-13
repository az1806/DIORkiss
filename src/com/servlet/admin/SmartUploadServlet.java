package com.servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import com.util.Result;

public class SmartUploadServlet extends BaseServlet {
	public void saveImg(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		SmartUpload smart = new SmartUpload();
		smart.setCharset("utf-8");
		smart.initialize(getServletConfig(), request, response);
		try {
			smart.upload();
			smart.save("/img");
			String filename = smart.getFiles().getFile(0).getFileName();
			out.print(Result.toClient(true, filename));
		} catch (SmartUploadException e) {
			out.print(Result.toClient(false, "ÃÌº” ß∞‹"));
			e.printStackTrace();
		}
	}
		
	}

	

