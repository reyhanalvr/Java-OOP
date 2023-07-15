import childs.Doctor;
import childs.Programmer;
import childs.Teacher;
import parents.Person;

public class App {
    public static void main(String[] args) throws Exception {
        // Person person1 = new Programmer("Rizal", "Bandung", "Javascript");

        // person1.greeting();

        Person person1 = new Teacher("Yanto", "Bandung", "Fisika");
        Person person2 = new Doctor("Yandi", "Jakarta", "Mata");
        Person person3 = new Programmer("Dika", "Malang", "Javascript");

        helloGuys(person1);
        helloGuys(person2);
        helloGuys(person3);
    }

        static void helloGuys(Person person){
            String message;

            if(person instanceof Programmer){
                Programmer programmer = (Programmer)person;
                message = "My name is " + programmer.name + ". I am " + programmer.technology + " Programmer";
            }else if(person instanceof Doctor){
                Doctor doctor = (Doctor)person;
                message = "My name is "+ doctor.name + ". My occupation is " + doctor.specialist + " doctor";
            }else if(person instanceof Teacher){
                Teacher teacher = (Teacher) person;
                message = "My name is " + teacher.name + ". I teach " + teacher.subject;
            }else{
                message = "My name is " + person.name;
            }

            System.out.println(message);
        }
    }

