import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        BankingSystem bankingSystem = new BankingSystem();

        while (true){
            System.out.println("1. CreATE Account /n2. Update Balance /n3. Add Transaction /n4.Exit");
            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.println("Enter account name:");
                String name = scanner.next();
                System.out.println("Enter account number:");
                Long number = scanner.nextLong();
                System.out.println("Enter initial balance:");
                Double balance = scanner.nextDouble();
                System.out.println("Enter account type:");
                String type = scanner.next();

                bankingSystem.createAccount(name,number, balance , type);

            }else if (choice == 2){
                System.out.println("Enter Account Number:");
                Long number = scanner.nextLong();
                System.out.println("Enter New Balance:");
                Double balance = scanner.nextDouble();
                bankingSystem.updateAccount(number, balance);

            }else if (choice == 3){
                System.out.println("Enter Account Number:");
                Long number = scanner.nextLong();
                System.out.println("Enter Transaction ID:");
                int transactionid = scanner.nextInt();
                System.out.println("Enter Date(dd-mm-yyyy)");
                String date = scanner.next();
                System.out.println("Enter Amount:");
                Double amount = scanner.nextDouble();
                System.out.println("Enter Transaction Type:");
                String transactionType = scanner.next();
                System.out.println("Enter Description:");
                String description = scanner.next();
                bankingSystem.addTransaction(number,transactionid,date,amount,transactionType, description);
            }else if(choice == 4){
                break;
            }
        }
    }
}
