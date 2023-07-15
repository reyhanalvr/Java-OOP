package JavaFundamental.Perulangan;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rollDice, totalPlayer,totalComputer,turnTotal;
        String again="";

        totalPlayer = 0;
        totalComputer = 0;

        do{
            if(totalPlayer<100){
                turnTotal = 0;
                System.out.println("Computer has "+totalComputer + "points");
                do{
                    rollDice = 1 + (int)(Math.random()*6);
                    System.out.println("Computer roll a " + rollDice + ".");
                    if(rollDice==1){
                        System.out.println("That ends the turn");
                        turnTotal = 0;
                    }else{
                        turnTotal += rollDice;
                        System.out.print("Computer has" + turnTotal);
                        System.out.print(" points so far\n");
                        if(turnTotal<10){
                            System.out.println("\tComputer will rollDice again");
                    }
                }
            }while(rollDice !=1 && turnTotal<10);
            
            totalComputer += turnTotal;
            System.out.print("\tComputer ends the round with");
            System.out.print(totalComputer + " points\n");
        }
        turnTotal = 0;
        System.out.println("You have " + totalPlayer +" points");

        do{
            rollDice = 1 + (int)(Math.random()*6);
            System.out.println("Player roll a " + rollDice +".");
            if(rollDice==1){
                System.out.println("\nThats the end of your turn");
                turnTotal = 0;
            }else{
                turnTotal = rollDice;
                System.out.println("\nYou have "+ turnTotal + " points so far this rounds.");
                System.out.println("Would you like to roll again or hold(Y/N)");
                again = input.next();
            }
        }while(rollDice!=1 && again.equalsIgnoreCase("Y"));

            totalPlayer += turnTotal;
            System.out.println("You end the round with" + totalPlayer + " points");
            }while(totalPlayer<50 && totalComputer<50);

            if(totalPlayer>totalComputer){
                System.out.println("Humanity Wins!!");
            }else{
                System.out.println("Computer Wins!!");
            }
        }
    }

