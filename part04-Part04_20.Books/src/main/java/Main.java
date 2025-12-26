import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> bookCollection = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String bTitle = scanner.nextLine();
            if (bTitle.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int bPages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int pYear = Integer.valueOf(scanner.nextLine());

            bookCollection.add(new Books(bTitle, bPages, pYear));
        }

        System.out.println("What information will be printed? ");
        String info = scanner.nextLine();

        if (info.equals("everything")) {
            for (Books book : bookCollection) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getYear());
            }
        } else if (info.equals("name")) {
            for (Books book : bookCollection) {
                System.out.println(book.getTitle());
            }
        }

    }
}
