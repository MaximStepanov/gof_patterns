package ma.stepanov.brigde.shop;

import ma.stepanov.brigde.instrument.AcousticGuitar;
import ma.stepanov.brigde.instrument.InstrumentImplementation;

public class FenderShop implements ShopAbstraction {

    private final InstrumentImplementation instrument;

    public FenderShop(InstrumentImplementation instrument) {
        this.instrument = instrument;
    }

    @Override
    public void rePrice() {
        if (instrument instanceof AcousticGuitar) {
            instrument.changePrice(500);
        } else {
            instrument.changePrice(5000);
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
        System.out.println("------------------ * FENDER * --------------------");
        pack();
        System.out.println("Your order sent to your delivery destination...");
        System.out.println("See you in FenderShop again!");
        System.out.println("-------------------------------------------------");
    }
}
