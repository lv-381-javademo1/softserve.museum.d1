package dao;

import entity.Admin;
import util.CreateEntityFromDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static util.DbConnectionUtil.connect;

public class AdminDao implements CreateEntityFromDao<Admin> {

    Admin admin;

    public Admin findByLogin(String login) throws SQLException {

        String sql = "SELECT * FROM museume.admin where Login = ?";

        PreparedStatement statement = connect().prepareStatement(sql);
        statement.setString(1, login);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            admin = create(resultSet);
        }
        resultSet.close();
        statement.close();
        return admin;
    }

    @Override
    public Admin create(ResultSet resultSet) throws SQLException {

        Admin admin = new Admin();

        int id = resultSet.getInt("Admin_ID");
        String login = resultSet.getString("Login");
        String password = resultSet.getString("Password");
        String role = resultSet.getString("Role");

        admin.setId(id);
        admin.setLogin(login);
        admin.setPassword(password);
        admin.setRole(role);

        return admin;
    }
}
