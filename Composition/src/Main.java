import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department's name: ");
        String departmentName = scanner.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scanner.nextLine();
        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();
        System.out.print("Base salary: ");
        double workerBaseSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));

        System.out.println("How many contracts to this worker? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract number " + (i + 1) + ":");
            System.out.println("Data (DD/MM/YYYY): ");
            Date contractDate = simpleDateFormat.parse(scanner.next());
            System.out.println("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = scanner.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/yyyy): ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
    }
}
