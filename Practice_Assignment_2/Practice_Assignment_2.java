import java.util.Scanner;
public class Practice_Assignment_2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("RPS 1.0");
        System.out.println("*********************************************************");
        System.out.println("Good luck, human ...");
        String yOrN, pString, compString;
        int pInt, compInt;
        int numWins = 0;
        int numTies = 0;
        int numLosses = 0;
        do {
            System.out.print("\nWhat do you throw? [1] Rock, [2] Paper, [3] Scissors? ");
            pInt = Integer.parseInt(sc.nextLine());
            pString = intToRPS(pInt);
            compInt = (int) (Math.random() * 3 + 1);
            compString = intToRPS(compInt);
            System.out.println("You threw " + pString + "! I threw " + compString + "!");
            if (pInt - compInt == 1 || compInt - pInt == 2) {
                numWins ++;
                System.out.println("Whaaa?? ... You beat me? RAGE!\n");
            } else if (pInt == compInt) {
                numTies ++;
                System.out.println("A draw ... pretty good, human! I demand a rematch ...\n");
            } else {
                numLosses ++;
                System.out.println("I win! You are not a challenge for me ...\n");
            }
            System.out.print("Play again? [Y,N] ");
            yOrN = sc.nextLine();
        } while (yOrN.equals("Y"));
        System.out.println("\nGood Game! Thanks for playing.");
        System.out.println("**********************************************************");
        System.out.println("Wins: " + numWins);
        System.out.println("Losses: " + numLosses);
        System.out.println("Ties: " + numTies);
    }
    public static String intToRPS (int input) {
        if (input == 1) {
            return "rock";
        } else if (input == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }
}