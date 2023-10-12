import java.io.CharArrayReader;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(2);
        System.out.println(c.GetAreal());

        Square s=new Square(2);
        System.out.println(s.GetAreal());

        ShapeBuilder SB = new ShapeBuilder();
        SB.addShape(c);
        SB.addShape(s);
        System.out.println(SB.getTotalArea());
    }
}