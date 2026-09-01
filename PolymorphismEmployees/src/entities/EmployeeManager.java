package entities;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void showList(){
        System.out.println("\n----- EMPLOYEES REGISTRED -----\n");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Hours: " + employee.getHours());
            System.out.println("Value per hour: $" + employee.getValuePerHour());
            System.out.println("Payment = $" + employee.payment() + "\n");
        }
        System.out.println("---------------------------------");
    }
    
}
