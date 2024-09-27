public class Driver {
    public static void main(String[] args) {
        Employee[] arr;

        arr = new Employee[5];

        arr[0] = new Employee(12, "Mary", 123456);
        arr[1] = new HourlyEmployee(13, 20, "Jack", 223456);
        arr[2] = new SalaryEmployee(63795,  "John", 333456);
        arr[3] = new HourlyEmployee(15, 20,"Isabel", 443456);
        arr[4] = new HourlyEmployee(16, 20, "Jane", 553456);

        for (Employee employee : arr) {
            System.out.println(employee);
        }
    }
}
