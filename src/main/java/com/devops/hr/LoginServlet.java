package com.devops.hr;
import java.io.*;import javax.servlet.*;import javax.servlet.http.*;
public class LoginServlet extends HttpServlet{
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException{
res.getWriter().println("Login Servlet");
}}