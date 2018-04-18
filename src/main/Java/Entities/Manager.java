package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Candy Abebe on 4/5/2018.
 */
@Entity
public class Manager {
    @Id
    String ManagerId;
    String Name;
    String Department;
    String Password;

    public Manager() {
    }

    public String getManagerId() {
        return ManagerId;
    }

    public void setManagerId(String managerId) {
        ManagerId = managerId;
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
