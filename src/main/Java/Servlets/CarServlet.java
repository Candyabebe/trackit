package Servlets;

import CRUDIMPInterfaces.CarCRUDImplementation;
import CRUDIMPInterfaces.EmployeeCRUDImp;
import Entities.Employee;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Candy Abebe on 4/17/2018.
 */
@WebServlet(urlPatterns = "CarServlet")
public class CarServlet extends HttpServlet {
    @EJB
    CarCRUDImplementation carCRUDImplementation;
    @EJB
    EmployeeCRUDImp employeeCRUDImp;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("CarBooking.html").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
if(req.getParameter("EmployeeId")!=null){
    Employee employee=new Employee();
    String StaffId=req.getParameter("EmployeeId");
    employeeCRUDImp.findUserbyID(StaffId);
}

}


    }

