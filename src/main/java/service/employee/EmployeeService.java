package service.employee;

import dao.EmployeeDao;
import dto.LoginDto;
import entity.Employee;

/**
 * @author Ostap Vdovychyn
 */
public class EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDao();

    public EmployeeService() {

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
