import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random r= new Random();
        Scanner sc=new Scanner(System.in);
        int guess = 0;
        int attemps = 0;
        int random=r.nextInt(1,100);
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-100: ");

        do{
            System.out.print("Enter a guess: ");
            guess=sc.nextInt();
            attemps++;

            if(guess<random){
                System.out.println("TOO LOW! TRY AGAIN");
            }
            else if(guess>random){
                System.out.println("TOO HIGH! TRY AGAIN");

            }
            else{
                System.out.println("CORRECT! THE GUESS IS "+random);
                System.out.println("Number of a attemps: "+attemps);
            }
        }while(guess!=random);

        sc.close();
       


    }
    
}