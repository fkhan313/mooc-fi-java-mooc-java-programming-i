
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.print("First number? ");
        int startingPoint = Integer.valueOf(scanner.nextLine());

        System.out.print("Last number? ");
        int endPoint = Integer.valueOf(scanner.nextLine());

        for (int count = startingPoint; count <= endPoint; count++) {
            sum += count;
        }

        System.out.println(sum);

    }
}
