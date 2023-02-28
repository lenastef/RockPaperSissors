package org.example;

public class StonePaperScissors {
    // create array with rock paper scissors
    public static String[] rockPaperScissors = {"rock", "paper", "scissors"};

    //rock paper scissors gameplay
    public static String play(String playerChoice) {
        // get random number
        int randomNumber = (int) (Math.random() * rockPaperScissors.length);

        // get computer choice
        String computerChoice = rockPaperScissors[randomNumber];

        // compare player choice and computer choice
        if (playerChoice.equals(computerChoice)) {
            return "Tie!";
        } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")) {
            return "Player wins!";
        } else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
            return "Player wins!";
        } else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {

            return "Player wins!";
        } else {
            return "Computer wins!";
        }
    }


    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("DM_DEFAULT_ENCODING")
    public static void main(String[] args) {
        // get player choice
        System.out.println("Enter rock, paper or scissors: ");
        String playerChoice = new java.util.Scanner(System.in).nextLine();
        System.out.println(StonePaperScissors.play(playerChoice));

    }
}
