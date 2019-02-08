package dao;

import entity.Hall;
import util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static util.DbConnectionUtil.connect;
import static util.DbConnectionUtil.disconnect;


public class HallDao implements Dao<Hall> {
    @Override
    public boolean addHall(Hall hall) throws SQLException {
        String sql = "INSERT INTO hall(Name) VALUES (?)";
        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setString(1, hall.getHallName());
        boolean rowInserted = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowInserted;
    }

    @Override
    public List<Hall> findAll() throws SQLException {
        return null;
    }

    @Override
    public boolean deleteBook(Hall hall) throws SQLException {
        return false;
    }

    @Override
    public boolean updateBook(Hall hallDao) throws SQLException {
        return false;
    }

    @Override
    public Hall findOne(int id) throws SQLException {
        Hall hall = new Hall();
        String sql = "SELECT * FROM hall WHERE Hall_id = ?";

        PreparedStatement statement = connect().prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("Name");
            int hallId = resultSet.getInt("Hall_ID");
            hall.setHallName(name);
            hall.setId(hallId);
        }
        resultSet.close();
        statement.close();


        return hall;

    }
}
