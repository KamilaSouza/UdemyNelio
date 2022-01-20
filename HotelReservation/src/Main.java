

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException { //this method can throw an exception

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = scanner.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = simpleDateFormat.parse(scanner.next());  //convert the input string in date
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = simpleDateFormat.parse(scanner.next());

        if (!checkOut.after(checkIn)) //compares if check out is not after check in   (!false)
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = simpleDateFormat.parse(scanner.next());  //convert the input string in date
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = simpleDateFormat.parse(scanner.next());

            Date now = new Date();
            if(checkIn.before(now) || checkOut.before(now)){
                System.out.println("Error in reservation: Reservation dates must be in the future");
            }
            else if (!checkOut.after(checkIn)){
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            }
            else {
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);
            }
        }

        scanner.close();

    }
}
