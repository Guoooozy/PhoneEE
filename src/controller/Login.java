package controller;

import com.mysql.cj.Session;
import eneity.Persion;
import service.LoginService;
import service.PersionService;
import service.impl.LoginServiceImpl;
import service.impl.PersionServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/Login")
public class Login extends HttpServlet {
    PersionService persionService = new PersionServiceImpl();
    LoginService loginService = new LoginServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Object object = (Object) loginService.Login(username,password);
        HttpSession session = req.getSession();
        if(object!=null){
            session.setAttribute("object",object);
            resp.sendRedirect("Main.jsp");
        }else{
            resp.sendRedirect("Login.jsp");
        }
    }
}
