package JavaFundamental.Perulangan;
import java.util.Scanner;

public class TebakAngka{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret, guess;
        boolean pass = false;

        secret = 1+(int)(Math.random()*10);
        System.out.println("I have secret number.");
        System.out.println("Try to guess it in 3 times");
        System.out.println("Enter guess number:");

        for(int i=0;i<3;i++){
        guess = input.nextInt();
            if(guess == secret){
                System.out.println("RIGHT");
                System.out.println("You Have Won The Game");
                pass = true;
                break;
            }else if(Math.abs(guess-secret)==1){
                System.out.println("HOT");
            }else if(Math.abs(guess-secret)==2){
                System.out.println("WARM");
            }else{
                System.out.println("COLD");
            }
        }
        System.out.println("You failed to guess the number");
        System.out.println("The secret number was" + secret);
        System.out.println("You have lost the game");    
    }
}