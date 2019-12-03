package com.bridgelabz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class login extends HttpServlet{
///public abstract class login extends GenericServlet {

	//public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException 
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		{	  
			 
			String a = req.getParameter("uname");
			String b = req.getParameter("pass");
			// out.println(c);
			if (a.equals("madhuri") && b.equals("student")) {
				res.sendRedirect("display.jsp");
				                                                                          
			}else
			{
				res.sendRedirect("NewFile.jsp");
			}
		}
	}
}
