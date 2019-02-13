package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public interface CrudControllerInterface {
    void showList(HttpServletRequest request, HttpServletResponse response)throws SQLException, ServletException, IOException;
    void add(HttpServletRequest request, HttpServletResponse response)throws SQLException, ServletException, IOException;
    void update(HttpServletRequest request, HttpServletResponse response)throws SQLException, ServletException, IOException;
    void delete(HttpServletRequest request, HttpServletResponse response)throws SQLException, ServletException, IOException;
}
