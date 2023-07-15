package JavaFundamental.IfElseNested;

import java.util.Scanner;

public class CafeReservation{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String nama, gender, reserveDay;
        int umur, money;
        double attractive;

        System.out.println("Welcome To Cafe Reservation");
        System.out.println("\n");

        System.out.println("Please Insert Your Name: ");
        nama = scan.next();

        System.out.println("How old are you?");
        umur = scan.nextInt();

        System.out.println("What is your gender?(Male/Female)");
        gender = scan.next();

        System.out.println("How Attractive are you?(1-10)");
        attractive = scan.nextDouble();

        System.out.println("How much money do you have?");
        money = scan.nextInt();

        System.out.println("What day do you want to make resevation?");
        reserveDay = scan.next();

        if(reserveDay.equals("Monday")){
            if(umur>=20 && umur<=30 && money>= 500){
                System.out.println("Hi"+ nama + (", thank you for using our Application"));
                System.out.println("Following result for your reservation: ");
                System.out.println("Reservation Succesfully, you can order on Monday, Young Night");
            }else{
                System.out.println("Hi"+ nama + (", thank you for using our Application"));
                System.out.println("Following result for your reservation: ");
                System.out.println("Sorry, you cant order on Monday!!!");
                System.out.println("Because, it is for Young Night!!");
            }
        }else if(reserveDay.equals("Tuesday")){
            if(umur>=31 && umur<=50 && money>= 250){
                System.out.println("Hi"+ nama + (", thank you for using our Application"));
                System.out.println("Following result for your reservation: ");
                System.out.println("Reservation Succesfully, you can order on tuesday, Oldest Night");
            }else{
                System.out.println("Hi"+ nama + (", thank you for using our Application"));
                System.out.println("Following result for your reservation: ");
                System.out.println("Sorry, you cant order on Tuesday!!!");
                System.out.println("Because, it is for Oldest Night!!");
            }
        }else if(reserveDay.equals("Wednesday")){
            if(umur>=20 && umur<=35 && gender.equals("Female") && attractive>8.5 && money>= 300){
                System.out.println("Hi"+ nama + (", thank you for using our Application"));
                System.out.println("Following result for your reservation: ");
                System.out.println("Reservation Succesfully, you can order on Wednesday, Ladies Night");
            }else{
                System.out.println("Hi"+ nama + (", thank you for using our Application"));
                System.out.println("Following result for your reservation: ");
                System.out.println("Sorry, you cant order on Wednesday!!!");
                System.out.println("Because, it is for Ladies Night!!");
            }
        }else if(reserveDay.equals("Thursday")){
            if(umur>=21 && umur<=30 && (gender.equals("Female") && attractive>8.5 && money>= 300) || (gender.equals("Male") && money>1000)){
                System.out.println("Hi"+ nama + (", thank you for using our Application"));
                System.out.println("Following result for your reservation: ");
                System.out.println("Reservation Succesfully, you can order on Thursday, Party Night for Single");
            }else{
                System.out.println("Hi"+ nama + (", thank you for using our Application"));
                System.out.println("Following result for your reservation: ");
                System.out.println("Sorry, you cant order on Thursday!!!");
                System.out.println("Because, it is for Party Night for Single!!");
            }
        }else if(reserveDay.equals("Friday")){
            if((gender.equals("Male") && umur>=21 && umur<=25 && attractive>8.5) || (gender.equals("Female") && umur>= 31 && umur<= 45 && money>=1000)){
                System.out.println("Hi"+ nama + (", thank you for using our Application"));
                System.out.println("Following result for your reservation: ");
                System.out.println("Reservation Succesfully, you can order on Friday, Women Night");
            }else{
                System.out.println("Hi"+ nama + (", thank you for using our Application"));
                System.out.println("Following result for your reservation: ");
                System.out.println("Sorry, you cant order on Friday!!!");
                System.out.println("Because, it is for Women Night!!");
            }
        }else if(reserveDay.equals("Friday")){
            if(umur>=21 && umur<=30 && (gender.equals("Female") && attractive>8.5 && money>= 300) || (gender.equals("Male") && money>1000)){
                System.out.println("Hi"+ nama + (", thank you for using our Application"));
                System.out.println("Following result for your reservation: ");
                System.out.println("Reservation Succesfully, you can order on Friday, Women Night");
            }else{
                System.out.println("Hi"+ nama + (", thank you for using our Application"));
                System.out.println("Following result for your reservation: ");
                System.out.println("Sorry, you cant order on Friday!!!");
                System.out.println("Because, it is for Women Night!!");
            }
        }else if(reserveDay.equals("Satuday")|| reserveDay.equals("Sunday")){
            if(umur>18 && umur<60 && money>100){
                System.out.println("Hi"+ nama + (", thank you for using our Application"));
                System.out.println("Following result for your reservation: ");
                System.out.println("Reservation Succesfully, you can order on Sunday, Weekend Freedom");
            }else{
                System.out.println("Hi"+ nama + (", thank you for using our Application"));
                System.out.println("Following result for your reservation: ");
                System.out.println("Sorry, you cant order on Sunday!!!");
                System.out.println("Because, it is for Weekend Freedom!!");
            }
        }
    }
}