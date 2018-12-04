package com.example.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HowYaDoin")
public class HowYaDoin extends HttpServlet {
	
	public void init() throws ServletException{
		super.init();
	}

	public void destroy() {
		super.destroy();
	}
	protected void doGet (HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("HowYaDoin get");
		
	}
	
	protected void doPost (HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("HowYaDoin post");
		
	}

	protected void doPut (HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("HowYaDoin put");
		
	}
	
	protected void doDelete (HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("HowYaDoin delete");
		
	}
	
}
