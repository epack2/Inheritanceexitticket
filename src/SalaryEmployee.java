
public class SalaryEmployee extends Employee {
    private double salary;

    SalaryEmployee(double salary, double amount, String name,int ID) {
        super(amount, name, ID);
        this.salary = salary;
    }
}
