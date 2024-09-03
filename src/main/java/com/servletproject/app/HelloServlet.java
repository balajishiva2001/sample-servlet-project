package com.servletproject.app;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		System.out.println("Inside doGet function");
		httpServletResponse.setContentType("text/html");
		try (PrintWriter printWriter = httpServletResponse.getWriter()) {
			printWriter.println("<h2><b>Hello World</b></h2>");
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}
}
