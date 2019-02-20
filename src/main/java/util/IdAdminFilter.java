package util;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
/**
 * @author Andrii Senchakevych
 */
@WebFilter(
        servletNames = {
                "ArchiveController",
                "AuthorController",
                "BookedExcursionController",
                "ExcursionController",
                "ExcursionDeleteController",
                "ExhibitController",
                "HallController",
                "HallDeleteController",
                "HallEditController",
                "HallInsertController",
        },
        filterName = "AdminFilter",
        description = "Filter all admin URLs"
)
public class IdAdminFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("role") != "admin") {
            response.sendRedirect(request.getContextPath() + "/login?invalid=true");
        } else {
            chain.doFilter(req, resp); // Logged-in user found, so just continue request.
        }

    }

    @Override
    public void destroy() {

    }
}
