package controller;

import Sevice.UserSevice;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/user")
public class Servlet extends HttpServlet {
 UserSevice userSevice = new UserSevice();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        RequestDispatcher requestDispatcher;
        switch (action){
            case "create":
                int id = Integer.parseInt(req.getParameter("id"));
                String user = req.getParameter("user");
                String pass = req.getParameter("pass");
                String email = req.getParameter("email");

                User customer = new User(id,user,pass,email);
                userSevice.save(customer);
                resp.sendRedirect("/user");
                break;

            case "edit":
                int idedit = Integer.parseInt(req.getParameter("id"));
                String useredit = req.getParameter("user");
                String passedit = req.getParameter("pass");
                String emailedit = req.getParameter("email");


                User usered = new User(idedit,useredit,passedit,emailedit);

                int index = Integer.parseInt(req.getParameter("index"));
                userSevice.edit(index, usered);
                req.setAttribute("newacc",userSevice.list);
                requestDispatcher = req.getRequestDispatcher("userpass/showacc.jsp");
                requestDispatcher.forward(req,resp);
                break;

        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        RequestDispatcher dispatcher;
        if (action==null){
            action = "";
        }
        switch (action){
            case "create":
                resp.sendRedirect("userpass/createacc.jsp");
                break;
            case "edit":
                int indexEdit = Integer.parseInt(req.getParameter("index"));
                req.setAttribute("user",userSevice.list.get(indexEdit));
                dispatcher = req.getRequestDispatcher("userpass/editacc.jsp");
                dispatcher.forward(req,resp);
                break;
            case "delete":
                int index = Integer.parseInt(req.getParameter("index"));
                userSevice.remove(index);
                resp.sendRedirect("/user");
                break;
            default:
                req.setAttribute("newacc",userSevice.list);
                dispatcher = req.getRequestDispatcher("userpass/showacc.jsp");
                dispatcher.forward(req,resp);
        }
    }
}
