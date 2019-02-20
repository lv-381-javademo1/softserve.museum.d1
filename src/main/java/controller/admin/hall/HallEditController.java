package controller.admin.hall;

import dao.HallDao;
import entity.Hall;
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
 * @author Andrii Senchakevych
 */
@WebServlet(
        name = "HallEditController",
        urlPatterns = "/editHall"
)
public class HallEditController extends HttpServlet {

    private HallDao hallDao = new HallDao();

    private Hall hall = new Hall();
    private int id;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        id = Integer.parseInt(req.getParameter("id"));
        System.out.println(id);
        try {
            hall = hallDao.findOne(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        req.setAttribute("hall", hall.getHallName());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/views/pages/forms/hall/hallEditForm.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        InputValidationService inputValidationService = new InputValidationService();
        String newName = req.getParameter("Name").trim();
        if (!inputValidationService.isValidInput(newName)) {
            req.setAttribute("error", inputValidationService.getMessage());
            req.setAttribute("id", id);
            RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/pages/forms/hall/hallEditForm.jsp");
            dispatcher.forward(req, resp);
        } else {
            hall.setHallName(newName);
            try {
                hallDao.update(hall);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            resp.sendRedirect("/hall");
        }
    }
}
