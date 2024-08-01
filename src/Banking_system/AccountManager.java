package Banking_system;

import java.util.Scanner;

public class AccountManager {
    Scanner scan = new Scanner(System.in);
    public void credit_money(long account_number)
    {
        System.out.print("Enter amount ");
        double amount = scan.nextLong();
        System.out.print("enter security pin ");
        String security_pin = scan.next();
    }
    public void debit_money(long account_number)
    {
        System.out.print("enter amount ");
        double amount = scan.nextLong();
        System.out.print("enter security pin ");
        String security_pin = scan.next();
    }
    public void transfer_money(long sender_account_number)
    {
        System.out.print("enter receiver account number ");
        long receiver_account_number = scan.nextLong();
        System.out.print("enter amount ");
        double amount = scan.nextDouble();
        System.out.print("enter security pin ");
        String security_pin = scan.next();
    }
    public void getBalance(long account_number)
    {
        System.out.print("enter security pin ");
        String security_pin = scan.nextLine();
    }
}
