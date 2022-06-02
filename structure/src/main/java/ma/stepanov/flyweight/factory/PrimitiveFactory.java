package ma.stepanov.flyweight.factory;

import ma.stepanov.flyweight.primitive.Circle;
import ma.stepanov.flyweight.primitive.Picture;
import ma.stepanov.flyweight.primitive.Point;
import ma.stepanov.flyweight.primitive.Primitive;
import ma.stepanov.flyweight.primitive.Square;

import java.util.HashMap;
import java.util.Map;

public class PrimitiveFactory {

    private static Point onePoint;
    private static final Map<Integer, Circle> circles;
    private static final Map<Integer, Square> squares;

    static {
        circles = new HashMap<>();
        squares = new HashMap<>();
    }

    public static Map<Integer, Circle> getCircles() {
        return circles;
    }

    public static synchronized Picture createPicture(Primitive... children) {
        return new Picture(children);
    }

    public static synchronized Circle createCircle(int radius) {
        Circle circle = circles.get(radius);
        if (circle == null) {
            circle = new Circle(radius);
            circles.put(radius, circle);
        }

        return circle;
    }

    public static synchronized Square createSquare(int height, int width) {
        Square square = squares.get(height * 7 + width * 3);
        if (square == null) {
            square = new Square(height, width);
            squares.put(height * 7 + width * 3, square);
        }

        return square;
    }

    public static synchronized Point createPoint() {
        if (onePoint == null) {
            onePoint = new Point();
        }
        return onePoint;
    }
}