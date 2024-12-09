public class Main {

        public static void main(String[] args) {
            // Creating Customer objects with different constructors
            Customer customer1 = new Customer("Ana", "ana@gmail.com");
            Customer customer2 = new Customer();
            Customer customer3 = new Customer("Bob", 500, "bob@gmail.com");

            System.out.println("Customer1: " + customer1.getName() + ", " + customer1.getCreditLimit() + ", " + customer1.getEmailAddress());
            System.out.println("Customer2: " + customer2.getName() + ", " + customer2.getCreditLimit() + ", " + customer2.getEmailAddress());
            System.out.println("Customer3: " + customer3.getName() + ", " + customer3.getCreditLimit() + ", " + customer3.getEmailAddress());

    }
}

