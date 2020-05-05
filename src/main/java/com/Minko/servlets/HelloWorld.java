package com.Minko.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello-world")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = -2957995929292819085L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		//String attr1 = (String) req.getAttribute("attr1");
		String attr1 = (String) req.getSession().getAttribute("attr1");
		req.getSession().removeAttribute("attr1");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("Hello world" + attr1);
        //out.close();
	}
}
