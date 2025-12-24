
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            int age = Integer.valueOf(pieces[1]);
            String name = pieces[0];

            ages.add(age);
            names.add(name);

        }

        int oldest = ages.get(0);

        for (int i = 0; i < ages.size(); i++) {
            int number = ages.get(i);
            if (oldest < number) {
                oldest = number;
            }
        }

        int index = 0;
        for (int i = 0; i < ages.size(); i++) {
            if (ages.get(i) == oldest) {
                index = i;
            }
        }

        System.out.println("Name of the Oldest: " + names.get(index));

    }
}
