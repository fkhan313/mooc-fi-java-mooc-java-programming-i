
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int input = Integer.valueOf(scanner.nextLine());

        for (number = 0; number <= input; number++) {
            System.out.println(number);
        }
    }
}
