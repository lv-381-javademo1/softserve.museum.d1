package util;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Ostap Vdovychyn
 */
public interface CreateEntityFromDao<T> {
    T create(ResultSet resultSet) throws SQLException;
}
