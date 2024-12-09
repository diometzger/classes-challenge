public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount() {
        this("56789", 2.50,
                "Default name", "Default adress", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phone) {

        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;

    }
    public void Deposit(double deposit) {
        balance += deposit;
        System.out.println("Got " + deposit + " in your account. Now your fund are = " + balance);
    }

    public void Withdraw(double withdraw) {;
        if (balance - withdraw < 0) {
            System.out.println("You don't have enough to withdraw, try another number");
        } else {
            balance -= withdraw;
            System.out.println("Withdraw from + " + withdraw + " now your funds are = " + balance);
        }
        }
        public String getNumber() {
        return number;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String email) {
        this.customerEmail = email;
    }

    public void setCustomerNumber(String phoneNumber) {
        this.customerPhone = phoneNumber;
    }

    public void describeAccount() {

        System.out.println(number);
        System.out.println(customerName);
        System.out.println(customerEmail);
        System.out.println(customerPhone);
        System.out.println(balance);
    }
}

