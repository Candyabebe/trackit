package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Candy Abebe on 4/5/2018.
 */
@Entity
public class Employee {
    @Id
    String StaffId;
    String Name;
    String Department;
    String Password;

    public Employee() {
    }

    public String getStaffId() {
        return StaffId;
    }

    public void setStaffId(String staffId) {
        StaffId = staffId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
