package controller.admin.author;

import dao.AuthorDao;
import entity.Author;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        AuthorDao authorDao = new AuthorDao();
        List<Author> authorList;
        try {

            authorList = authorDao.findAll();
            req.setAttribute("authors", authorList);

            RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/pages/author.jsp");
            dispatcher.forward(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
