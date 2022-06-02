package ma.stepanov.flyweight.primitive;

import ma.stepanov.flyweight.Context;

public class Point implements Primitive {

    @Override
    public void draw(Context context) {
        System.out.println("Point was drawn");
    }
}