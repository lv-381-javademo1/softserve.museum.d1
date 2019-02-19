package controller;

import dao.ExhibitDao;
import dto.ExhibitFullInfDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExhibitController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<ExhibitFullInfDto> exhibitFullInfDtoList = new ArrayList<>();
        ExhibitDao exhibitDao = new ExhibitDao();
        try {
            exhibitFullInfDtoList = exhibitDao.exhibitStatistic();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("exhibits", exhibitFullInfDtoList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/pages/exhibit.jsp");
        dispatcher.forward(request, response);

    }
}
