package com.xju.servlet;

import com.xju.dao.AddDao;
import com.xju.pojo.Me;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class MessageAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        String userName = request.getParameter("Books_Name");
        String userQq = request.getParameter("Books_Qq");
        String userEmail = request.getParameter("Books_Mail");
        String userCon = request.getParameter("Books_Info");
        AddDao addDao = new AddDao();
        Me me = new Me(userQq,userEmail,userName,userCon);
        addDao.addmess(me);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
