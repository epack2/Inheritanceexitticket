
public class SalaryEmployee extends Employee {

    public double salary;
    SalaryEmployee(double salary, String name,int ID) {
        super(salary, name, ID);
        this.salary = salary;

    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " Annual Salary: $" + salary;
    }


}
