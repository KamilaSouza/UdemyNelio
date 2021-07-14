import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();

        List<Employees> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the employee #" + (i + 1) + ":");
            System.out.println("Id:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Salary:");
            double salary = sc.nextDouble();
            list.add(new Employees(id, name, salary));
        }

        System.out.println("Enter the employee id that will have the salary increased:");
        int newId = sc.nextInt();
        Integer pos = position(list,newId);
        if (pos == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employees employees : list) {  // for each (important)
            System.out.println(employees);
        }

        sc.close();
    }
//    lambda:
//    public static boolean hasId(List<Employees> list, int id) {
//        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
//        return emp != null;
//    }

    public static Integer position(List<Employees> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) ;
            return i;
        }
        return null;
    }
}
