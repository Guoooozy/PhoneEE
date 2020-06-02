package filter;

import com.mysql.cj.Session;
import com.mysql.cj.x.protobuf.MysqlxNotice;
import eneity.Persion;
import eneity.PersionIm;
import service.PersionService;
import service.impl.PersionServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebFilter(urlPatterns = {"/Show.jsp"})
public class ShowPersionFilter implements Filter {
    PersionService persionService = new PersionServiceImpl();
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        Persion persion = (Persion)session.getAttribute("object");
        List<PersionIm> list = new ArrayList<>();
        list = persionService.showall(persion.getUsername());
        request.setAttribute("list",list);
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
