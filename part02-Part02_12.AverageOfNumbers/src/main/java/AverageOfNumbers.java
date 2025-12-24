
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numcount = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else if (input != 0) {
                numcount = numcount + 1;
                sum = sum + input;
            }
        }

        double result = 1.0 * sum / numcount;

        System.out.println("Average of the numbers: " + result);

    }
}
