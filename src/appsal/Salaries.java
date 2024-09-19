
package appsal;
import java.util.Scanner;

public class Salaries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no. of Employees: ");
        int numEmployees = scanner.nextInt();
        Employee[] employees = new Employee[numEmployees];
        
        double totalGrossPay = 0;
        double totalDeductions = 0;
        double totalNetPay = 0;

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details of employee " + (i + 1) + ": ");
            System.out.print("ID: ");
            String id = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Hours Worked: ");
            int hoursWorked = scanner.nextInt();
            System.out.print("Deduction: ");
            double deduction = scanner.nextDouble();

            employees[i] = new Employee(id, name, rate, hoursWorked, deduction);
            totalGrossPay += employees[i].getGrossPay();
            totalDeductions += employees[i].getDeduction();
            totalNetPay += employees[i].getNetPay();
        }

        displayPayroll(employees, totalGrossPay, totalDeductions, totalNetPay, numEmployees);
    }

    private static void displayPayroll(Employee[] employees, double totalGrossPay, double totalDeductions, double totalNetPay, int numEmployees) {
        System.out.println("\n----------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                          "ID", "Name", "Rate", "Hours", "Gross", "Deduction", "Netpay");
        for (Employee emp : employees) {
            System.out.printf("%-10s %-10s %-10.2f %-10d %-10.2f %-10.2f %-10.2f\n", 
                              emp.getId(), emp.getName(), emp.getRate(), emp.getHoursWorked(), 
                              emp.getGrossPay(), emp.getDeduction(), emp.getNetPay());
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("Total Salary Request: " + totalGrossPay);
        System.out.println("Total Employee Deduction: " + totalDeductions);
        System.out.println("Total Netpay: " + totalNetPay);
        System.out.println("No. of Employees: " + numEmployees);
    }
}