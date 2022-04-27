package ma.stepanov.abstractfactory;

import ma.stepanov.abstractfactory.factory.FenderGuitarFactory;
import ma.stepanov.abstractfactory.factory.GibsonGuitarFactory;
import ma.stepanov.abstractfactory.factory.YamahaGuitarFactory;

public class Demo {

    public static void main(String[] args) {
        GuitarShop shop = new GuitarShop(new FenderGuitarFactory());
        shop.play();
        System.out.println();
        shop = new GuitarShop(new YamahaGuitarFactory());
        shop.play();
        System.out.println();
        shop = new GuitarShop(new GibsonGuitarFactory());
        shop.play();
    }
}
