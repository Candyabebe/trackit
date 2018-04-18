package CRUDIMPInterfaces;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Candy Abebe on 4/17/2018.
 */
@Local
public interface EmployeeCRUDImp {
    Object addUser(Object o);
    Object findUserbyID(Object o);
    Object updateUser(Object o);
    boolean deleteUser(Object o);
    List<Object> getAllUsers(Object o);
}
