
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            int age = Integer.valueOf(pieces[1]);

            ages.add(age);

        }

        int oldest = ages.get(0);

        for (int i = 0; i < ages.size(); i++) {
            int number = ages.get(i);
            if (oldest < number) {
                oldest = number;
            }
        }
        System.out.println("Age of the oldest:  " + oldest);

    }
}
