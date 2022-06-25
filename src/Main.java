import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y"))
        {
            int randomNumber = (int)Math.floor(Math.random()*(10-1+1)+1);
            int guess;

            System.out.println("What is your guess?");
            if (in.hasNextInt())
            {
                guess = in.nextInt();
                System.out.println("The random number was " + randomNumber);
                if (guess == randomNumber)
                {
                    System.out.println("You guessed correctly");
                } else if (guess > randomNumber)
                {
                    System.out.println("You guessed too high");
                }
                else
                {
                    System.out.println("You guessed too low");
                }
            }
            else
            {
                System.out.println("invalid entry");
            }
            in.nextLine();

            playAgain = "";
            while (!(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")))
            {
                System.out.println("Would you like to play again? (Y/N)");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N"))
                {
                    break;
                }
                else
                {
                    System.out.println("Please enter a valid response");
                }
            }
        }
    }
}