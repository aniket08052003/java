import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the choices for Kyle and Charlie
        String k = sc.next();
        String c = sc.next();
        
        int kCnt = 0;
        int cCnt = 0;

        // Loop through the length of the strings
        for (int i = 0; i < k.length(); i++) {
            char kChoice = k.charAt(i);
            char cChoice = c.charAt(i);

            // Determine the winner for each round
            if ((kChoice == 'R' && cChoice == 'S') ||
                (kChoice == 'P' && cChoice == 'R') ||
                (kChoice == 'S' && cChoice == 'P')) {
                kCnt++;
            } else if (kChoice != cChoice) { // Increment Charlie's count if Kyle doesn't win
                cCnt++;
            }
        }

        // Determine the overall winner
        if (kCnt > cCnt) {
            System.out.println("Kyle");
        } else if (cCnt > kCnt) {
            System.out.println("Charlie");
        } else {
            System.out.println("It's a tie!");
        }

        sc.close(); // Close the scanner
    }
}

