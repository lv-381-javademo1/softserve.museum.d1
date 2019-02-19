package controller.login;

import dto.LoginDto;
import service.AdminService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

import static util.Md5Hash.getHash;

@WebServlet("/login")
public class AdminLoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean invalid = Boolean.parseBoolean(req.getParameter("invalid"));
        req.setAttribute("invalid", invalid);
        req.setAttribute("invalidMessage", "Log in please");
        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/pages/login/login.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AdminService adminService = new AdminService();
        LoginDto loginDto = new LoginDto();

        loginDto.setLogin(req.getParameter("login").trim());
        try {
            loginDto.setPassword(getHash(req.getParameter("password").trim()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (adminService.isValid(loginDto)) {
            HttpSession session = req.getSession(true);
            session.setAttribute("adminName", loginDto.getLogin());
            session.setAttribute("role", "admin");
            Cookie cookie = new Cookie("id_session", session.getId());
            resp.addCookie(cookie);
            resp.sendRedirect("/hall");
        } else {
            req.setAttribute("error", "Bad Login or Password");
            RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/pages/admin/login.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
