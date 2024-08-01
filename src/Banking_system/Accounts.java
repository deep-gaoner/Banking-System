package Banking_system;

import java.util.Scanner;

public class Accounts {
    Scanner scan = new Scanner(System.in);
    public long openAccount(String email) {
        System.out.print("Enter full name ");
        String fullName = scan.nextLine();
        System.out.print("Enter initial amount ");
        double initialAmount = scan.nextDouble();
        System.out.print("Enter security pin ");
        String securityPin = scan.nextLine();
        return 0;
    }
}
