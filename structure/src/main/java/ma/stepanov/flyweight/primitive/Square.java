package ma.stepanov.flyweight.primitive;

import ma.stepanov.flyweight.Context;

public class Square implements Primitive {

    private final int height, width;

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Context context) {
        System.out.println("Square was drawn with height : " + height + " and width : " + width);
    }
}
