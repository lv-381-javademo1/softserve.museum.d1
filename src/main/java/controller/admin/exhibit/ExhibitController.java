package controller.admin.exhibit;

import dao.ExhibitDao;
import dto.ExhibitFullInfDto;
import entity.Exhibit;
import service.exhibit.ExhibitFullInfService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrii Senchakevych
 */
@WebServlet(
        name = "ExhibitController",
        urlPatterns = "/exhibit"
)
public class ExhibitController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Exhibit> exhibitList = new ArrayList<>();
        ExhibitDao exhibitDao = new ExhibitDao();
        ExhibitFullInfService exhibitFullInfService = new ExhibitFullInfService();
        List<ExhibitFullInfDto> exhibitFullInfDtoList = new ArrayList<>();

        try {
            exhibitList = exhibitDao.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Exhibit exhibit : exhibitList) {
            exhibitFullInfDtoList.add(exhibitFullInfService.entityToDto(exhibit));
        }

        request.setAttribute("exhibits", exhibitFullInfDtoList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/pages/exhibit.jsp");
        dispatcher.forward(request, response);

    }
}
