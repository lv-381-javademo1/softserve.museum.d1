package controller;

import dao.HallDao;
import entity.Hall;

import java.sql.SQLException;

import static util.DbConnectionUtil.disconnect;


public class Main {
    public static void main(String[] args) throws SQLException {
        HallDao hallDao = new HallDao();
        Hall hall =new Hall(1,"NEW HALL");
        try {
//            hall = hallDao.findOne(1);1
//            System.out.println(hall.toString());
            hallDao.addHall(hall);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
                disconnect();
            System.out.println(":ss");
        }
    }
}
