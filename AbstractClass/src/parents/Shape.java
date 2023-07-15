package parents;

public abstract class Shape {
    private String color;

    public Shape(){
        super();
    }

    public Shape(String color){
        super();
        this.color = color;
    }

    //Abstract Method
    public abstract double getArea();

    //Getter & Setter
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
