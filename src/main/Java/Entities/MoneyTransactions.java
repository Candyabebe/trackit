package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

/**
 * Created by Candy Abebe on 4/5/2018.
 */
@Entity
public class MoneyTransactions {
    @Id
    int transactionID;
    @ManyToOne
    Employee employee;
    Date date;
    String cashtask;
    @ManyToOne
    Manager manager;
    Double amount;


    public MoneyTransactions() {
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCashtask() {
        return cashtask;
    }

    public void setCashtask(String cashtask) {
        this.cashtask = cashtask;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
