import entities.Employee;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number o employees: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.println("Outsourced (y/n)? ");
            char answer = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.println("Name: ");
            String nameE = scanner.nextLine();
            System.out.println("Hours: ");
            Integer hoursE = scanner.nextInt();
            System.out.println("Value per hour: ");
            Double valuePerHourE = scanner.nextDouble();
            if (answer == 'y') {
                System.out.println("Additional charge: ");
                Double additionalE = scanner.nextDouble();
                //  Employee employee = new OutsourceEmployee(nameE, hoursE, valuePerHourE, additionalE);
                list.add(new OutsourceEmployee(nameE, hoursE, valuePerHourE, additionalE));
            } else {
                //  Employee employee = new Employee(nameE, hoursE, valuePerHourE);
                list.add(new Employee(nameE, hoursE, valuePerHourE));
            }
        }
        System.out.println();
        System.out.println("Payments: ");
        for (Employee employee : list) {
            System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
        }
        scanner.close();
    }
}

