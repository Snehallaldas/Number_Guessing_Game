// Number Guessing Game.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        System.out.println("let's play Guessing Game");
        int number;

        do {
            System.out.println("Guess a number between (1-100) : ");
            number = sc.nextInt();

            if (number > a) {
                System.out.println("The number you guessed is larger then number");
            } else if (number < a) {
                System.out.println("The number you guessed is smaller then number");
            } else {
                System.out.println("You Guessed Right Number you Won ");
                break;
            }
        }while(number >=0);
        System.out.println("My number was:");
        System.out.println(number);
    }
}