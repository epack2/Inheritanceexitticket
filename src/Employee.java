
import java.util.Scanner;
public class Employee {

    private double amount;
    private String name;
    private int ID;
    public Employee(double amount, String name, int ID)
    {
        this.amount = amount;
        this.name = name;
        this.ID = ID;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate of the employee: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the name of the employee: ");
        String name = sc.next();
        System.out.println("Enter the ID of the employee: ");
        int ID = sc.nextInt();
        Employee employee = new Employee(rate, name, ID);
    }
}