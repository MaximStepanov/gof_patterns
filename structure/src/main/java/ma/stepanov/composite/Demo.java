package ma.stepanov.composite;

import ma.stepanov.composite.editor.ImageEditor;
import ma.stepanov.composite.shape.Circle;
import ma.stepanov.composite.shape.CompoundShape;
import ma.stepanov.composite.shape.Dot;
import ma.stepanov.composite.shape.Rectangle;

import java.awt.*;

public class Demo {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        Circle circle = new Circle(10, 10, 10, Color.BLUE);
        CompoundShape compoundShape = new CompoundShape(
                new Circle(110, 110, 50, Color.RED),
                new Dot(160, 160, Color.RED)
        );
        CompoundShape compoundShape1 = new CompoundShape(
                new Rectangle(250, 250, 100, 100, Color.GREEN),
                new Dot(240, 240, Color.GREEN),
                new Dot(240, 360, Color.GREEN),
                new Dot(360, 360, Color.GREEN),
                new Dot(360, 240, Color.GREEN)
        );
        editor.loadShapes(
                circle,
                compoundShape,
                compoundShape1
        );
    }
}
