package dao;

import entity.Exhibit;
import util.CreateEntityFromDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static util.DbConnectionUtil.connect;

public class ExhibitDao implements Dao<Exhibit>, CreateEntityFromDao<Exhibit> {

    Exhibit exhibit;

    @Override
    public boolean add(Exhibit exhibit) throws SQLException {
        String sql = "INSERT INTO exhibit(EmployeeID, AuthorID, Hall_ID, Name, Material, Technique)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connect().prepareStatement(sql);

        preparedStatement.setInt(1, exhibit.getEmployeeId().getEmployeeId());
        preparedStatement.setInt(2, exhibit.getAuthorId().getAuthorId());
        preparedStatement.setInt(3, exhibit.getHall_Id().getId());
        preparedStatement.setString(4, exhibit.getName());
        preparedStatement.setString(5, exhibit.getMaterial());
        preparedStatement.setString(6, exhibit.getTechnique());
        boolean rowsInserted = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowsInserted;
    }

    @Override
    public List<Exhibit> findAll() throws SQLException {
        List<Exhibit> exhibitList = new ArrayList<>();
        String sql = "SELECT * FROM exhibit";

        Statement statement = connect().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            exhibitList.add(create(resultSet));
        }

        resultSet.close();
        statement.close();
        return exhibitList;
    }

    @Override
    public boolean delete(Exhibit exhibit) throws SQLException {
        String sql = "DELETE FROM exhibit WHERE ExhibitID = ?";

        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setInt(1, exhibit.getExhibitId());
        boolean rowDeleted = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowDeleted;
    }

    @Override
    public boolean update(Exhibit exhibit) throws SQLException {
        String sql = "UPDATE exhibit SET EmployeeID = ?, AuthorID = ?, "
                + "Hall_ID = ?, Name = ?, Material = ?, Technique = ? WHERE ExhibitID = ?";

        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setInt(1, exhibit.getEmployeeId().getEmployeeId());
        preparedStatement.setInt(2, exhibit.getAuthorId().getAuthorId());
        preparedStatement.setInt(3, exhibit.getHall_Id().getId());
        preparedStatement.setString(4, exhibit.getName());
        preparedStatement.setString(5, exhibit.getMaterial());
        preparedStatement.setString(6, exhibit.getTechnique());
        preparedStatement.setInt(7, exhibit.getExhibitId());

        boolean rowsUpdated = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowsUpdated;
    }

    @Override
    public Exhibit findOne(int id) throws SQLException {
        String sql = "SELECT * FROM exhibit WHERE ExhibitID = ?";

        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            exhibit = create(resultSet);
        }
        preparedStatement.close();
        resultSet.close();
        return exhibit;
    }

    @Override
    public Exhibit create(ResultSet resultSet) throws SQLException {
        Exhibit exhibit = new Exhibit();
        EmployeeDao employeeDao = new EmployeeDao();
        AuthorDao authorDao = new AuthorDao();
        HallDao hallDao = new HallDao();

        int exhibitId = resultSet.getInt("ExhibitID");
        int employeeId = resultSet.getInt("EmployeeID");
        int authorId = resultSet.getInt("AuthorID");
        int hallId = resultSet.getInt("Hall_ID");
        String name = resultSet.getString("Name");
        String material = resultSet.getString("Material");
        String technique = resultSet.getString("Technique");

        exhibit.setExhibitId(exhibitId);
        exhibit.setEmployeeId(employeeDao.findOne(employeeId));
        exhibit.setAuthorId(authorDao.findOne(authorId));
        exhibit.setHall_Id(hallDao.findOne(hallId));
        exhibit.setName(name);
        exhibit.setMaterial(material);
        exhibit.setTechnique(technique);
        return exhibit;
    }
}
