package JavaFundamental.MenerimaInputUser;
import java.util.Scanner;

public class CalculateMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int total, moneySpent;
        int totalDay = 7;
        double average;

        System.out.println("Masukkan nama anda: ");
        name = input.next();

        System.out.println("Berapakah uang yang anda habiskan pada hari Senin?");
        moneySpent = input.nextInt();
        total = moneySpent;

        System.out.println("Berapakah uang yang anda habiskan pada hari Selasa?");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.println("Berapakah uang yang anda habiskan pada hari Rabu?");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.println("Berapakah uang yang anda habiskan pada hari Kamis?");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.println("Berapakah uang yang anda habiskan pada hari Jumat?");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.println("Berapakah uang yang anda habiskan pada hari Sabtu?");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        
        System.out.println("Berapakah uang yang anda habiskan pada hari Minggu?");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        average = (double) total/totalDay;

        System.out.println("Total kalkulasi pengeluaran: ");
        System.out.println("Hi, " + name);
        System.out.println("Total pengeluaran minggu ini adalah " + total);
        System.out.println("Rata-rata pengeluaran tiap harinya adalah " + average);
    }
}
