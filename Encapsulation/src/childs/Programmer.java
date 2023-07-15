package childs;
import parents.Person;

public class Programmer extends Person {
    private String technology;

    public Programmer(){
        super();
    }

    public Programmer(String name, String address, String technology){
        super(name,address);
        this.technology = technology;
    }
    public void hacking(){
        System.out.println("I can hack your website");
    }

    public void coding(){
        System.out.println("I can coding anything you want");
    }

    public void greeting(){
        super.greeting();//Pemanggilan method greeting dari parent
        System.out.println("My job is a " + technology + " programmer");        
    }

    //Getter dan Setter field technology

    public String getTechnology(){
        return this.technology;
    }

    public void setTechnology(String technology){
        this.technology = technology;
    }
}
