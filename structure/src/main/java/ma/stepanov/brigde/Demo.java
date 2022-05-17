package ma.stepanov.brigde;

import ma.stepanov.brigde.instrument.AcousticGuitar;
import ma.stepanov.brigde.instrument.BassGuitar;
import ma.stepanov.brigde.instrument.InstrumentImplementation;
import ma.stepanov.brigde.shop.FenderShop;
import ma.stepanov.brigde.shop.YamahaShop;

public class Demo {
    public static void main(String[] args) {
        purchase(new AcousticGuitar());
        purchase(new BassGuitar());
    }

    private static void purchase(InstrumentImplementation instrumentImplementation) {
        FenderShop fenderShop = new FenderShop(instrumentImplementation);
        fenderShop.send();

        YamahaShop yamahaShop = new YamahaShop(instrumentImplementation);
        yamahaShop.rePrice();
        yamahaShop.send();
    }
}
