package oop;
import java.util.*;
public class Management {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Accept employee information
        System.out.println("Enter employee information:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Employee Salary: ");
        double empSalary = scanner.nextDouble();

        // Create Employee object
        Employee employee = new Employee(empId, empName, empSalary);

        // Accept product information
        System.out.println("\nEnter product information:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Product Quantity: ");
        int quantity = scanner.nextInt();

        // Create Product object
        Product product = new Product(pid, price, quantity);

        // Calculate and print income tax for employee
        double incomeTax = employee.calcTax();
        System.out.println("\nIncome Tax for Employee: $" + incomeTax);

        // Calculate and print sales tax for product
        double salesTax = product.calcTax();
        System.out.println("Sales Tax for Product: $" + salesTax);

        scanner.close();

	}

}
