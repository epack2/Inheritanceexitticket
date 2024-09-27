import java.util.Scanner;

// Parent class: Employee
public class Employee {

    private double amount;
    private String name;
    private int ID;


    public Employee(double amount, String name, int ID) {
        this.amount = amount;
        this.name = name;
        this.ID = ID;
    }


    public double getAmount() {
        return amount;
    }


    public String getName() {
        return name;
    }


    public int getID() {
        return ID;
    }


    public String toString() {
        return "Employee Name: " + name + ", ID: " + ID;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you an hourly or salaried employee? (h/s): ");
        char choice = sc.next().charAt(0);

        if (choice == 'h') {
            System.out.println("Enter the hourly rate: ");
            double rate = sc.nextDouble();
            System.out.println("Enter hours worked: ");
            double hoursWorked = sc.nextDouble();
            System.out.println("Enter employee name: ");
            String name = sc.next();
            System.out.println("Enter employee ID: ");
            int ID = sc.nextInt();

            HourlyEmployee hourlyEmployee = new HourlyEmployee(rate, hoursWorked, name, ID);
            System.out.println(hourlyEmployee);

        } else if (choice == 's') {
            System.out.println("Enter the annual salary: ");
            double salary = sc.nextDouble();
            System.out.println("Enter employee name: ");
            String name = sc.next();
            System.out.println("Enter employee ID: ");
            int ID = sc.nextInt();


            SalaryEmployee salaryEmployee = new SalaryEmployee(salary, name, ID);
            System.out.println(salaryEmployee);
        } else {
            System.out.println("Invalid input.");
        }
    }
}