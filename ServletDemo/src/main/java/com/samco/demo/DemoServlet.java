package com.samco.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public DemoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String name = request.getParameter("uname");
		printWriter.println("Welcome " + name);
	}

}
