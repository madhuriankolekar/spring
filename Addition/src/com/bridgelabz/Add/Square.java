package com.bridgelabz.Add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Square extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	int k=(int) req.getAttribute("k");
	k=k*k;
	PrintWriter d=res.getWriter();
d.println(d);
}
}
                                                                                       





























