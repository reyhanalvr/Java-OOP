import childs.Doctor;
import childs.Teacher;
import childs.Programmer;
import parents.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person();

        person1.setName("Agung");
        person1.setAddress("Bandung");

        System.out.println(person1.getName());
        System.out.println(person1.getAddress());
    }
}
