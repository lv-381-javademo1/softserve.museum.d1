package util;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;
import static util.DbConnectionUtil.*;

public class DbConnectionUtilTest {

    @Test
    public void connectToDb() throws SQLException {

        Connection connection = connect();
        assertEquals(connection != null, true);

    }

    @Test
    public void disconnectFromDb() throws SQLException {

        disconnect();
        assertEquals(conn, null);

    }
}