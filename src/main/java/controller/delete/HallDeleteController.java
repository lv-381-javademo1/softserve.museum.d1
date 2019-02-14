package controller.delete;

import dao.HallDao;
import entity.Hall;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(
        name = "HallDeleteController",
        urlPatterns = "/hall/delete"
)
public class HallDeleteController extends HttpServlet {
    private HallDao hallDao = new HallDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);

        try {
            Hall hall = hallDao.findOne(id);


        System.out.println(hall.toString());
        hallDao.delete(hall);
        response.sendRedirect("/hall");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
