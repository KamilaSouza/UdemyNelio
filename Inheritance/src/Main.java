import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Pedro", 1000.0, 400));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }

        for (Account acc : list) {
            acc.deposit(10.0);
        }

        for (Account acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance()); //%d integer
        }

        System.out.printf("Total Balance: %.2f%n", sum);

    }

}


//        Account account = new Account(1001, "Kami", 0.0);
//        BusinessAccount businessAccount = new BusinessAccount(1002, "May", 0.0, 500);
//
//        //UPCASTING
//        // the businessAccount is an account  "é um"
//        // assign a subclass to a superclass
//
//        Account account1 = businessAccount;
//        Account account2 = new BusinessAccount(1003, "Pedro", 0.0, 200.0);
//        Account account3 = new SavingsAccount(1004, "Hyan", 0.0, 0.01);
//
//        //DOWNCASTING
//
//        BusinessAccount account4 = (BusinessAccount) account2;
//        account4.loan(100.0);
//
//        //BusinessAccount account5 = (BusinessAccount) account3; will generate an error, so:
//
//        if (account3 instanceof BusinessAccount) {
//            BusinessAccount account5 = (BusinessAccount) account3;
//            account5.loan(200.0);
//            System.out.println("Loan!");
//        }
//
//        if (account3 instanceof SavingsAccount) {
//            SavingsAccount account5 = (SavingsAccount) account3;
//            account5.updateBalance();
//            System.out.println("Update");
//        }
//
//        Account account5 = new Account(1001, "Alex", 1000.0);
//        account5.withdraw(200.0);
//        System.out.println("Account 5 " + account5.getBalance()); //with discount
//
//        Account account6 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
//        account6.withdraw(200.0);
//        System.out.println("Account 6 " + account6.getBalance()); //without discount
//
//        Account account7 = new BusinessAccount(1003, "Joaquim", 1000.0, 500.0);
//        account7.withdraw(200.0);
//        System.out.println("Account 7 " + account7.getBalance());
//
//    }
//}
