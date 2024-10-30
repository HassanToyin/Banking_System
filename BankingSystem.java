import java.util.ArrayList;

public class BankingSystem {
    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public void createAccount(String name,Long number,Double balance,String type){
        accounts.add(new Account(name,number,balance,type));
        System.out.println("Account successfully created");
    }
    public void updateAccount(Long accountNumber, Double newBalance) {
        for (Account account : accounts){
            if (account.getAccountNumber() == accountNumber){
                account.setBalance(newBalance);
                System.out.println("Balance updated successfully!");
                return;
            }
        }
        System.out.println("Account not found");
    }

    public void addTransaction(Long accountNumber,int transactionId,String date,Double amount,String transactionType,String description) {
        transactions.add(new Transaction(accountNumber, transactionId, date, amount, transactionType, description)); {
            System.out.println("transaction added successfully");
        }

        //public void displayAllAccount(){
            //for (Account account : accounts) {
                //account.displayAccountInfo();
                //System.out.println("-----------");
            //}
        //}


          //public void displayTransaction(){
               // for (Transaction transaction : transactions){
                 //   transaction.displayTransaction();
                 //   System.out.println("------");
               // }

         // }

}}
