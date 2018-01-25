package com.neuedu.ajax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax")
public class AjaxServletr extends HttpServlet {

	private static List<String> names = new ArrayList<>();

	public AjaxServletr() {
		names.add("zhangsan");
		names.add("lisi");
		names.add("wangwu");
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String index = req.getParameter("idx");
		Integer idx = 0;
		try {
			idx = Integer.valueOf(index);
			idx = (idx < 0) ? 0 : (idx > 2) ? 2 : idx;
		} catch (Exception e) {}
	
		resp.getWriter().println( names.get(idx) );

	}
}
