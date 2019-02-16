package controller.login;

import dao.AdminDao;
import dto.LoginDto;
import entity.Admin;
import service.AdminService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class AdminLoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/pages/admin/login.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AdminService adminService = new AdminService();
        LoginDto loginDto = new LoginDto();

        loginDto.setLogin(req.getParameter("login").trim());
        loginDto.setPassword(req.getParameter("password").trim());

            if (adminService.isValid(loginDto)) {
                HttpSession session = req.getSession(true);
                session.setAttribute("loginDto", loginDto);
                session.setAttribute("role","admin");
                Cookie cookie = new Cookie("id_session", session.getId());
                resp.addCookie(cookie);
                resp.sendRedirect("/hall");
            }else {
                req.setAttribute("error", "Bad Login or Password");
                RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/pages/admin/login.jsp");
                dispatcher.forward(req, resp);
            }


    }
}
