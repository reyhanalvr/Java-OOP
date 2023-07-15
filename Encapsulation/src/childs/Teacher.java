package childs;
import parents.Person;

public class Teacher extends Person{
    private String subject;

    //Constructor
    public Teacher(){

    }

    public Teacher(String name, String address, String subject){
        super(name, address);
        this.subject = subject;
    }

    public void teaching(){
        System.out.println("I can teach " + subject + 
        (". So if you want to learn just talk to me"));
    }

    @Override
    public void greeting(){
        super.greeting();//Pemanggilan method greeting dari parent
        System.out.println("My job is a " + subject + " teacher");
    }

    //Metode getter dan setter
    public String getSubject(){
        return this.subject;
    }
    
    public void setSubject(String subject){
        this.subject = subject;
    }
}
