package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Details extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String Amarks=req.getParameter("Amarks");
		String Bmarks=req.getParameter("Bmarks");
		String stream=req.getParameter("stream");
		String subject=req.getParameter("subject");
		PrintWriter out=res.getWriter();
		//res.sendRedirect("NewFile.jsp");
		out.println(Amarks);
		 RequestDispatcher rd=req.getRequestDispatcher("done.jsp");
		 try {
			rd.include(req,res);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
