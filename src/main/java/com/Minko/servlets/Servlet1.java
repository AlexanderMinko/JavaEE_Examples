package com.Minko.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv1") 
public class Servlet1 extends HttpServlet {

	private static final long serialVersionUID = 1092606119299630881L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		req.setAttribute("attr1", "serv1");
		req.getRequestDispatcher("/hello-world").forward(req, resp);
	}
}
