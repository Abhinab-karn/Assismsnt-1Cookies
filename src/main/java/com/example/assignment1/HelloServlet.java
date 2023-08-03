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

@WebServlet(name = "helloServlet", urlPatterns ="/abc")
public class HelloServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        PrintWriter out=response.getWriter();

        String name=request.getParameter("userName");
        String pass=request.getParameter("password");

        if (name.equals("admin") && pass.equals("admin")){
            Cookie cookie=new Cookie("name", name);

            response.addCookie(cookie);
            Cookie cookie1=new Cookie("pass", pass);

            response.addCookie(cookie1);


            RequestDispatcher rd=request.getRequestDispatcher("dashboard.jsp");
            rd.forward(request,response);
        }
        else {
            RequestDispatcher rq=request.getRequestDispatcher("index.jsp");
            rq.include(request,response);
        }


    }

}