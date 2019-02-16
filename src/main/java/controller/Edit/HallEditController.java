package controller.Edit;

import dao.HallDao;
import entity.Hall;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(
        name = "HallEditController",
        urlPatterns = "/editHall"
)
public class HallEditController extends HttpServlet {

    private HallDao hallDao = new HallDao();

    private Hall hall = new Hall();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        System.out.println(id);
        try {
            hall = hallDao.findOne(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        req.setAttribute("hall", hall.getHallName());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/views/pages/forms/hallForm.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("In post");
        String newName = req.getParameter("Name").trim();
        hall.setHallName(newName);
        try{
            hallDao.update(hall);
        }catch (SQLException e){
            e.printStackTrace();
        }

        resp.sendRedirect("/hall");
    }
}
