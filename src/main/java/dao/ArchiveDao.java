package dao;

import entity.Archive;
import entity.Employee;
import entity.Excursion;
import util.CreateEntityFromDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static util.DbConnectionUtil.connect;

public class ArchiveDao implements Dao<Archive>, CreateEntityFromDao<Archive> {
    EmployeeDao employeeDao = new EmployeeDao();
    ExcursionDao excursionDao = new ExcursionDao();
    Archive archive;

    @Override
    public boolean add(Archive archive) throws SQLException {
        return false;
    }

    @Override
    public List<Archive> findAll() throws SQLException {
        List<Archive> archives = new ArrayList<>();
        String sql = "SELECT *  FROM archive " +
                "join employee on archive.ArchiveID = employee.EmployeeID " +
                "join excursion on excursion.ExcursionID = archive.ArchiveID";
        Statement statement = connect().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            archives.add(create(resultSet));

        }
        resultSet.close();
        statement.close();
        return archives;
    }

    @Override
    public boolean delete(Archive archive) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Archive archive) throws SQLException {
        return false;
    }

    @Override
    public Archive findOne(int id) throws SQLException {
        Excursion excursion = new Excursion();
        String sql = "SELECT * FROM archive WHERE ArchiveID = ?";

        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            create(resultSet);
        }
        preparedStatement.close();
        resultSet.close();
        return archive;
    }

    @Override
    public Archive create(ResultSet resultSet) throws SQLException {
        archive = new Archive();
        int id = resultSet.getInt("ArchiveID");
        Timestamp StartTime = Timestamp.valueOf(resultSet.getString("StartTime"));
        Timestamp EndTime = Timestamp.valueOf(resultSet.getString("EndTime"));
        archive.setArchiveId(id);
        archive.setStartTime(StartTime);
        archive.setEndTime(EndTime);
        archive.setEmployeeId(employeeDao.create(resultSet));
        archive.setExcursionId(excursionDao.create(resultSet));
        return archive;
    }
}
