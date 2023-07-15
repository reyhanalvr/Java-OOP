package JavaFundamental.Arrays;
import java.util.Scanner;


public class ArrayManipulation2 {
    public static void main(String[] args) {
        int changeNumber, indexToChange = 0;
        int numbers[] = {1,5,3,6,1,3,5,9,2,13,15,17,27};
        Scanner input = new Scanner(System.in);
        System.out.println("Array numbers");
        System.out.println("1,5,3,6,1,3,5,9,2,13,15,17,27");

        System.out.println("Merubah nilai array pada numbers");
        do{
            System.out.print("Masukkan index yang mau diganti(1 - 13): ");
            indexToChange = input.nextInt();
        }while(indexToChange < 1 || indexToChange > 13);

        System.out.println("Masukkan nilai yang akan diinputkan pada arayy");
        changeNumber = input.nextInt();

        for(int i=0; i<numbers.length ; i++){
            if(indexToChange == i){
                numbers[i] = changeNumber;
            }
        }

        System.out.println("Menampilkan array setelah diganti");
        System.out.print("{");

        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.print("}");
    }
}
