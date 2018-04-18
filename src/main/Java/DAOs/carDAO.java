package DAOs;

import Entities.Car;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static DAOs.CRUDQualifiers.CRUDchoice.CarDao;

/**
 * Created by Candy Abebe on 4/12/2018.
 */
@RequestScoped
@CRUDQualifiers(CarDao)
public class carDAO implements CRUD{
    @PersistenceContext
    EntityManager em;

    public Object findbyID(Object o) {
        Car car=(Car)o;
        try {
            em.find(Car.class,car.getCarNumber());
            return car;
        }catch (Exception  ex){
            ex.printStackTrace();
            System.out.println("Car not found");
        }
        return null;
    }

    public boolean create(Object o) {
        Car car=(Car)o;
        if(findbyID(car)==null){
            try{
                em.persist(car);
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("Car not persisted");
            }
        }
        return false;
    }

    public Object update(Object o) {
        Car car=(Car)o;
        if(findbyID(car)!=null){
            try{
                car.setCarNumber(car.getCarNumber());
                car.setEmployee(car.getEmployee());
                car.setReturndate(car.getReturndate());
                car.setBorrowdate(car.getBorrowdate());
                car.setTask(car.getTask());
                car.setDestination(car.getDestination());
                car.setManager(car.getManager());
                em.merge(car);
            }catch(Exception  ex){
                ex.printStackTrace();
                System.out.println("Could not update car");
            }


        }
        return null;
    }

    public boolean delete(Object o) {
        Car car=(Car)o;
        if(findbyID(car)!=null){
            try{
                em.remove(car);
                return true;
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("Object is not deleted");
            }

        }
        return false;
    }

    public List<Object> getAll(Object o) {

        Car car=(Car)o;
        return null;
    }
}
