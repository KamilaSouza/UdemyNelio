import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        method2();

        System.out.println("End of program");
    }

    public static void method2() {

        Scanner scanner = new Scanner(System.in);

        try {
            String[] vector = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vector[position]);

        } catch (ArrayIndexOutOfBoundsException e) {  // type of exception threw in this case
            System.out.println("Invalid Position");
            e.printStackTrace(); //shows the details of exception

        } catch (InputMismatchException e) {

        }

        scanner.close();
    }
}

