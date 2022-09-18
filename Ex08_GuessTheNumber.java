package ee.vikk.course;

import java.util.Scanner;

class Ex08_GuessTheNumber {
    // generates random secret number

        static void guessTheNumber(){
            int guesses;
            int guess;
            double num = Math.random();
            int randomNumber = (int)(num*24+1);
            // asks user to guess the number
            System.out.println("Random number is: " + randomNumber);
            System.out.println("Guess the secret number between 1-25: ");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();
            guesses = 1;
            while (guess != randomNumber) {

               //count guesses
               // check if user number is correct
                if(guess > randomNumber){
                   // check if user guess is higher than random-number
                   System.out.println("Your guess is higher than secret number");
                    System.out.println("Guess the secret number between 1-25: ");
                    guess = sc.nextInt();
                    guesses++; //count guesses

               }else if(guess < randomNumber){
                   // checks if user guess is lower than random number
                   System.out.println("Your guess is lower than secret number");
                   System.out.println("Guess the secret number between 1-25: ");
                   guess = sc.nextInt();
                   guesses++; //count guesses
               }

            }
            if(guesses >= 1 && guesses <=4) {
                System.out.println("Correct!");
                System.out.println("It took you: " + guesses + " attempts: Very Good");
            }else if(guesses > 4 && guesses <= 6){
                System.out.println("Correct!");
                System.out.println("It took you: " + guesses + " attempts: Descent");
            }else{
                System.out.println("Correct!");
                System.out.println("It took: " + guesses + " attempts: Okay");
            }
        }

    public static void main(String[] args) {

        guessTheNumber();

    }

    // Bonus: Modify the program so that we can provide the upper boundary (25) as argument to the program
}
