package JavaFundamental.BooleanExpression;

import java.util.Scanner;

public class JobVacancy {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String nama,jenisKelamin, lulusan;
            int umur, pengalaman;
            double penampilan;

            boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
            boolean isPassAdmin, isPassKoor;


            System.out.println("Nama: ");
            nama = scan.next();
            
            System.out.println("Umur: ");
            umur = scan.nextInt();

            System.out.println("Jenis Kelamin(Pria/Wanita): ");
            jenisKelamin = scan.next();

            System.out.println("Lulusan: ");
            lulusan = scan.next();

            System.out.println("Pengalaman(Tahun): ");
            pengalaman = scan.nextInt();

            System.out.println("Penampilan(1-10): ");
            penampilan = scan.nextDouble();

            reqKoor1 = jenisKelamin.equals("Pria") && umur>= 21 && umur<=30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
            reqKoor2 = jenisKelamin.equals("Pria") && umur>30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;

            isPassKoor = reqKoor1 || reqKoor2;

            reqAdmin1 = jenisKelamin.equals("Wanita") && umur>=20 && umur<=25 && lulusan.equalsIgnoreCase("D3") && penampilan>= 8.5 || pengalaman>1;
            reqAdmin2 = jenisKelamin.equals("Wanita") && umur>25 && lulusan.equalsIgnoreCase("S1") && (penampilan >= 8.5 && pengalaman>=3);

            isPassAdmin = reqAdmin1 || reqAdmin2;

            System.out.println();
            System.out.println(nama+", Terima kasih sudah mengikuti lowongan kerja di PT.X");
            System.out.println("Berikut Hasil recruitment untuk job admin dan koordinator");
            System.out.println("Hasil kelulusan untuk job koordinator: "+ isPassKoor);
            System.out.println("Hasil kelulusan untuk job admin: "+ isPassAdmin);
        }
    
    }
}
