package controller.login;

import dto.LoginDto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.employee.EmployeeService;
import service.InputValidationService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

import static util.Md5Hash.getHash;

@WebServlet("/login")
public class AdminLoginController extends HttpServlet {
    Logger logger = LogManager.getLogger(AdminLoginController.class);

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
        EmployeeService employeeService = new EmployeeService();
        InputValidationService inputValidationService = new InputValidationService();
        LoginDto loginDto = new LoginDto();
        String login = req.getParameter("login").trim();
        String password = req.getParameter("password").trim();

        if (!inputValidationService.isValidInput(login) || !inputValidationService.isValidInput(password)) {
            req.setAttribute("error", inputValidationService.getMessage());
            RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/pages/login/login.jsp");
            dispatcher.forward(req, resp);
        }
        try {
            loginDto.setLogin(login);
            loginDto.setPassword(getHash(password));
        } catch (Exception e) {
            logger.error("exception is - ", e);
        }

        if (employeeService.isValid(loginDto)) {
            HttpSession session = req.getSession(true);
            session.setAttribute("adminName", loginDto.getLogin());
            session.setAttribute("role", "admin");
            Cookie cookie = new Cookie("id_session", session.getId());
            resp.addCookie(cookie);

            resp.sendRedirect("/hall");
        } else {
            req.setAttribute("error", "Bad Login or Password");
            RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/pages/login/login.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
