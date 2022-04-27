package ma.stepanov.factorymethod;

import ma.stepanov.factorymethod.factory.ElectricGuitarMusicShop;
import ma.stepanov.factorymethod.product.Guitar;

public class Demo {

    public static void main(String[] args) {
        ElectricGuitarMusicShop shop = new ElectricGuitarMusicShop();
        Guitar guitar = shop.orderGuitar();
        System.out.println("Oh yes! Now I can play DAMN GOOD ROCK!");
        guitar.TPYHbTPYHb();
    }
}
