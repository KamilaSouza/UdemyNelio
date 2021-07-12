import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int numberOfRent = 1;
        Renter[] vector = new Renter[n];

        for (int i = 0; i < vector.length; i++) {
        }

        System.out.println("How many rooms will be rented?");
        int rent = sc.nextInt();



        for (int i = 0; i < rent; i++) {
            System.out.println("Rent #" + numberOfRent++);
            sc.nextLine();
            String name = sc.nextLine();
            String email = sc.nextLine();
            int room = sc.nextInt();
            vector[room] = new Renter(name, email, room);
        }

        System.out.println("Busy Rooms:");
        for (int i = 0; i < n; i++) {
            if (vector[i] != null)
                System.out.println(vector[i].getRoom() + ": " + vector[i].getName() + ", " + vector[i].getEmail());
        }

        sc.close();
    }
}
