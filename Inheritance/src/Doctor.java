public class Doctor extends Person {
    String specialist;

    public Doctor(){
        super();
    }

    public Doctor(String name, String address, String specialist){
        super(name,address);
        this.specialist = specialist;
    }

    void surgery(){
        System.out.println("I can surgery operation Patients");
    }

    void greeting(){
        super.greeting();//Pemanggilan method greeting dari parent
        System.out.println("My job is a " + specialist + " doctor");
    }
}
