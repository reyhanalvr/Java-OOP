package JavaFundamental.IfElseNested;

import java.util.Scanner;

public class JobVacancy2 {
    public static void main(String[] args) {
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin, posisi, hasil;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2, reqAdmin3, reqSpv1, reqSpv2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input Data Anda: ");

        System.out.println("Nama: ");
        nama = scan.next();

        System.out.println("Umur: ");
        umur = scan.nextInt();

        System.out.println("Jenis Kelamin(Pria/Wanita): ");
        jenisKelamin = scan.next();

        System.out.println("Lulusan(SMK/D3/S1): ");
        lulusan = scan.next();

        System.out.println("Pengalaman(Tahun): ");
        pengalaman = scan.nextInt();

        System.out.println("Penampilan(1-10): ");
        penampilan = scan.nextDouble();

        System.out.println("Posisi yang dilamar(Koordinator/Admin/SPV): ");
        posisi = scan.next();

        if(posisi.equalsIgnoreCase("Koordinator")){
            reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >=21 && umur <=30 && (lulusan.equalsIgnoreCase("SMK") || 
            lulusan.equalsIgnoreCase("D3")) && pengalaman >=2; //Requirement 1

            reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur>30 && lulusan.equalsIgnoreCase("S1") && pengalaman >=5; //Requirement 2

            if(reqKoor1||reqKoor2){
                hasil = "Selamat " + nama + ".\nAnda memenuhi syarat sebagai" + posisi + ". Dan akan masuk ke tahap berikutnya";
            }else{
                hasil = "Maaf " + nama + ".\nAnda tidak memenuhi syarat sebagai" + posisi;
            }
        }else if(posisi.equalsIgnoreCase("Admin")){
            reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur>=20 && umur<=25 && lulusan.equalsIgnoreCase("D3") && (penampilan>=8.5 || pengalaman>=1);
            reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur>25 && lulusan.equalsIgnoreCase("S1") && penampilan>=8.5 && pengalaman>=3;
            reqAdmin3 = jenisKelamin.equalsIgnoreCase("Pria") && penampilan>=8.5 && lulusan.equalsIgnoreCase("S1") && pengalaman>=3;

            if(reqAdmin1||reqAdmin2||reqAdmin3){
                hasil = "Selamat " + nama + ".\nAnda memenuhi syarat sebagai" + posisi + ". Dan akan masuk ke tahap berikutnya";
            }else{
                hasil = "Maaf " + nama + ".\nAnda tidak memenuhi syarat sebagai" + posisi;
            }
        }else if(posisi.equalsIgnoreCase("SPV")){
            reqSpv1 = umur >= 23 && umur<=30 && lulusan.equalsIgnoreCase("S1") && pengalaman>1;
            reqSpv2 = umur >= 25 && umur<=35 && lulusan.equalsIgnoreCase("D3") && pengalaman>4;

            if(reqSpv1||reqSpv2){
                hasil = "Selamat " + nama + ".\nAnda memenuhi syarat sebagai" + posisi + ". Dan akan masuk ke tahap berikutnya";
            }else{
                hasil = "Maaf " + nama + ".\nAnda tidak memenuhi syarat sebagai" + posisi;
            }
        }else{
            hasil = "Maaf tidak ada posisi tersebut dalam lowongan kami.";
        }

        System.out.println();
        System.out.println(nama + ", Terima kasih sudah mendaftar pada lowongan kerja kami");
        System.out.println("Berikut hasil dari rekrutmen kami untuk posisi"+posisi+" :");
        System.out.println(hasil);
    }
}
