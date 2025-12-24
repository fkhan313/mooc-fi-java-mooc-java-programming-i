
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numcount = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else {
                numcount = numcount + 1;
                sum = sum + input;
            }
        }

        System.out.println("Number of numbers: " + numcount);
        System.out.println("Sum of the numbers: " + sum);

    }
}
