import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Main account = new Main();

        while (true) {

            System.out.println("Banking Account Management System");
            System.out.println("1. Account Creation");
            System.out.println("2. Transaction Tracking");
            System.out.println("3. Customer Management");
            System.out.println("4. getTransactionHistory");
            System.out.println("5. listAccounts");
            System.out.println("6. Manage Customer Info");
            System.out.println("7. Exit");

            System.out.println("Enter your choice: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    Account acount = new Account();
                    System.out.println("please enter your account number /n");
                    String AccountNumber = scanner.nextLine();
                    acount.setAccountNumber(AccountNumber);

                    System.out.println("please enter your name /n");
                    String customerName = scanner.nextLine();
                    acount.setCustomerName(customerName);

                    System.out.println("please enter your account balance /n");
                    String balance = scanner.nextLine();
                    acount.setBalance(balance);

                    System.out.println("please enter your account type /n");
                    String accountType = scanner.nextLine();
                    acount.setAccountType(accountType);


                    break;

                case 2:
                    Transaction thetransaction = new Transaction();
                    System.out.println("please enter your transaction ID /n");
                    String transactionID = scanner.nextLine();
                    thetransaction.setTransactionID(transactionID);

                    System.out.println("please enter the date transaction took place /n");
                    String date = scanner.nextLine();
                    thetransaction.setDate(date);

                    System.out.println("please enter the amount of the transaction  /n");
                    String amount = scanner.nextLine();
                    thetransaction.setAmount(amount);

                    System.out.println("please enter your transaction type /n");
                    String transactionType = scanner.nextLine();
                    thetransaction.setTransactionType(transactionType);

                    System.out.println("please enter your Description /n");
                    String description = scanner.nextLine();
                    thetransaction.setDescription(description);

                    break;

                case 3:
                    Customer customerDetails = new Customer();
                    System.out.println("please enter your name  /n");
                    String name = scanner.nextLine();
                    customerDetails.setName(name);

                    System.out.println("please enter your contact information  /n");
                    String contactInformation = scanner.nextLine();
                    customerDetails.setContactInformation(contactInformation);

                    System.out.println("please enter your identification (NIN) /n");
                    int customerID = scanner.nextInt();
                    customerDetails.setCustomerID(customerID);

                    break;

                case 4:
                    System.out.println("Enter Account Number: ");
                    int accountNumberForHistory = scanner.nextInt();
                    scanner.nextLine();

                    //ArrayList<Transaction> history = BankingSystem.getTransactionHistory(accountNumberForHistory);
                    //for (Transaction transaction : history) {
                    //System.out.println(transaction);
                    // }

                    break;

                case 5:
                    //BankingSystem.listAccounts();
                    break;
                case 6:
                    System.out.println("We offer the best service and are here to serve you better /n");
                case 7:
                    System.out.println("Exiting the Banking System. Do Have a Great Day /n");
                    System.exit(7);
                default:
                    System.out.println("Invalid choice .Please select a valid option /n");


            }
        }
    }
}
