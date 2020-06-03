package filter;

import com.mysql.cj.Session;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
@WebFilter(urlPatterns = {"/Main.jsp","/Add.jsp","/Show.jsp"})
public class PersionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        Object object = session.getAttribute("object");
        if(object==null){
            response.sendRedirect("Login.jsp");
        }else{
            filterChain.doFilter(request,response);
        }

    }

    @Override
    public void destroy() {

    }
}
