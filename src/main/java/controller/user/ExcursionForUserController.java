package controller.user;

import dao.ExcursionDao;
import entity.Excursion;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Ostap Vdovychyn
 */
@WebServlet("/book_excursion")
public class ExcursionForUserController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ExcursionDao excursionDao = new ExcursionDao();
        List<Excursion> excursions;
        try {
            excursions = excursionDao.findAll();
            request.setAttribute("excursions", excursions);

            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/pages/user/bookExcursion.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
