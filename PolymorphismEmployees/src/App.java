import java.util.Scanner;

import entities.Employee;
import entities.EmployeeManager;
import entities.OutsourcedEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        EmployeeManager employeeList = new EmployeeManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("== Welcome to ROTIV COMPANY ==");
        System.out.print("How many employees would you like to register?: ");
        int numberEmployees = sc.nextInt();

        for (int i=1; i<=numberEmployees; i++){
            System.out.println("Enter the data of the " + i + "° employee");

            System.out.print("Outsourced (y/n)? ");
            String outsourced = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per Hour: ");
            double valuePerHour = sc.nextDouble();

            if (outsourced.equalsIgnoreCase("Y")) {
                System.out.print("Additional Charge: ");
                double additionalCharge = sc.nextDouble();

                Employee employee2 = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);

                employeeList.addEmployee(employee2);
                
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employeeList.addEmployee(employee);
            }
            
        }
        sc.close();

        employeeList.showList();

    }
}
