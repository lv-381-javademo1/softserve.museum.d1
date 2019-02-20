package dao;

import entity.Archive;
import entity.Employee;
import entity.Excursion;
import util.CreateEntityFromDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static util.DbConnectionUtil.connect;

/**
 * @author Ostap Vdovychyn
 */
public class ArchiveDao implements Dao<Archive>, CreateEntityFromDao<Archive> {
    EmployeeDao employeeDao = new EmployeeDao();
    ExcursionDao excursionDao = new ExcursionDao();
    Archive archive;

    @Override
    public boolean add(Archive archive) throws SQLException {
        String sql = "INSERT INTO archive(EmployeeID, ExcursionID, StartTime, EndTime) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setInt(1, archive.getEmployee().getEmployeeId());
        preparedStatement.setInt(2, archive.getExcursion().getExcursionId());
        preparedStatement.setString(3, String.valueOf(archive.getStartTime()));
        preparedStatement.setString(4, String.valueOf(archive.getEndTime()));
        boolean rowInserted = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowInserted;
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
        String sql = "DELETE FROM archive where ArchiveID =?";
        PreparedStatement statement = connect().prepareStatement(sql);
        statement.setInt(1, archive.getArchiveId());
        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        return rowDeleted;
    }

    @Override
    public boolean update(Archive archive) throws SQLException {
        return false;
    }

    @Override
    public Archive findOne(int id) throws SQLException {
        String sql = "SELECT * FROM archive WHERE ArchiveID = ?";

        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            archive = create(resultSet);
        }
        preparedStatement.close();
        resultSet.close();
        return archive;
    }

    @Override
    public Archive create(ResultSet resultSet) throws SQLException {
        Archive archive = new Archive();
        int id = resultSet.getInt("ArchiveID");
        Timestamp StartTime = Timestamp.valueOf(resultSet.getString("StartTime"));
        Timestamp EndTime = Timestamp.valueOf(resultSet.getString("EndTime"));
        archive.setArchiveId(id);
        archive.setStartTime(StartTime);
        archive.setEndTime(EndTime);
        archive.setEmployee(employeeDao.create(resultSet));
        archive.setExcursion(excursionDao.create(resultSet));
        return archive;
    }
}
