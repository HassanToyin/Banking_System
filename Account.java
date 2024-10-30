
import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private String accountName;
    private Long accountNumber;
    private Double balance;
    private String accountType;

    public Account(String accountName,Long accountNumber,Double balance,String accountType){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public void displayAccountInfo(){
        System.out.println("AccountName:" + accountName);
        System.out.println("AccountNumber:" + accountNumber);
        System.out.println("Balance : $ " + balance);
        System.out.println("Account Type" + accountType);
    }
}
