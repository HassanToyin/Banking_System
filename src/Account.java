public class Account {
    public String AccountNumber;
    public String CustomerName;
    public String Balance;
    public String AccountType;
    public int ToDo;

    public Account(){

    }

    public Account(String AccountNumber, String CustomerName, String Balance, String AccountType)


    {
        this.AccountNumber= AccountNumber;
        this.CustomerName = CustomerName;
        this.Balance = Balance;
        this.AccountType = AccountType;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String balance) {
        Balance = balance;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public int getToDo() {
        return ToDo;
    }

    public void setToDo(int toDo) {
        ToDo = toDo;
    }
}