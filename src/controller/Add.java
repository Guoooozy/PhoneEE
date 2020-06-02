package controller;

import eneity.Persion;
import eneity.PersionIm;
import service.PersionService;
import service.impl.PersionServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.function.DoublePredicate;
@WebServlet("/Add")
public class Add extends HttpServlet {
    PersionService persionService = new PersionServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String name = req.getParameter("name");
        String tel = req.getParameter("tel");
        String add = req.getParameter("add");
        Persion persion = (Persion)session.getAttribute("object");
        String username = persion.getUsername();
        PersionIm persionIm = new PersionIm(name,tel,add,username);
        persionService.add(persionIm);
        resp.sendRedirect("Show.jsp");
    }
}
