package com.bridgelabz.Add;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class adds extends HttpServlet {
 public void  service(HttpServletRequest req,HttpServletResponse res) throws IOException///service is the unic name 
, ServletException
 {
	 int a=Integer.parseInt(req.getParameter("num1"));
	 int b=Integer.parseInt(req.getParameter("num2"));
	
	 
	 int k=a+b;
	 req.setAttribute("k", k);
	 RequestDispatcher rd=req.getRequestDispatcher("sq");
	 rd.forward(req, res);
	
	 
	 
	 /* PrintWriter out=res.getWriter();
	 out.println(k);*/
	 
	 ///PrintWriter out= res.getWriter();
 }
}
