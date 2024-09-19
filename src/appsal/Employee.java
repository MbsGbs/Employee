
package appsal;

public class Employee {
    String id;
    String name;
    double rate;
    int hoursWorked;
    double deduction;
    double grossPay;
    double netPay;

    public Employee(String id, String name, double rate, int hoursWorked, double deduction) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.hoursWorked = hoursWorked;
        this.deduction = deduction;
        calculatePay();
    }

    private void calculatePay() {
        grossPay = rate * hoursWorked;
        netPay = grossPay - deduction;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getDeduction() {
        return deduction;
    }

    public double getNetPay() {
        return netPay;
    }

}




