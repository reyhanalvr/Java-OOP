public class Programmer extends Person {
    String technology;

    public Programmer(){
        super();
    }

    public Programmer(String name, String address, String technology){
        super(name,address);
        this.technology = technology;
    }
    void hacking(){
        System.out.println("I can hack your website");
    }

    void coding(){
        System.out.println("I can coding anything you want");
    }

    void greeting(){
        super.greeting();//Pemanggilan method greeting dari parent
        System.out.println("My job is a " + technology + " programmer");        
    }
}
