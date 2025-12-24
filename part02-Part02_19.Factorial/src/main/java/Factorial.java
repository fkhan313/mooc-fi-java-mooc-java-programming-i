
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 1;
        int count = 1;
        int input = Integer.valueOf(scanner.nextLine());

        while (count <= input) {
            sum = sum * count;
            count++;
        }

        System.out.println(sum);

    }
}
