package dto;

import static util.DbConnectionUtil.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ExhibitStatisticDao {

//    ExhibitDao exhibitDao = new ExhibitDao();
//    EmployeeDao employeeDao = new EmployeeDao();
//    AuthorDao authorDao = new AuthorDao();

    public List<String> exhibitStatistic(String Name) throws SQLException {

        List<String> result = new ArrayList<>();

        String sql = "SELECT exhibit.ExhibitID, exhibit.Name AS 'Exhibit Name', exhibit.Material, exhibit.Technique, "
                + "hall.Name AS 'Hall', "
                + "author.FirstName AS 'Author FirstName', author.LastName AS 'Author LastName' "
                + "FROM exhibit "
                + "LEFT JOIN hall ON exhibit.Hall_ID = hall.Hall_ID "
                + "LEFT JOIN author ON exhibit.AuthorID = author.AuthorID "
                + "WHERE exhibit.Name = ?";
        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setString(1, Name);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()){

            String exhibitID = String.valueOf(resultSet.getInt("ExhibitID"));
            String exhibitName = resultSet.getString("Exhibit Name");
            String material = resultSet.getString("Material");
            String technique = resultSet.getString("Technique");
            String hall = resultSet.getString("Hall");
            String authorFirstname = resultSet.getString("Author FirstName");
            String authorLastname = resultSet.getString("Author LastName");


            result.add(exhibitID);
            result.add(exhibitName);
            result.add(material);
            result.add(technique);
            result.add(hall);
            result.add(authorFirstname);
            result.add(authorLastname);

        }

        return result;
    }
}
