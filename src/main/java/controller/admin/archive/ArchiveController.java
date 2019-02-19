package controller.admin.archive;

import dao.ArchiveDao;
import entity.Archive;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ArchiveController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArchiveDao archiveDao = new ArchiveDao();
        List<Archive> archives;
        try {
            archives = archiveDao.findAll();
            request.setAttribute("archives", archives);

            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/pages/archive.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

