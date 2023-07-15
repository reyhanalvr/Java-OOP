import interfaces.Phone;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Phone redmiNote8 = new Xiaomi();

        PhoneUser agung = new PhoneUser(redmiNote8);

        Scanner input = new Scanner(System.in);
        String aksi;
        boolean isLooping = true;

        do{
            System.out.println("Aplikasi Handphone");
            System.out.println("1. Nyalakan Handphone");
            System.out.println("2. Matikan Handphone");
            System.out.println("3. Naikan Volume Handphone");
            System.out.println("4. Turunkan Volume Handphone");
            System.out.println("0. Exit Handphone");

            System.out.println("Pilih menu: ");
            aksi = input.next();

            if(aksi.equalsIgnoreCase("1")){
                agung.turnOnThePhone();
            }else if(aksi.equalsIgnoreCase("2")){
                agung.turnOffThePhone();
            }else if(aksi.equalsIgnoreCase("3")){
                agung.makePhoneLouder();
            }else if(aksi.equalsIgnoreCase("4")){
                agung.makePhoneSilent();
            }else if(aksi.equalsIgnoreCase("0")){
                isLooping = false;
            }else{
                System.out.println("Tidak ada menu tersebut!!");
                System.out.println("Silahkan pilih menu kembali");
            }
        }while(isLooping);
    }
}
