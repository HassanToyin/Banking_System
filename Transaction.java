public class Transaction {
    private Long accountNumber;
    private int transactionId;
    private String date;
    private Double amount;
    private String transactionType;
    private String description;

    public Transaction(Long accountNumber,int transactionId,String date,Double amount,String transactionType,String description){
        this.accountNumber = accountNumber;
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
        this.transactionType = transactionType;
        this.description = description;
    }

    public void displayTransaction(){
        System.out.println("Transaction Id" + transactionId + "/ Date" + date + "/Amount " + "TransactionType" + transactionType + "Discription " + description);
    }
}
