import childs.Circle;
import childs.Item;
import childs.Triangle;
import parents.Product;
import parents.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        Product product1 = new Item();
        product1.setName("Celana");
        product1.printInformation();

        Item celana1 = new Item();
        celana1.setName("Celana");
        celana1.setPrice(30000);
        celana1.printInformation();

        Shape lingkaran = new Circle("Merah", 20);
        Shape segitiga = new Triangle("Biru", 30, 15);

        System.out.println("Luas lingkaran berwarna " + lingkaran.getColor() + " adalah " + lingkaran.getArea());
        System.out.println("Luas segitiga berwarna " + segitiga.getColor() + " adalah " + segitiga.getArea());
    }
}
