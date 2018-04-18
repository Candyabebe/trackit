package DAOs;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Candy Abebe on 4/13/2018.
 */
@Qualifier
@Retention(RUNTIME)
@Target({FIELD, TYPE, METHOD, PARAMETER})

public @interface CRUDQualifiers {
    CRUDchoice value();
    public enum CRUDchoice {
CarDao,EmployeeDao,LeaveDao,ManagerDao,MoneyTransactionDao
    }
}
