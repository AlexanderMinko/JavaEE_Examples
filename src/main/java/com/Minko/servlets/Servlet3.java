package com.Minko.servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv3")
public class Servlet3 extends HttpServlet {

	private static final long serialVersionUID = -4910223463603026915L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.getSession().setAttribute("attr1", "serv3");
		resp.sendRedirect("/hello-world");
	}
}