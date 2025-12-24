
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int input = Integer.valueOf(scanner.nextLine());

        while (count <= input) {
            sum = sum + count;
            count++;
        }

        System.out.println(sum);

    }
}