
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String input = sc.nextLine();

        try {
            Scanner scanner = new Scanner(Paths.get(input));
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);

            }
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

    }
}
