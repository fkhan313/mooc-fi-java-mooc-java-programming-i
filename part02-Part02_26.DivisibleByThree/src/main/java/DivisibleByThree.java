
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Beginning number: ");
        int beginning = scanner.nextInt();
        System.out.println("Ending number:");
        int ending = scanner.nextInt();

        divisibleByThreeInRange(beginning, ending);
        scanner.close();

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
