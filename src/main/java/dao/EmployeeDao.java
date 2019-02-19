package dao;

import entity.Employee;
import util.CreateEntityFromDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static util.DbConnectionUtil.connect;

public class EmployeeDao implements Dao<Employee>, CreateEntityFromDao<Employee> {
    Employee employee;

    @Override
    public boolean add(Employee employee) throws SQLException {
        String sql = "INSERT INTO hall(FirstName, LastName, Position) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setString(1, employee.getFirstName());
        preparedStatement.setString(2, employee.getLastName());
        preparedStatement.setString(3, employee.getPosition());
        boolean rowInserted = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowInserted;
    }

    @Override
    public List<Employee> findAll() throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        String sql = "SELECT * FROM employee";
        Statement statement = connect().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {

            employeeList.add(create(resultSet));
        }
        resultSet.close();
        statement.close();
        return employeeList;

    }

    @Override
    public boolean delete(Employee employee) throws SQLException {
        String sql = "DELETE FROM employee where EmployeeID =?";
        PreparedStatement statement = connect().prepareStatement(sql);
        statement.setInt(1, employee.getEmployeeId());
        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();
        return rowDeleted;
    }

    @Override
    public boolean update(Employee employee) throws SQLException {
        String sql = "UPDATE employee set FirstName = ?, LastName = ?, Position =? WHERE EmployeeID = ?";
        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setString(1, employee.getFirstName());
        preparedStatement.setString(2, employee.getLastName());
        preparedStatement.setString(3, employee.getPosition());
        preparedStatement.setInt(4, employee.getEmployeeId());
        boolean rowUpdated = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowUpdated;
    }

    @Override
    public Employee findOne(int id) throws SQLException {

        String sql = "SELECT * FROM employee WHERE EmployeeID = ?";

        PreparedStatement statement = connect().prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
          employee =  create(resultSet);
        }
        resultSet.close();
        statement.close();
        return employee;
    }

    public Employee findByLogin(String login) throws SQLException {

        String sql = "SELECT * FROM employee where Login = ?";

        PreparedStatement statement = connect().prepareStatement(sql);
        statement.setString(1, login);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            employee = create(resultSet);
        }
        resultSet.close();
        statement.close();
        return employee;
    }

    @Override
    public Employee create(ResultSet resultSet) throws SQLException {
        Employee employee = new Employee();
        int employeeID = resultSet.getInt("EmployeeID");
        String firstName = resultSet.getString("FirstName");
        String lastName = resultSet.getString("LastName");
        String position = resultSet.getString("Position");
        String login = resultSet.getString("Login");
        String password = resultSet.getString("Password");
        String role = resultSet.getString("Role");

        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setPosition(position);
        employee.setEmployeeId(employeeID);
        employee.setLogin(login);
        employee.setPassword(password);
        employee.setRole(role);
        return employee;
    }

}
