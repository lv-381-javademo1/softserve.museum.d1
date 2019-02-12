package dao;

import entity.Author;
import util.CreateEntityFromDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static util.DbConnectionUtil.connect;

public class AuthorDao implements Dao<Author>, CreateEntityFromDao<Author> {
    Author author;

    @Override
    public boolean add(Author author) throws SQLException {

        String sql = "INSERT INTO author(FirstName, LastName) VALUES (?, ?)";
        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setString(1, author.getFirstName());
        preparedStatement.setString(2, author.getLastName());
        boolean rowsInserted = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowsInserted;
    }

    @Override
    public List<Author> findAll() throws SQLException {

        List<Author> authorList = new ArrayList<>();
        String sql = "SELECT * FROM author";
        Statement statement = connect().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {

            int id = resultSet.getInt("AuthorID");
            String firstName = resultSet.getString("FirstName");
            String lastName = resultSet.getString("LastName");

            Author author = new Author();
            author.setAuthorId(id);
            author.setFirstName(firstName);
            author.setLastName(lastName);
            authorList.add(author);
        }

        resultSet.close();
        statement.close();
        return authorList;
    }

    @Override
    public boolean delete(Author author) throws SQLException {

        String sql = "DELETE FROM author WHERE AuthorID = ?";

        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setInt(1,author.getAuthorId());
        boolean rowDeleted = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowDeleted;
    }

    @Override
    public boolean update(Author author) throws SQLException {

        String sql = "UPDATE author SET FirstName = ?, LastName = ? WHERE AuthorID = ?";

        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setString(1, author.getFirstName());
        preparedStatement.setString(2, author.getLastName());
        preparedStatement.setInt(3, author.getAuthorId());
        boolean rowsUpdated = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowsUpdated;
    }

    @Override
    public Author findOne(int id) throws SQLException {
        String sql = "SELECT * FROM author WHERE AuthorID = ?";

        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            create(resultSet);
        }
        preparedStatement.close();
        resultSet.close();
        return author;
    }

    @Override
    public Author create(ResultSet resultSet) throws SQLException {

        int aId = resultSet.getInt("AuthorID");
        String firstName = resultSet.getString("FirstName");
        String lastName = resultSet.getString("LastName");

        author.setAuthorId(aId);
        author.setFirstName(firstName);
        author.setLastName(lastName);
        return author;
    }
}

