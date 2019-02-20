package controller.admin.bookedexcursion;

import dao.BookedExcursionDao;
import entity.BookedExcursion;

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
@WebServlet(
        name = "BookedExcursionController",
        urlPatterns = "/bookedexcursion"
)
public class BookedExcursionController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BookedExcursionDao bookedExcursionDao = new BookedExcursionDao();
        List<BookedExcursion> bookedExcursionList;

        try {
            bookedExcursionList = bookedExcursionDao.findAll();
            req.setAttribute("bookedExcursionList", bookedExcursionList);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/views/pages/bookedExcursion.jsp");
            requestDispatcher.forward(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
