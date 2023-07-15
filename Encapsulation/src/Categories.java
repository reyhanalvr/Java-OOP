public class Categories {

    //boolean isXxx
    //primitf getXxx
    //object getXxx

    //Access modifier private semua field
    private int id;
    private String name;
    private boolean expensive;

    public Categories(){
        super();
    }

    public Categories(int id, String name, boolean expensive) {
        super();
        this.id = id;
        this.name = name;
        this.expensive = expensive;
    }
    //Getter dan Setter tipe data boolean

    //Getter
    public boolean isExpensive(){
        return this.expensive;
    }

    public void setExpensive(boolean expensive){
        this.expensive = expensive;
    }

    //Getter dan Setter tipe data object
    //Getter

    public String getName(){
        return this.name;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    //Tipe data primitif(integer)

    //Getter
    public int setId(){
        return this.id;
    }

    //Setter
    public void setId(int id){
        this.id = id;
    }
    
}
