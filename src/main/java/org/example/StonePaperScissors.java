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


    public static void main(String[] args) {
        // print out the result of the game
        System.out.println(StonePaperScissors.play("rock"));
        System.out.println(StonePaperScissors.play("paper"));
        System.out.println(StonePaperScissors.play("scissors"));
    }
}
