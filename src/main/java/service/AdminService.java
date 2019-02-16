package service;

import dao.AdminDao;
import dto.LoginDto;
import entity.Admin;


public class AdminService {

    private AdminDao adminDao = new AdminDao();

    public AdminService() {

    }

    public boolean isValid(LoginDto loginDto) {
        Admin admin ;
        boolean result = true;
        try {
            admin = adminDao.findByLogin(loginDto.getLogin());
            System.out.println(admin.toString());
            if(admin.equals(null)){
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return  false;
        }

        result = result && (admin.getPassword().equals(loginDto.getPassword()));
        return result;
    }


}
