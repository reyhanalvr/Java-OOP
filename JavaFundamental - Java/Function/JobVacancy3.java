package JavaFundamental.Function;

import java.util.Scanner;

public class JobVacancy3 {
    public static void main(String[] args) {
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin, posisi, hasil;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2, reqAdmin3, reqSpv1, reqSpv2;
        boolean isPassing;

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
            isPassing = validateKoordinator(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        }else if(posisi.equalsIgnoreCase("Admin")){
            isPassing = validateAdmin(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        }else if(posisi.equalsIgnoreCase("SPV")){
            isPassing = validateSPV(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        }else{
            isPassing = false;
        }

        if(isPassing){
            hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke tahap selanjutnya";
        }else{
            hasil = "Maaf, " + nama + ".\nAnda belum memenuhi syarat sebagai " + posisi + ". Dan tidak akan masuk ke tahap selanjutnya";
        }

        printResult(nama, hasil, posisi);

    }


    //Function
    //Method Return value berupa boolean
    public static boolean validateKoordinator(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan){
        boolean reqKoor1,reqKoor2,result;

        reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >=21 && umur <=30 && (lulusan.equalsIgnoreCase("SMK") || 
        lulusan.equalsIgnoreCase("D3")) && pengalaman >=2; //Requirement 1
        reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur>30 && lulusan.equalsIgnoreCase("S1") && pengalaman >=5; //Requirement 2

        if (reqKoor1 || reqKoor2){
            result = true;
        }else{
            result = false;
        }

        return result;
    }

    public static boolean validateAdmin(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan){
        boolean reqAdmin1, reqAdmin2, reqAdmin3, result;

        reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur>=20 && umur<=25 && lulusan.equalsIgnoreCase("D3") && (penampilan>=8.5 || pengalaman>=1); //Requirement 1
        reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur>25 && lulusan.equalsIgnoreCase("S1") && penampilan>=8.5 && pengalaman>=3; //Requirement 2
        reqAdmin3 = jenisKelamin.equalsIgnoreCase("Pria") && penampilan>=8.5 && lulusan.equalsIgnoreCase("S1") && pengalaman>=3; //Requirement 3

        if(reqAdmin1||reqAdmin2||reqAdmin3){
            result = true;
        }else{
            result = false;
        }

        return result;
    }

    public static boolean validateSPV (int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan){
        boolean reqSpv1, reqSpv2, result;

        reqSpv1 = umur >= 23 && umur<=30 && lulusan.equalsIgnoreCase("S1") && pengalaman>1;
        reqSpv2 = umur >= 25 && umur<=35 && lulusan.equalsIgnoreCase("D3") && pengalaman>4;

        if(reqSpv1||reqSpv2){
            result = true;
        }else{
            result = false;
        }
        
        return result;
    }

    //Function return output result
    public static void printResult(String nama, String hasil, String posisi){
        System.out.println();
        System.out.println(nama + ", Terima kasih sudah mendaftar pada lowongan kerja kami");
        System.out.println("Berikut hasil dari rekrutmen kami untuk posisi "+posisi+" :");
        System.out.println(hasil);
    }
}
