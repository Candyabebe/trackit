package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import java.util.Date;

/**
 * Created by Candy Abebe on 4/5/2018.
 */
@Entity
@NamedQuery(name="getAll.car" ,query="SELECT Car FROM Car car")

public class Car {
   @Id
    int carNumber;
   @OneToOne
   Employee employee;
   Date Returndate;
   Date Borrowdate;
   String Task;
   String Destination;
   @OneToOne
   Manager manager;

    public Car() {
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getReturndate() {
        return Returndate;
    }

    public void setReturndate(Date returndate) {
        Returndate = returndate;
    }

    public Date getBorrowdate() {
        return Borrowdate;
    }

    public void setBorrowdate(Date borrowdate) {
        Borrowdate = borrowdate;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String task) {
        Task = task;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
