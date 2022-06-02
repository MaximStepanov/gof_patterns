package ma.stepanov.flyweight;

import ma.stepanov.flyweight.factory.PrimitiveFactory;
import ma.stepanov.flyweight.primitive.Picture;
import ma.stepanov.flyweight.primitive.Primitive;

import java.awt.*;

public class Demo {

    public static void main(String[] args) {

        Primitive[] primitives = {
                PrimitiveFactory.createPoint(),
                PrimitiveFactory.createCircle(5),
                PrimitiveFactory.createSquare(15, 25),
                PrimitiveFactory.createCircle(10),
                PrimitiveFactory.createCircle(10),
                PrimitiveFactory.createCircle(10),
                PrimitiveFactory.createCircle(10),
                PrimitiveFactory.createPoint(),
                PrimitiveFactory.createSquare(20, 25),
        };

        Picture picture = PrimitiveFactory.createPicture(primitives);
        Context context = new Context(10, 20, Color.BLUE);
        picture.draw(context);
        System.out.println("-----------------");
        System.out.println("Number of circle objects used - " + PrimitiveFactory.getCircles().entrySet().size());
    }
}
