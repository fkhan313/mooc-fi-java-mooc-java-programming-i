
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();

        int playedAtHome = 0;
        int playedAsVisitor = 0;
        // int totalPlayed = playedAtHome + playedAsVisitor;
        int win = 0;
        int loss = 0;

        try {

            Scanner filScanner = new Scanner(Paths.get(file));
            System.out.println("Team: ");
            String input = scan.nextLine();

            while (filScanner.hasNextLine()) {
                String line = filScanner.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);

                if (input.equals(homeTeam)) {
                    playedAtHome++;
                } else if (input.equals(visitingTeam)) {
                    playedAsVisitor++;
                }

                if (input.equals(homeTeam) && homeTeamPoints > visitingTeamPoints ||
                        input.equals(visitingTeam) && homeTeamPoints < visitingTeamPoints) {
                    win++;
                } else if (input.equals(homeTeam) && homeTeamPoints < visitingTeamPoints ||
                        input.equals(visitingTeam) && homeTeamPoints > visitingTeamPoints) {
                    loss++;
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Games: " + (playedAtHome + playedAsVisitor));
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);

    }

}
