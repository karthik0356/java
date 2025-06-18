import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"rock", "paper", "scissors"};
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter rock, paper, or scissors: ");
        String userChoice = sc.next().toLowerCase();
        String computerChoice = choices[rand.nextInt(3)];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        sc.close();
    }
}
