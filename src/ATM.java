import java.util.Scanner;

/**
 * Created by amber on 2/3/17.
 */
import java.util.Scanner;

public class ATM {


    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = scanner.nextLine();

        if (name.isEmpty()) {
            throw new Exception("name not entered");
        } else {
            System.out.println("Welcome, " + name);
        }

        System.out.println("How can I help you? [checkBalance/WithdrawFunds/Cancel]");

        String response = scanner.nextLine();
        if (response.contains("check")) {
            System.out.println("Your balance is $100");
        } else if (response.contains("ith")) {
            System.out.println("How much?");
            int withdrawalAmt = scanner.nextInt();
            if (withdrawalAmt > 100) {

                System.out.println("Invalid amount!");

            } else {

                System.out.println("Remove cash now!");


            }
        } else if (response.contains("ancel")) {
            System.out.println("Thank you and please come again");


        }
    }
}

