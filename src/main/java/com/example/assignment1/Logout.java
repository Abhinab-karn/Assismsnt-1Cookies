package com.example.assignment1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "logoutServlet", urlPatterns ="/logout")
public class Logout extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out=response.getWriter();

        String name=request.getParameter("userName");
        String pass=request.getParameter("password");

            Cookie cookie=new Cookie("name" , name);
            cookie.setMaxAge(0);
            Cookie cookie1=new Cookie("pass", pass);
            cookie1.setMaxAge(0);
            response.addCookie(cookie);
            response.addCookie(cookie1);



            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
            rd.forward(request,response);
        }
    }

