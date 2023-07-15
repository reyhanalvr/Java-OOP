package JavaFundamental.BooleanExpression;

import java.util.Scanner;

public class PassingGradeSMK79 {
    public static void main(String[] args) {
        int mtk, indo, inggris, ipa;
        int passSMK, passSastra, passTIK;
        double averageUjian, averageBahasa;

        boolean isPassSMK, isPassSastra, isPassTIK;

        try (Scanner scan = new Scanner(System.in)) {
            passSMK = 73;
            passSastra = 75;
            passTIK = 80;

            System.out.println("Masukkan nilai Ujian Matematika: ");
            mtk = scan.nextInt();

            System.out.println("Masukkan nilai Ujian Bahasa Indonesia: ");
            indo = scan.nextInt();
            System.out.println("Masukkan nilai Ujian Bahasa Inggris: ");
            inggris = scan.nextInt();
            System.out.println("Masukkan nilai Ujian IPA: ");
            ipa = scan.nextInt();
        }

        averageUjian = (mtk + indo + inggris + ipa)/4;

        averageBahasa = (indo+inggris)/2;

        //boolean passing grade

        isPassSMK = averageUjian >= passSMK;
        isPassSastra = averageBahasa >= passSastra;
        isPassTIK = mtk > passTIK;

        System.out.println("\n\nHasil Persyaratan Penerimaan Calon Siswa di SMK Padepokan 79");
        System.out.println("=================================================================");
        System.out.println("Apakah anda memenuhi syarat masuk ke SMK: "+ isPassSMK);
        System.out.println("Apakah anda memenuhi syarat masuk ke jurusan sastra: "+ isPassSastra);
        System.out.println("Apakah anda memenuhi syarat masuk ke jurusan TIK: "+ isPassTIK);
    }
}
