package dao;

import java.sql.SQLException;
import java.util.List;


public interface Dao<T> {

    boolean addHall(T t) throws SQLException;

    List<T> findAll() throws SQLException;

    boolean deleteBook(T t) throws SQLException;

    boolean updateBook(T t) throws SQLException;

    T findOne(int id) throws SQLException;
}
