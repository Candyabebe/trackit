package DAOs;

import Entities.Manager;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static DAOs.CRUDQualifiers.CRUDchoice.ManagerDao;

@RequestScoped
/**
 * Created by Candy Abebe on 4/12/2018.
 */
@CRUDQualifiers(ManagerDao)
public class ManagerDAO implements CRUD {
    @PersistenceContext
    EntityManager em;

    public Object findbyID(Object o) {
        Manager manager =(Manager)o;
        try {
            em.find(Manager.class,manager.getManagerId());
            return manager;
        }catch (Exception  ex){
            ex.printStackTrace();
            System.out.println("Car not found");
        }
        return null;
    }

    public boolean create(Object o) {
        Manager manager =(Manager)o;
        if(findbyID(manager)==null){
            try{
                em.persist(manager);
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("Car not persisted");
            }
        }
        return false;
    }

    public Object update(Object o) {
        Manager manager =(Manager)o;
        if(findbyID(manager)!=null){
            try{
                manager.setManagerId(manager.getManagerId());
                manager.setName(manager.getName());
                manager.setDepartment(manager.getDepartment());
                manager.setPassword(manager.getPassword());
                return manager;
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("not updated");
            }
        }

        return null;
    }

    public boolean delete(Object o) {
        Manager manager =(Manager)o;
        if(findbyID(manager)!=null){
            try{
                em.remove(manager);
                return true;
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("Object is not deleted");
            }

        }
        return false;
    }

    public List<Object> getAll(Object o) {
        Manager manager =(Manager)o;
        return null;
    }
}
