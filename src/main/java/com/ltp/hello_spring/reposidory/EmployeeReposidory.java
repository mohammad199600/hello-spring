package com.ltp.hello_spring.reposidory;

import com.ltp.hello_spring.Constants;
import com.ltp.hello_spring.Employee;
import java.util.*;

public class EmployeeReposidory {
private List<Employee> employees = new ArrayList<>();
    // Arrays.asList(
    // new Employee("Jim Halpert", 32, "Salesman"),
    // new Employee("Andy Bernard", 38, "Salesman"),
    // new Employee("Pam Beesly", 32, "Receptionist"),
    // new Employee("Michael Scott", 49, "Regional Manager"),
    // new Employee("Ryan Howard", 28, "Temp"),
    // new Employee("Angela Martin", 35, "Accountant"),
    // new Employee("Dwight Schrute", 37, "Assistant to the Regional Manager"));
    public List<Employee> getEmployees() {
        return this.employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    public Employee getEmployee(int index) {
        return employees.get(index);
    }

   
  

    public void setEmployee(Employee employee) {
        int index = getIndex(employee.getId());
        if (index == Constants.NOT_FOUND)
           employees.add(employee);
        else
            employees.set(index, employee);
    }
    public Integer getIndex(String id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id))
                return i;
        }
        return Constants.NOT_FOUND;
    }
}
