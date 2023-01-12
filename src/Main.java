import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name, Balance, Password to create an account");

        // create the user
        String name = sc.next();
        double balance = sc.nextDouble();
        String password = sc.next();

        //create the account
        SBIUser user = new SBIUser(name,balance,password);

        //add amount
        String message = user.addMoney(sc.nextInt());
        System.out.println(message);

        //check balance
        double amt = user.checkBalance();
        System.out.println(amt);

        //withdraw money
        System.out.println("Enter amount you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter your password");
        String pass = sc.next();
        System.out.println(user.withdrawMonet(money,pass));

        //rate of interest
        System.out.println(user.calculateInterest(10));
    }
}