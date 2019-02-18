package controller.insert;

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
        name = "HallInsertController",
        urlPatterns = "/insertHall"
)
public class HallInsertController extends HttpServlet {

    private Hall hall = new Hall();
    private HallDao hallDao = new HallDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/views/pages/forms/hall/hallInsertForm.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String newName = req.getParameter("Name").trim();
        hall.setHallName(newName);
        try{
            if (hall != null) {
                hallDao.add(hall);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        resp.sendRedirect("/hall");
    }
}
