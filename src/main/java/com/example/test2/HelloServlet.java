package com.example.test2;

import java.io.*;
import java.rmi.ServerException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello-servlet"})
public class HelloServlet extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        if ("your_username".equals(username) && "your_password".equals(password)) {
            // Successful login
            response.sendRedirect("welcome.jsp"); // Redirect to a welcome page
        } else {
            // Invalid
            response.sendRedirect("error.jsp"); // Redirect to an error page
        }

    }
}