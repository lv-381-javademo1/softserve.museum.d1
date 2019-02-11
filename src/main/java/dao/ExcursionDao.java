package dao;

import entity.Excursion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static util.DbConnectionUtil.connect;

public class ExcursionDao implements Dao<Excursion>{

    @Override
    public boolean add(Excursion excursion) throws SQLException {

        String sql = "INSERT INTO excursion(Name, Prise, StartTime, Duration) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connect().prepareStatement(sql);

        preparedStatement.setString(1, excursion.getName());
        preparedStatement.setInt(2, excursion.getPrice());
        preparedStatement.setString(3, excursion.getStartTime());
        preparedStatement.setString(4, excursion.getDuration());
        boolean rowsInserted = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowsInserted;
    }

    @Override
    public List<Excursion> findAll() throws SQLException {

        List<Excursion> excursionList = new ArrayList<>();
        String sql = "SELECT * FROM excursion";

        Statement statement = connect().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {

            int id = resultSet.getInt("ExcursionID");
            String name = resultSet.getString("Name");
            int prise = resultSet.getInt("Prise");
            String startTime = resultSet.getString("StartTime");
            String duration = resultSet.getString("Duration");

            Excursion excursion = new Excursion();
            excursion.setExcursionId(id);
            excursion.setName(name);
            excursion.setPrice(prise);
            excursion.setStartTime(startTime);
            excursion.setDuration(duration);

            excursionList.add(excursion);
        }

        resultSet.close();
        statement.close();
        return excursionList;
    }

    @Override
    public boolean delete(Excursion excursion) throws SQLException {
        String sql = "DELETE FROM excursion WHERE ExcursionID = ?";

        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setInt(1,excursion.getExcursionId());
        boolean rowDeleted = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowDeleted;
    }

    @Override
    public boolean update(Excursion excursion) throws SQLException {
        String sql = "UPDATE excursion SET Name = ?, Prise = ?, StartTime = ?, Duration = ? WHERE ExcursionID = ?";

        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setString(1, excursion.getName());
        preparedStatement.setInt(2, excursion.getPrice());
        preparedStatement.setString(3, excursion.getStartTime());
        preparedStatement.setString(4, excursion.getDuration());
        preparedStatement.setInt(5,excursion.getExcursionId());
        boolean rowsUpdated = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowsUpdated;
    }

    @Override
    public Excursion findOne(int id) throws SQLException {
        Excursion excursion = new Excursion();
        String sql = "SELECT * FROM excursion WHERE ExcursionID = ?";

        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){

            int eId = resultSet.getInt("ExcursionID");
            String name = resultSet.getString("Name");
            int prise = resultSet.getInt("Prise");
            String startTime = resultSet.getString("StartTime");
            String duration = resultSet.getString("Duration");

            excursion.setExcursionId(eId);
            excursion.setName(name);
            excursion.setPrice(prise);
            excursion.setStartTime(startTime);
            excursion.setDuration(duration);
        }
        preparedStatement.close();
        resultSet.close();
        return excursion;
    }
}
