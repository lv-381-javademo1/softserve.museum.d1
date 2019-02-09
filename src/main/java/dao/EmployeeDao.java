package dao;

import entity.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static util.DbConnectionUtil.connect;

public class EmployeeDao implements Dao<Employee> {

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
            int id = resultSet.getInt("EmployeeId");
            String FirstName = resultSet.getString("FirstName");
            String LastName = resultSet.getString("LastName");
            String position = resultSet.getString("Position");

            Employee employee = new Employee();
            employee.setEmployeeId(id);
            employee.setFirstName(FirstName);
            employee.setLastName(LastName);
            employee.setPosition(position);
            employeeList.add(employee);
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
        Employee employee = new Employee();
        String sql = "SELECT * FROM employee WHERE EmployeeID = ?";

        PreparedStatement statement = connect().prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String firstName = resultSet.getString("FirstName");
            String lastName = resultSet.getString("LastName");
            String position = resultSet.getString("Position");
            int employeeID = resultSet.getInt("EmployeeID");
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setPosition(position);
            employee.setEmployeeId(employeeID);
        }
        resultSet.close();
        statement.close();
        return employee;
    }
}
