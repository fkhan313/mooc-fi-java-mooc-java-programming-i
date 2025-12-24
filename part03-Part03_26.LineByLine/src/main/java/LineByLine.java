
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String enteredWord = scanner.nextLine();
            if (enteredWord.equals("")) {
                break;
            } else {
                String[] pieces = enteredWord.split(" ");

                for (String piece : pieces) {
                    System.out.println(piece);
                }
            }
        }

    }
}
