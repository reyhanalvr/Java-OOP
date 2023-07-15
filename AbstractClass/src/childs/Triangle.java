package childs;
import parents.Shape;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
    }

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        double area = 0.5 * getBase() * getHeight();
        return area;
    }
}
