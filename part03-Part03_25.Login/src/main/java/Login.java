
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user1 = "alex";
        String user2 = "emma";

        String password1 = "sunshine";
        String password2 = "haskell";

        System.out.println("Enter username:");
        String enteredUsername = scanner.nextLine();

        System.out.println("Enter password:");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(user1) && enteredPassword.equals(password1)
                || enteredUsername.equals(user2) && enteredPassword.equals(password2)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
