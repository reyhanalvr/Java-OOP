public class Main {
    public static void main(String[] args) {
        //Object dengan constructor 2 param
        Person person1 = new Person("Andi","Bandung");
        person1.sayHello("Padeopkan 79");
        System.out.println(person1.sayAddress());

        //Object constructor default
        Person person2 = new Person();
        person2.name = "Alvaro";
        person2.address = "Jogja";
        person2.sayHello("Padepokan 79");
        System.out.println(person2.sayAddress());

        //Object dengan constructor 1 param
        Person person3 = new Person("Eko Patrio");
        person3.address = "Bali";
        person3.sayHello("Padeopkan 79");
        System.out.println(person3.sayAddress());

    }
}
