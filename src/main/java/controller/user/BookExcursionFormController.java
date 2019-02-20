package controller.user;

import dao.BookedExcursionDao;
import dao.ExcursionDao;
import entity.BookedExcursion;
import entity.Excursion;
import service.InputValidationService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Ostap Vdovychyn
 */
@WebServlet("/book_excursion_form")
public class BookExcursionFormController extends HttpServlet {
    private int id;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        id = Integer.parseInt(req.getParameter("id"));
        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/pages/user/bookExcursionForm.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        InputValidationService inputValidationService = new InputValidationService();
        BookedExcursion bookedExcursion = new BookedExcursion();
        BookedExcursionDao bookedExcursionDao = new BookedExcursionDao();
        Excursion excursion;
        ExcursionDao excursionDao = new ExcursionDao();

        System.out.println(id);
        String name = req.getParameter("name").trim();
        String email = req.getParameter("email").trim();
        if (!inputValidationService.isValidInput(name) || !inputValidationService.isValidEmailAddress(email)) {
            req.setAttribute("error", inputValidationService.getMessage());
            req.setAttribute("id", id);
            RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/pages/user/bookExcursionForm.jsp");
            dispatcher.forward(req, resp);
        } else {
            bookedExcursion.setUserName(name);
            bookedExcursion.setEmail(email);
            try {
                excursion = excursionDao.findOne(id);
                bookedExcursion.setExcursion(excursion);
                bookedExcursionDao.add(bookedExcursion);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            resp.sendRedirect("/");
        }
    }
}
