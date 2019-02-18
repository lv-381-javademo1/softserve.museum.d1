package util;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(
        urlPatterns = {
                "/hall",
                "/excursion",
                "/exhibit",
                "/bookedexcursion",
                "/archive",
                "/author",
        },
        filterName = "AdminFilter",
        description = "Filter all admin URLs"
)
public class IdAdminFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("In IdAdminFilter");
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("role") != "admin") {
            response.sendRedirect(request.getContextPath() + "/login?invalid=true"); // No logged-in user found, so redirect to login page.
        } else {
            chain.doFilter(req, resp); // Logged-in user found, so just continue request.
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
