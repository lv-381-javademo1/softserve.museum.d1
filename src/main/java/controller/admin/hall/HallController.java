package controller.admin.hall;

import dao.HallDao;
import entity.Hall;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class HallController extends HttpServlet {
    private HallDao hallDao = new HallDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            List<Hall> halls;
            halls = hallDao.findAll();
            request.setAttribute("halls", halls);
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/pages/hall.jsp");
            dispatcher.forward(request, response);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
