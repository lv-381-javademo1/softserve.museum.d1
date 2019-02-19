package service;

import dao.AdminDao;
import dao.EmployeeDao;
import dto.LoginDto;
import entity.Admin;
import entity.Employee;


public class AdminService {

    private EmployeeDao employeeDao = new EmployeeDao();

    public AdminService() {

    }

    public boolean isValid(LoginDto loginDto) {
        Employee employee;
        boolean result = true;
        try {
            employee = employeeDao.findByLogin(loginDto.getLogin());
            if (employee.equals(null)) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        result = result && (employee.getPassword().equals(loginDto.getPassword()));
        return result;
    }


}
