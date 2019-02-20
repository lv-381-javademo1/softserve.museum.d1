package dao;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Ostap Vdovychyn
 */
public interface Dao<T> {

    boolean add(T t) throws SQLException;

    List<T> findAll() throws SQLException;

    boolean delete(T t) throws SQLException;

    boolean update(T t) throws SQLException;

    T findOne(int id) throws SQLException;
}
