package Beans;

import CRUDIMPInterfaces.EmployeeCRUDImp;
import DAOs.CRUD;
import DAOs.CRUDQualifiers;
import DAOs.EmployeeDAO;
import Entities.Car;
import Entities.Employee;


import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

import static DAOs.CRUDQualifiers.CRUDchoice.EmployeeDao;


/**
 * Created by Candy Abebe on 4/12/2018.
 */
@Stateless
public class Employeebean implements EmployeeCRUDImp {
    @Inject
    @CRUDQualifiers(value = EmployeeDao)
    CRUD crudemployee;
    public Object addUser(Object o) {
        Employee employee=(Employee)o;
        if(crudemployee.create(employee)){
            return employee;
        }else{
            System.out.println("Unable to register the car");
        }
        return null;
    }

    public Object findUserbyID(Object o) {
        Employee employee=(Employee)o;
        if(crudemployee.findbyID(employee)!=null){
            return employee;
        }else{
            System.out.println("Unable to find this Car");
        }
        return null;
    }

    public Object updateUser(Object o) {
        Employee employee=(Employee)o;
        return null;
    }

    public boolean deleteUser(Object o) {
        Employee employee=(Employee)o;
        return false;
    }

    public List<Object> getAllUsers(Object o) {

        Employee employee=(Employee)o;
        return null;
    }
}
