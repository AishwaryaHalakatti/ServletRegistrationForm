/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import  javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

    @Override
  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2>Welcome to Register Servlet</h2>");
        //to store in containter we take string
       String name = req.getParameter("user_name");
       String password = req.getParameter("user_password");
       String email = req.getParameter("user_email");
       String gender = req.getParameter("user_gender");
       String course = req.getParameter("user_course");
       
       String cond=req.getParameter("condition");
   
       out.println(cond);
       
      
          if(cond.equals("checked"))
           {
              out.println("<h2> Name:"+name+"<h2>");
              out.println("<h2> Password:"+password+"<h2>");
              out.println("<h2> Email:"+email+"<h2>");
              out.println("<h2> Gender:"+gender+"<h2>");
              out.println("<h2> Course:"+course+"<h2>");
              
              
          }else{
              out.println("<h2>you have not accepted terms and condition</h2>");
              
          }
              
      }
  }
          
          
       

    
    