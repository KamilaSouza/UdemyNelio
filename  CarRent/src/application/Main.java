package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental data:");
        System.out.println("Car model: ");
        String carModel = scanner.nextLine();
        System.out.println("Pickup (dd/MM/yyyy hh:ss): ");
        Date start = simpleDateFormat.parse(scanner.nextLine());
        System.out.println("Return (dd/MM/yyyy hh:ss): ");
        Date finish = simpleDateFormat.parse(scanner.nextLine());

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Enter price per hour: ");
        double pricePerHour = scanner.nextDouble();
        System.out.println("Enter price per day: ");
        double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processBill(carRental);

        System.out.println("Bill: ");
        System.out.println("Basic payment: " + String.format("%.2f", carRental.getBill().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", carRental.getBill().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", carRental.getBill().getTotalPayment()));

        scanner.close();
    }
}
