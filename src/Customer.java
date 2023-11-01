import javax.lang.model.element.Name;

public class Customer {
    private String Name;
    private String ContactInformation;
    private int CustomerID;
    private int ToDo;

    public Customer(){

    }
    public Customer(String Name, String ContactInformation, int CustomerID)
    {
        this.Name = Name;
        this.ContactInformation = ContactInformation;
        this.CustomerID = CustomerID;


    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContactInformation() {
        return ContactInformation;
    }

    public void setContactInformation(String contactInformation) {
        ContactInformation = contactInformation;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public int getToDo() {
        return ToDo;
    }

    public void setToDo(int toDo) {
        ToDo = toDo;
    }
}