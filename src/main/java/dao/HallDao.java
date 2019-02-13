package dao;

import entity.Hall;
import util.CreateEntityFromDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static util.DbConnectionUtil.connect;

public class HallDao implements Dao<Hall>, CreateEntityFromDao<Hall> {

    Hall hall;

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
        while (resultSet.next()) {
            listHall.add(create(resultSet));
        }
        resultSet.close();
        statement.close();
        return listHall;
    }

    @Override
    public boolean delete(Hall hall) throws SQLException {
        String sql = "DELETE FROM hall where Hall_ID =?";
        PreparedStatement statement = connect().prepareStatement(sql);
        statement.setInt(1, hall.getId());
        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        return rowDeleted;
    }

    @Override
    public boolean update(Hall hall) throws SQLException {
        String sql = "UPDATE hall set Name = ? WHERE Hall_ID = ?";
        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setString(1, hall.getHallName());
        preparedStatement.setInt(2, hall.getId());
        boolean rowUpdated = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowUpdated;
    }

    @Override
    public Hall findOne(int id) throws SQLException {

        String sql = "SELECT * FROM hall WHERE Hall_id = ?";

        PreparedStatement statement = connect().prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            hall = create(resultSet);
        }
        resultSet.close();
        statement.close();

        return hall;

    }

    @Override
    public Hall create(ResultSet resultSet) throws SQLException {

        Hall hall = new Hall();

        int id = resultSet.getInt("Hall_ID");
        String hallName = resultSet.getString("Name");

        hall.setId(id);
        hall.setHallName(hallName);

        return hall;
    }
}
