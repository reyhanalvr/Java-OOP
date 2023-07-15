package JavaFundamental.Arrays;

import java.util.Scanner;

public class ArayManipulation1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int findNumber = 0, count = 0;
        int numbers[] = {1,5,3,6,1,3,5,9,2,13,15,17,27};
        boolean isThere = false;

        System.out.println("Mencari Angka di array");
        System.out.print("Masukkan angka yang dicari ");
        findNumber = input.nextInt();

        for(int i=0; i<numbers.length; i++){
            if(findNumber == numbers[i]){
                isThere = true;
                count++;
            }
        }
        if(isThere == true){
            System.out.println("Angka " + findNumber + " yang anda cari ditemukan");
            System.out.println("Ada " + count + " angka" + findNumber + " didalam Array" );
            System.out.println("yaitu pada index ke: ");
            for(int i = 0; i<numbers.length;i++){
                if(findNumber == numbers[i]){
                    System.out.println(i + " ");
                }
            }
        }else{
                System.out.println("Angka " + numbers + " tidak ditemukan pada Array");
            }
    }
}
