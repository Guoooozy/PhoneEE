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

@WebServlet("/Change")
public class Change extends HttpServlet {
    PersionService persionService = new PersionServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String tel = req.getParameter("tel");
        String add = req.getParameter("add");
        HttpSession session = req.getSession();
        Persion persion = (Persion)session.getAttribute("object");
        String username = persion.getUsername();
        PersionIm persionIm = new PersionIm(name,tel,add,username);
        persionService.del(name);
        persionService.add(persionIm);
        req.getRequestDispatcher("Changer.jsp").forward(req,resp);
    }
}
