import java.util.*;
public class numberguess {
    public static void main(String args[]){
        Random r=new Random();
        int number_to_be_guessed=r.nextInt(100);
        int tries=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!!!!\n");
        System.out.println("Guess a number between 1 to 100." +"\n"+
                "You have 10 attempts to do so." +"\n"+
                "Best of luck!");
        int n,i=0;
        do{
            System.out.println("Enter the guess: ");
            n=sc.nextInt();
            tries++;
            if(n==number_to_be_guessed){
                System.out.println("Congratulations! You have correctly guessed the number.");
                System.out.println("You used "+tries+" turns to guess the right number");
                System.out.println("Your score is "+((10-tries)*10)+" out of 100");
                break;
            }
            else if(n>number_to_be_guessed){
                System.out.println("Your guess is higher than the number.");
                i++;
            }
            else if(n<number_to_be_guessed){
                System.out.println("Your guess is lower than the number.");
                i++;
            }
            else if(i>8) {
                System.out.println("You loose! the right answer was: " + number_to_be_guessed);
                return;
            }
        }
        while(n!=number_to_be_guessed);

    }
}
