package util;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface CreateEntityFromDao<T> {
    T create(ResultSet resultSet)throws SQLException;
}
