public class Customer {

    // customer information
    private String name;
    private double creditLimit;
    private String emailAddress;


    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public Customer(String name, String emailAddress) {
        this(name, 1000, emailAddress);
    }
    public Customer() {
        this("Nobody", "Nowhere");
    }


    public String getName() {
        // Customer(name, 0, null);
        return name;
    }

    public double getCreditLimit() {
        //Customer(null, creditLimit, null);
        return creditLimit;
    }

    public String getEmailAddress() {
        //Customer(null, 0, emailAddress);
        return emailAddress;

    }
}
