package ma.stepanov.brigde.shop;

import ma.stepanov.brigde.instrument.AcousticGuitar;
import ma.stepanov.brigde.instrument.InstrumentImplementation;

public class YamahaShop implements ShopAbstraction {

    private final InstrumentImplementation instrument;

    public YamahaShop(InstrumentImplementation instrument) {
        this.instrument = instrument;
    }

    @Override
    public void rePrice() {
        if (instrument instanceof AcousticGuitar) {
            instrument.changePrice(400);
        } else {
            instrument.changePrice(4000);
        }
    }

    @Override
    public void pack() {
        System.out.println("Your order is : ");
        instrument.printName();
        instrument.printPrice();
    }

    @Override
    public void send() {
        System.out.println("------------------- * YAMAHA * -------------------");
        pack();
        System.out.println("Your order sent to your delivery destination...");
        System.out.println("See you in YamahaShop again!");
        System.out.println("-------------------------------------------------");
    }
}
