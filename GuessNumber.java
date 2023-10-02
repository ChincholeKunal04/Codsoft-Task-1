import java.util.*;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxValue = 100;
        int minValue = 1;

        Random randomNum = new Random();
        int randomNumber = randomNum.nextInt(maxValue - minValue + 1) + minValue;

        System.out.println("\n\n\t\t\t\t!!! Welcome to the Game of Guessing Number !!!");
        System.out.println();
        System.out.println("\t\t\t The number has been already choosen between 1 to 100");
        System.out.println("\t\t\t Now, It is your turn to guess the right number");
        System.out.println();
        System.out.println("\t\t\t ********************!!! Let's Game is begin !!!*********************");

        int trial = 0;
        boolean GuessingRight = false;

        while(!GuessingRight){

            System.out.print("\t\t\tEnter your Guess: ");
            int yourGuess = sc.nextInt();

            trial++;

            if(yourGuess > randomNumber){
                System.out.println("\n\t\tYour guessed number is greater than target number, Enter some lower number");
                System.out.println();
            }
            
            if(yourGuess < randomNumber){
                System.out.println("\t\tYour guessed number is lower than target number, Enter some greater number");
                System.out.println();
            }

            if(yourGuess == randomNumber){
                System.out.println("\t\t\t CONGRATULATIONS !!! Your Guess is Right");
                System.out.println("\t\t\t You guessed "+randomNumber+" in "+trial+" trials");
                System.out.println("\t\t\t The Game is END now !!!");
                System.out.println("\t\t***********************************************************************************");
                break;
            }
        }
        sc.close();
    }
}
