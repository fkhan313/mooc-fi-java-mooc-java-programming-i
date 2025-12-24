
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCount = 0;

        while (true) {
            System.out.println("Give a number: ");

            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else {
                numCount = numCount + num;
            }

        }

        System.out.println("Sum of the numbers: " + numCount);

    }
}
