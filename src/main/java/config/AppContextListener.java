package config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import java.sql.SQLException;

import static util.DbConnectionUtil.connect;
import static util.DbConnectionUtil.disconnect;

public class AppContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        try {
            connect();
            System.out.println("connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        try {
            disconnect();
            System.out.println("disconnected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
