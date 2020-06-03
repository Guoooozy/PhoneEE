package controller;

import eneity.Persion;
import service.LoginService;
import service.impl.LoginServiceImpl;
import service.impl.PersionServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/Register")
public class Register extends HttpServlet {
    LoginService loginService = new LoginServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String tel = req.getParameter("tel");
        String add = req.getParameter("add");
        String password = req.getParameter("password");
        loginService.Register(new Persion(username,tel,add,password));
        resp.sendRedirect("Login.jsp");
    }
}
