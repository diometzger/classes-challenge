import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        boolean isNumber = false;
        do {
            System.out.println("Write a number or character: ");
            try {
                double number = Double.parseDouble(scanner.nextLine());
                if (number < min) {
                    min = number;
                } if (number > max) {
                    max = number;
                }
            } catch (NumberFormatException badUserData) {
                System.out.println("Isn't a number. Quitting...");
                isNumber = true;
            }
        } while (!isNumber);
        if (min != Double.MAX_VALUE && max != Double.MIN_VALUE) {
            System.out.println("The minimum value was " + min + ", the maximum was " + max);
        } else if (min != Double.MAX_VALUE) {
            System.out.println("The minimum value was " + min + ", the maximum was " + min);
        } else if (max != Double.MIN_VALUE) {
            System.out.println("The minimum value was " + max + ", the maximum was " + max);
        }
    }
}
