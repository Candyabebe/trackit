package Beans;

import CRUDIMPInterfaces.CarCRUDImplementation;
import DAOs.CRUD;
import DAOs.CRUDQualifiers;
import Entities.Car;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

import static DAOs.CRUDQualifiers.CRUDchoice.CarDao;


/**
 * Created by Candy Abebe on 4/12/2018.
 */
@Stateless
public class carBean implements CarCRUDImplementation {
@Inject
@CRUDQualifiers(value = CarDao)
CRUD crudCar;
    public Object addUser(Object o) {
      Car car=(Car)o;
     if(crudCar.create(car)){
         return car;
     }else{
         System.out.println("Unable to register the car");
     }
        return null;
    }

    public Object findUserbyID(Object o) {
        Car car=(Car)o;
        if(crudCar.findbyID(car)!=null){
            return car;
        }else{
            System.out.println("Unable to find this Car");
        }
        return null;
    }

    public Object updateUser(Object o) {
        Car car=(Car)o;
        if(crudCar.update(car)!=null){
            return car;
        }else{
            System.out.println("Car information was not updated");
        }
        return null;
    }

    public boolean deleteUser(Object o) {
        Car car=(Car)o;
        return false;
    }

    public List<Object> getAllUsers(Object o) {
        Car car=(Car)o;
        return null;
    }
}
