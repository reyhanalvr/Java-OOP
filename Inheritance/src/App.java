public class App {
    public static void main(String[] args) throws Exception {
        // Person person1 = new Person();
        // person1.name = "Agung";
        // person1.address = "Bandung";

        // Teacher teacher1 = new Teacher();
        // teacher1.name = "Andi";
        // teacher1.address = "Bekasi";
        // teacher1.subject = "Math";

        //Objek doctor menggunakan constructor default
        Doctor doctor1 = new Doctor();
        doctor1.name = "Bana";
        doctor1.address = "Karawang";
        doctor1.specialist = "Beauty";
        
        //Objek doctor dengan constructor berparameter
        Doctor doctor2 = new Doctor("Joni","Ambon", "Dentist");
        // Programmer programmer1 = new Programmer();
        // programmer1.name = "Schu";
        // programmer1.address = "Jakarta";
        // programmer1.technology = "Web developer";

        // person1.greeting();
        // teacher1.greeting();
        // doctor1.greeting();
        // programmer1.greeting();

        doctor1.greeting();
        doctor2.greeting();
    }
}
