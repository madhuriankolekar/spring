package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;

import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Login extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{String fname=req.getParameter("fname");
	String lname=req.getParameter("lname");
	String address=req.getParameter("address");
	String collegenmae=req.getParameter("collegename");
	String branch=req.getParameter("branch");
	String id=req.getParameter("id");
	//PrintWriter out= res.getWriter(); 
	//res.sendRedirect("NewFile.jsp");
	 RequestDispatcher rd=req.getRequestDispatcher("Details.jsp");
     try {
		rd.forward(req, res);
	} catch (ServletException e) {
		
		e.printStackTrace();
	}

	}
}

