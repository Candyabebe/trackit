package DAOs;

import Entities.Employee;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static DAOs.CRUDQualifiers.CRUDchoice.EmployeeDao;

@RequestScoped
/**
 * Created by Candy Abebe on 4/12/2018.
 */
@CRUDQualifiers(EmployeeDao)
public class EmployeeDAO implements CRUD {
    @PersistenceContext
    EntityManager em;
    public Object findbyID(Object o) {
        Employee emp=(Employee)o;
        try {
            em.find(Employee.class,emp.getStaffId());
            return emp;
        }catch (Exception  ex){
            ex.printStackTrace();
            System.out.println("Car not found");
        }
        return null;
    }

    public boolean create(Object o) {
        Employee emp=(Employee)o;
        if(findbyID(emp)==null){
            try{
                em.persist(emp);
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("Car not persisted");
            }
        }
        return false;
    }

    public Object update(Object o) {
        Employee emp=(Employee)o;
        if(findbyID(emp)!=null){
            try{
                emp.setStaffId(emp.getStaffId());
                emp.setName(emp.getName());
                emp.setDepartment(emp.getDepartment());
                emp.setPassword(emp.getPassword());
                em.merge(emp);
                return emp;
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("not updated");
            }
        }
        return null;
    }

    public boolean delete(Object o) {
        Employee emp=(Employee)o;
        if(findbyID(emp)!=null){
            try{
                em.remove(emp);
                return true;
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("Object is not deleted");
            }

        }
        return false;
    }

    public List<Object> getAll(Object o) {
        Employee emp=(Employee)o;
        return null;
    }
}
