package com.Minko.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/params")
public class GetParametersServlet extends HttpServlet {
	
	private static final long serialVersionUID = -22965861998887026L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String param1 = req.getParameter("param1");
		int param2 = Integer.parseInt(req.getParameter("param2"));
		boolean param3 = Boolean.parseBoolean(req.getParameter("param3"));
		String[] param4 = req.getParameterValues("param4");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}