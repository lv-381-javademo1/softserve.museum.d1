package util;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.*;
import static util.DbConnectionUtil.*;

public class DbConnectionUtilTest {

    @Test
    public void connectToDb() {

        try {
            Connection connection = connect();
            assertEquals(connection != null, true );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void disconnectFromDb() {

        try {
            disconnect();
            assertEquals(conn, null);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}