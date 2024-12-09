public class Main {

    public static void main(String[] args) {

//        BankAccount bobsAccount = new BankAccount("12345", 1000.00,
//                "Bob Brown", "myemail@bob.com", "(087) 123-4567");

        BankAccount bobsAccount = new BankAccount();

        System.out.println(bobsAccount.getNumber());
       System.out.println(bobsAccount.getBalance());


//        bankAccount.setNumber("4004005984234234");
//        bankAccount.setCustomerName("Pietro");
//        bankAccount.setCustomerEmail("pietro@gmail.com");
//        bankAccount.setCustomerNumber("+55 8398783 1176");

        bobsAccount.Deposit(100.00);
        bobsAccount.Withdraw(1000);


        System.out.println("Balance = " + bobsAccount.getBalance());

        bobsAccount.describeAccount();

    }
}
