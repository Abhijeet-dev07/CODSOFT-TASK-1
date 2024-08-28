import java.util.Random;                                                         // importing random package
import java.util.Scanner;

 class NumberGuessingGame
  {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);                               // scanner class
        
        Random random = new Random();                                           // created a random object 

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts =7 ;
        int score = 0;

        boolean playAgain = true;

        while (playAgain)                                                           // 1st while loop
        {
            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;                         // Used to create the Random number which is to be guessed.
            int attempts = 0; 

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess a number between " + minRange + " and " + maxRange);

            while (attempts < maxAttempts)                            // 2nd while loop     // Used to check the user's attempt with the maximum number of attempt
             {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();                                  // Scanner class defined above for this object taking user input to guess number.
                attempts++;

                if (guess == numberToGuess)         
                 {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    break;                                                     // breaking out of the 2nd while loop 
                } else if (guess < numberToGuess) 
                {
                    System.out.println("Too low!");
                }
                 else 
                {
                    System.out.println("Too high!");
                }
            }

            if (attempts == maxAttempts)
            {
                System.out.println("Sorry, you ran out of attempts. The number was: " + numberToGuess);
            }

            System.out.println("Your score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();                                // User input to play Again
            playAgain = playAgainInput.equalsIgnoreCase("yes");                    //ignores the upper case and lower case and compares user input if yes it will go at the top and if no it will come out of the loop 
        }

        System.out.println("Thanks for playing!");
    }
}




/*# CODSOFT
 
In this program, I have imported a Random variable from the util package and also imported a Scanner Class.
After that in the main class, I created a random object to get a Random integer input from the system.
Then I created  Variables to give a default of minimum range, maximum range, max attempts, and a score variable to keep adding up the score.
Used some iterative conditions and printed the outputs.

SUMMARIZING ALTOGETHER:

FEATURES:
Random number generation within the chosen range.
The user receives hints (too high or too low) after each guess.
Tracks the number of attempts used by the user.
Displays win/lose message and the number of attempts taken.
Option to play again.

INPUT:
The user enters a guess number during each attempt.
The user chooses to play again (yes/no) after each game

OUTPUT:
Welcome message with instructions.
Hints (too high or too low) after each guess.
Win/lose message and the number of attempts taken.
Play again prompt.

LICENSE:
This code is provided without an explicit license. You are free to use and modify it for your purposes
*/