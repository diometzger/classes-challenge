import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int count = 0;

        do {
            try {
                System.out.print("Write an integer number: ");
                sum += Integer.parseInt(scanner.nextLine());
                count++;
            } catch (NumberFormatException BadUserData) {
                break;
            }
        } while (true);
        if (count > 0) {
            avg = Math.round((double) sum / count);
        }
        System.out.print("SUM = " + sum + " AVG = " + avg);

    }
}
