package ma.stepanov.flyweight.primitive;

import ma.stepanov.flyweight.Context;

public class Circle implements Primitive {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(Context context) {
        System.out.println("Circle was drawn with radius : " + radius);
    }
}