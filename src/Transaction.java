public class Transaction {
    public String transactionID;
    public String date;
    public String amount;
    public String transactionType;
    public String description;
    public String ToDo;


    public Transaction(){

    }

    public Transaction(String transactionID, String date, String amount, String transactionType, String description)


    {
        this.transactionID= transactionID;
        this.date = date;
        this.amount = amount;
        this.transactionType = transactionType;
        this.description = description;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getToDo() {
        return ToDo;
    }

    public void setToDo(String toDo) {
        ToDo = toDo;
    }
}