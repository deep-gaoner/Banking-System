package Banking_system;

import java.util.Scanner;

public class AccountManager {
    Scanner scan = new Scanner(System.in);
    public void credit_money(long account_number)
    {
        System.out.println("Enter amount ");
        double amount = scan.nextLong();
        System.out.println("enter security pin");
        String security_pin = scan.next();
    }
    public void debit_money(long account_number)
    {
        System.out.println("enter amount ");
        double amount = scan.nextLong();
        System.out.println("enter security pin");
        String security_pin = scan.next();
    }
}
