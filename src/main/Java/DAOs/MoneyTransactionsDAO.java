package DAOs;

import Entities.MoneyTransactions;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static DAOs.CRUDQualifiers.CRUDchoice.MoneyTransactionDao;

@RequestScoped
/**
 * Created by Candy Abebe on 4/12/2018.
 */
@CRUDQualifiers(MoneyTransactionDao)
public class MoneyTransactionsDAO implements CRUD {
    @PersistenceContext
    EntityManager em;

    public Object findbyID(Object o) {
        MoneyTransactions moneyTransactions=(MoneyTransactions)o;
        try {
            em.find(MoneyTransactions.class,moneyTransactions.getTransactionID());
            return moneyTransactions;
        }catch (Exception  ex){
            ex.printStackTrace();
            System.out.println("Car not found");
        }
        return null;
    }

    public boolean create(Object o) {
        MoneyTransactions moneyTransactions=(MoneyTransactions)o;
        if(findbyID(moneyTransactions)==null){
            try{
                em.persist(moneyTransactions);
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("Car not persisted");
            }
        }
        return false;
    }

    public Object update(Object o) {
        MoneyTransactions moneyTransactions=(MoneyTransactions)o;
        if(findbyID(moneyTransactions)!=null){
            try{
                moneyTransactions.setTransactionID(moneyTransactions.getTransactionID());
                moneyTransactions.setEmployee(moneyTransactions.getEmployee());
                moneyTransactions.setDate(moneyTransactions.getDate());
                moneyTransactions.setCashtask(moneyTransactions.getCashtask());
                em.merge(moneyTransactions);
                return moneyTransactions;
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("not updated");
            }
        }

        return null;
    }

    public boolean delete(Object o) {
        MoneyTransactions moneyTransactions=(MoneyTransactions)o;
        if(findbyID(moneyTransactions)!=null){
            try{
                em.remove(moneyTransactions);
                return true;
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("Object is not deleted");
            }

        }
        return false;
    }

    public List<Object> getAll(Object o) {
        MoneyTransactions moneyTransactions=(MoneyTransactions)o;
        return null;
    }
}
