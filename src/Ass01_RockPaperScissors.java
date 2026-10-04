import java.util.Scanner;



public class Ass01_RockPaperScissors {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String playerA = "";

        String playerB = "";

        String playAgain = "";

        boolean finished = false;



        System.out.println("Welcome to Rock Paper Scissors!");



        // Main game loop (replays the game if users choose Y)

        do {

            // 1. Get valid move for Player A

            boolean validA = false;

            do {

                System.out.print("Player A, enter your move [R, P, S]: ");

                playerA = in.nextLine();



                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {

                    validA = true;

                } else {

                    System.out.println("Invalid move! You must enter R, P, or S.");

                }

            } while (!validA);



            // 2. Get valid move for Player B

            boolean validB = false;

            do {

                System.out.print("Player B, enter your move [R, P, S]: ");

                playerB = in.nextLine();



                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {

                    validB = true;

                } else {

                    System.out.println("Invalid move! You must enter R, P, or S.");

                }

            } while (!validB);



            // 3. Determine the winner and display specific phrases

            System.out.println("\n--- Result ---");

            if (playerA.equalsIgnoreCase(playerB)) {

                // Tie handling

                if (playerA.equalsIgnoreCase("R")) System.out.println("Rock vs Rock it's a Tie!");

                else if (playerA.equalsIgnoreCase("P")) System.out.println("Paper vs Paper it's a Tie!");

                else System.out.println("Scissors vs Scissors it's a Tie!");

            } else if (playerA.equalsIgnoreCase("R")) {

                if (playerB.equalsIgnoreCase("S")) {

                    System.out.println("Rock breaks Scissors! Player A wins.");

                } else { // playerB is "P"

                    System.out.println("Paper covers Rock! Player B wins.");

                }

            } else if (playerA.equalsIgnoreCase("P")) {

                if (playerB.equalsIgnoreCase("R")) {

                    System.out.println("Paper covers Rock! Player A wins.");

                } else { // playerB is "S"

                    System.out.println("Scissors cuts Paper! Player B wins.");

                }

            } else if (playerA.equalsIgnoreCase("S")) {

                if (playerB.equalsIgnoreCase("P")) {

                    System.out.println("Scissors cuts Paper! Player A wins.");

                } else { // playerB is "R"

                    System.out.println("Rock breaks Scissors! Player B wins.");

                }

            }



            // 4. Prompt to play again

            System.out.print("\nDo you want to play again? [Y/N]: ");

            playAgain = in.nextLine();

            if (playAgain.equalsIgnoreCase("N")) {

                finished = true;

            }



        } while (!finished);



        System.out.println("Thanks for playing!");

        in.close();

    }

}