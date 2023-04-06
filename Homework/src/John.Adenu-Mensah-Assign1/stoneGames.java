/*
 * @author John Adenu-Mensah
 * @version 1.0.3
 */
// Import Scanner class.
import java.util.Scanner;

public class stoneGames {
    // Method for repeating code.
    static void gameUpdate(String playerOne, String playerTwo, int stoneLeft, int playerOneStones, int playerTwoStones){
        System.out.println("\n" + playerOne + " (Player #1) has " + playerOneStones + " stone(s).");
        System.out.println(playerTwo + " (Player #2) has " + playerTwoStones + " stone(s).");
        System.out.println("There are " + stoneLeft + " stone(s) left in the pile.");
    }
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        // Declaring variables for the game.
        int startStones, stoneLeft, playerOneStones, playerTwoStones, pOneTurnCount, pTwoTurnCount;
        String playerOne, playerTwo;

        // Initialising number of stones to 0 for each player
        playerOneStones = 0;
        playerTwoStones = 0;

        // Ask for initial number of stones and keep prompting while input is invalid.
        System.out.println("Enter starting stone number: ");
        startStones = kbd.nextInt();
        while (startStones % 2 == 0 || startStones <= 0) {
        System.out.println("Invalid input. Negative/Even numbers or 0 are invalid.");
        System.out.println("Enter a starting stone number: ");
        startStones = kbd.nextInt();
        }

        // Ask for player names.
        System.out.println("\nEnter Player 1: ");
        playerOne = kbd.next();
        System.out.println("Enter Player 2: ");
        playerTwo = kbd.next();

        // Starting the game with player 1's turn.
        System.out.println("\n" + playerOne + " (Player #1) has " + playerOneStones + " stone(s).");
        System.out.println(playerTwo + " (Player #2) has " + playerTwoStones + " stone(s).");
        System.out.println("There are " + startStones + " stone(s) left in the pile.");
        System.out.println(playerOne + ", choose between 1 and " + startStones/2 + " stones");
        pOneTurnCount = kbd.nextInt();

        // While input is invalid, keep prompting.
        while (pOneTurnCount > startStones/2 || pOneTurnCount <= 0) {
        System.out.println("\nInvalid input. Must be between 1 and " + startStones/2);
        System.out.println(playerOne + ", choose between 1 and " + startStones/2 + " stones");
        pOneTurnCount = kbd.nextInt();
        }

        // Turn count for P1 is accumulated into playerOneStones and stoneLeft is updated.
        playerOneStones += pOneTurnCount;
        stoneLeft = startStones - pOneTurnCount;

        // Game will continue while stoneLeft is greater than 0.
        while (stoneLeft > 0){
        // Game update.
        gameUpdate(playerOne, playerTwo, stoneLeft, playerOneStones, playerTwoStones);
            if (pOneTurnCount*2 > stoneLeft){ // Deciding to use stoneLeft or pOneTurnCount*2 for P2's prompt.
                System.out.println(playerTwo + ", choose between 1 and " + stoneLeft + " stones");
                pTwoTurnCount = kbd.nextInt();
                while (pTwoTurnCount > stoneLeft || pTwoTurnCount <= 0){
                    System.out.println("\nInvalid input. Must be between 1 and " + stoneLeft + " stones");
                    System.out.println(playerTwo + ", choose between 1 and " + stoneLeft + " stones");
                    pTwoTurnCount = kbd.nextInt();
                    }
                // Turn count for P2 is accumulated into playerTwoStones and stoneLeft is updated.
                playerTwoStones += pTwoTurnCount;
                stoneLeft -= pTwoTurnCount;
            }
            else {
                System.out.println(playerTwo + ", choose between 1 and " + pOneTurnCount*2 + " stones");
                pTwoTurnCount = kbd.nextInt();
                while (pTwoTurnCount > pOneTurnCount*2 || pTwoTurnCount <= 0){
                    System.out.println(" ");
                    System.out.println("Invalid input. Must be between 1 and " + pOneTurnCount*2 + " stones");
                    System.out.println(playerTwo + ", choose between 1 and " + pOneTurnCount*2 + " stones");
                    pTwoTurnCount = kbd.nextInt();
                    }
                // Turn count for P2 is accumulated into playerTwoStones and stoneLeft is updated.
                playerTwoStones += pTwoTurnCount;
                stoneLeft -= pTwoTurnCount;
            }
            if (stoneLeft == 0){ // Breaking out if stoneLeft evaluates to 0 during the loop.
                break;
            }
        // Game update.
        gameUpdate(playerOne, playerTwo, stoneLeft, playerOneStones, playerTwoStones);
            // Deciding to use stoneLeft or pTwoTurnCount*2 for P2's prompt.
            if (pTwoTurnCount*2 > stoneLeft){
                System.out.println(playerOne + ", choose between 1 and " + stoneLeft + " stones");
                pOneTurnCount = kbd.nextInt();
                while (pOneTurnCount > stoneLeft || pOneTurnCount <= 0){
                    System.out.println(" ");
                    System.out.println("Invalid input. Must be between 1 and " + stoneLeft + " stones");
                    System.out.println(playerTwo + ", choose between 1 and " + stoneLeft + " stones");
                    pOneTurnCount = kbd.nextInt();
                    }
                // Turn count for P1 is accumulated into playerOneStones and stoneLeft is updated.
                playerOneStones += pOneTurnCount;
                stoneLeft -= pOneTurnCount;
            }
            else {
                System.out.println(playerOne + ", choose between 1 and " + pTwoTurnCount*2 + " stones");
                pOneTurnCount = kbd.nextInt();
                while (pOneTurnCount > pTwoTurnCount*2 || pOneTurnCount <= 0){
                    System.out.println(" ");
                    System.out.println("Invalid input. Must be between 1 and " + pTwoTurnCount*2 + " stones");
                    System.out.println(playerOne + ", choose between 1 and " + pTwoTurnCount*2 + " stones");
                    pOneTurnCount = kbd.nextInt();
                    }
                // Turn count for P1 is accumulated into playerOneStones and stoneLeft is updated.
                playerOneStones += pOneTurnCount;
                stoneLeft -= pOneTurnCount;
            }
            if (stoneLeft == 0){ // Deciding to use stoneLeft or pTwoTurnCount*2 for P2's prompt.
                break;
            }
        } // End of game loop.

        // Final Game Update.
        gameUpdate(playerOne, playerTwo, stoneLeft, playerOneStones, playerTwoStones);
        if (playerOneStones%2 == 1){ // Determing a winner
            System.out.println("Player 1 wins! Congratulations " + playerOne + "!");
        }
        else{
            System.out.println("Player 2 wins! Congratulations " + playerTwo + "!");
        }
    kbd.close();
    }
}