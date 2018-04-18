package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by Candy Abebe on 4/5/2018.
 */
//@Entity
public class Leave {
    @Id
    int LeaveRefNum;
    @ManyToOne
    Employee employee;
    @ManyToOne
    Manager manager;
    Date DateofDepature;
    Date dateofReturn;

    public Leave() {
    }

    public int getLeaveRefNum() {
        return LeaveRefNum;
    }

    public void setLeaveRefNum(int leaveRefNum) {
        LeaveRefNum = leaveRefNum;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Date getDateofDepature() {
        return DateofDepature;
    }

    public void setDateofDepature(Date dateofDepature) {
        DateofDepature = dateofDepature;
    }

    public Date getDateofReturn() {
        return dateofReturn;
    }

    public void setDateofReturn(Date dateofReturn) {
        this.dateofReturn = dateofReturn;
    }
}
