package DAOs;

import java.util.List;

/**
 * Created by Candy Abebe on 4/12/2018.
 */
public interface CRUD {
    Object findbyID(Object o);
    boolean create (Object o);
    Object update(Object o);
    boolean delete(Object o);
    List<Object> getAll(Object o);
}
