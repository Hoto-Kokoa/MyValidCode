package com.test.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/r")
public class TestRi extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("service");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get");
        String username = req.getParameter("username");
        System.out.println(username);
        BufferedReader reader = req.getReader();
        String line = null;
        System.out.println(reader);
        System.out.println(reader.readLine());
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
//        ServletInputStream inputStream = req.getInputStream();
//        System.out.println(inputStream);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post");
    }
}
