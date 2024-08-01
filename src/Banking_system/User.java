package Banking_system;
import java.sql.SQLOutput;
import java.util.Scanner;
public class User {
    Scanner scan=new Scanner(System.in);
    public void register()
    {
        System.out.print("Enter Name ");
        String Full_Name=scan.nextLine();
        System.out.print("Enter Email ");
        String Email=scan.nextLine();
        System.out.print("Enter Password ");
        String Password=scan.nextLine();
        if(user_exists(Email)){
            System.out.println("User already exists");
            return;
        }
    }
    public String Login()
    {
        System.out.print("Email ");
        String Email=scan.nextLine();
        System.out.print("Password ");
        String Password=scan.nextLine();
    }
}
