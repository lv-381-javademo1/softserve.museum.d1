package dao;

import entity.BookedExcursion;
import entity.Excursion;
import util.CreateEntityFromDao;

import javax.servlet.RequestDispatcher;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static util.DbConnectionUtil.connect;

/**
 * @author Ostap Vdovychyn
 */
public class BookedExcursionDao implements Dao<BookedExcursion>, CreateEntityFromDao<BookedExcursion> {

    @Override
    public boolean add(BookedExcursion bookedExcursion) throws SQLException {
        String sql = "INSERT INTO bookedexcursion(ExcursionID, UserName, Email) VALUES (?, ?, ?)";

        PreparedStatement preparedStatement = connect().prepareStatement(sql);
        preparedStatement.setInt(1, bookedExcursion.getExcursion().getExcursionId());
        preparedStatement.setString(2, bookedExcursion.getUserName());
        preparedStatement.setString(3, bookedExcursion.getEmail());

        boolean inserted = preparedStatement.executeUpdate() > 0;
        return inserted;
    }

    @Override
    public List<BookedExcursion> findAll() throws SQLException {

        List<BookedExcursion> bookedExcursionList = new ArrayList<>();

        String sql = "SELECT * FROM bookedexcursion";

        Statement statement = connect().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            bookedExcursionList.add(create(resultSet));
        }

        resultSet.close();
        statement.close();
        return bookedExcursionList;
    }

    @Override
    public boolean delete(BookedExcursion bookedExcursion) throws SQLException {
        return false;
    }

    @Override
    public boolean update(BookedExcursion bookedExcursion) throws SQLException {
        return false;
    }

    @Override
    public BookedExcursion findOne(int id) throws SQLException {
        return null;
    }

    @Override
    public BookedExcursion create(ResultSet resultSet) throws SQLException {

        BookedExcursion bookedExcursion = new BookedExcursion();
        Excursion excursion;
        ExcursionDao excursionDao = new ExcursionDao();

        int id = resultSet.getInt("Id");
        String userName = resultSet.getString("UserName");
        String email = resultSet.getString("Email");
        String bookingTime = resultSet.getString("BookingTime");
        int excursionID = resultSet.getInt("ExcursionID");

        excursion = excursionDao.findOne(excursionID);

        bookedExcursion.setId(id);
        bookedExcursion.setUserName(userName);
        bookedExcursion.setEmail(email);
        bookedExcursion.setBookingTime(bookingTime);
        bookedExcursion.setExcursion(excursion);

        return bookedExcursion;
    }
}
