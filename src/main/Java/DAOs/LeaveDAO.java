package DAOs;

import Entities.Leave;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static DAOs.CRUDQualifiers.CRUDchoice.LeaveDao;

@RequestScoped
/**
 * Created by Candy Abebe on 4/12/2018.
 */
@CRUDQualifiers(LeaveDao)
public class LeaveDAO implements CRUD {
    @PersistenceContext
    EntityManager em;
    public Object findbyID(Object o) {
        Leave leave=(Leave)o;
        try {
            em.find(Leave.class,leave.getLeaveRefNum());
            return leave;
        }catch (Exception  ex){
            ex.printStackTrace();
            System.out.println("Car not found");
        }
        return null;
    }

    public boolean create(Object o) {
        Leave leave=(Leave)o;
        if(findbyID(leave)==null){
            try{
                em.persist(leave);
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("Car not persisted");
            }
        }
        return false;
    }

    public Object update(Object o) {
        Leave leave=(Leave)o;
        if(findbyID(leave)!=null){
            try{
                leave.setLeaveRefNum(leave.getLeaveRefNum());
                leave.setEmployee(leave.getEmployee());
                leave.setManager(leave.getManager());
                leave.setDateofDepature(leave.getDateofDepature());
                leave.setDateofReturn(leave.getDateofReturn());
                return leave;
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("not updated");
            }
        }

        return null;
    }

    public boolean delete(Object o) {
        Leave leave=(Leave)o;
        if(findbyID(leave)!=null){
            try{
                em.remove(leave);
                return true;
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("Object is not deleted");
            }

        }
        return false;
    }

    public List<Object> getAll(Object o) {
        Leave leave=(Leave)o;
        return null;
    }
}
