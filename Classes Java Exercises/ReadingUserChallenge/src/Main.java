import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 0;
        try {
            System.out.println(getInputFromConsole(x));
        } catch (NullPointerException e) {
            getInputFromScanner(x);
        }
    }

    public static int getInputFromConsole(int x) {

        int sum = 0;

        do {
            x++;
            try {
                String userNumber = System.console().readLine("Enter number #" + x + ": ");
                int number = Integer.parseInt(userNumber);
                sum += number;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid Value");
                x -= 1;
            }
        } while (x < 5);
        System.out.println("The sum was: " + sum);
        return sum;
    }
    public static void getInputFromScanner(int x) {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        do {
            x++;
            try {
                System.out.println("Enter number #" + x + ": ");
                double number = Double.parseDouble(scanner.nextLine());
                sum += number;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid Value");
                x -= 1;
            }
        } while (x < 5);
        System.out.println("The sum was: " + sum);
    }

}
