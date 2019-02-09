package dao;

import entity.Hall;
import util.DbConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static util.DbConnectionUtil.connect;
import static util.DbConnectionUtil.disconnect;


public class HallDao implements Dao<Hall> {
    @Override
    public boolean add(Hall hall) throws SQLException {
        String sql = "INSERT INTO hall(Name) VALUES (?)";
        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setString(1, hall.getHallName());
        boolean rowInserted = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowInserted;
    }

    @Override
    public List<Hall> findAll() throws SQLException {
        List<Hall> listHall = new ArrayList<>();
        String sql = "SELECT * FROM hall";
        Statement statement = connect().createStatement();
    ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            int id = resultSet.getInt("Hall_ID");
            String name = resultSet.getString("Name");

            Hall hall = new Hall();
            hall.setId(id);
            hall.setHallName(name);
            listHall.add(hall);
        }
        resultSet.close();
        statement.close();
        return listHall;
    }

    @Override
    public boolean delete(Hall hall) throws SQLException {
        String sql = "DELETE FROM hall where Hall_ID =?";
        PreparedStatement statement = connect().prepareStatement(sql);
        statement.setInt(1,hall.getId());
        boolean rowDeleted = statement.executeUpdate()>0;
        statement.close();
        return rowDeleted;
    }

    @Override
    public boolean update(Hall hallDao) throws SQLException {
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
