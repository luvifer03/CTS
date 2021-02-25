package com.cognizant.ems;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cognizant.ems.dao.EmployeeDAO;
import com.cognizant.ems.entity.Employee;
public class EMSMain 
{
 public static void main(String[] args) 
 {
  @SuppressWarnings("resource")
ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
  EmployeeDAO dao=context.getBean("empdao", EmployeeDAO.class);
        
  /*Employee emp=new Employee(103,"Srinivas",123.45f);
    dao.saveEmp(emp);*/
        
  /*Employee emp=new Employee(101,"Ajay Shankar",222.22f);
    dao.updateEmp(emp);*/
        
    List<Employee> emps=dao.getEmployees();
    for(Employee e : emps) {
    System.out.println(e);
    }
  }
}