
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int longest = -1;
        int birthYear = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int length = parts[0].length();
            if (length > longest) {
                longest = length;
                name = parts[0];

            }
            int year = Integer.valueOf(parts[1]);
            birthYear += year;
            count++;

        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * birthYear / count);

    }

}
