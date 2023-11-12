import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class GuessingGame {
    Scanner input;

    public GuessingGame() {
        input = new Scanner(System.in);
    }

    public void playGame() {
        System.out.println("Hello player, what's your name?");
        System.out.println("(type in your name)");

        String name = input.nextLine();

        Random random = new Random();
        int number = random.nextInt(100);

        System.out.println(name + " I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what the number is?");

        int tries = 0;
        int guess = 0;
        while (true) {
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = input.next();
                System.out.println("That's not an integer, try again");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, try again");
                continue;
            }


            tries = tries + 1;

            if (guess < number) {
                System.out.println("Your guess is too low, try again.");
            } else if (guess > number) {
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Well done " + name);
                System.out.println("You found my number in " + tries + " tries!");
                break;
            }

        }

    }
}
