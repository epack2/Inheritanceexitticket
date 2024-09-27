// Child class: HourlyEmployee
public class HourlyEmployee extends Employee {

    private double hoursWorked;

    public HourlyEmployee(double rate, double hoursWorked, String name, int ID) {
        super(rate, name, ID);  // Call parent constructor with rate
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay() {
        return getAmount() * hoursWorked;
    }


    public String toString() {
        return super.toString() + ", Hourly Rate: $" + getAmount() + ", Hours Worked: " + hoursWorked +
                ", Total Pay: $" + calculatePay();
    }
}
