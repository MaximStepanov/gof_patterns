package ma.stepanov.factorymethod.factory;

import ma.stepanov.factorymethod.product.Guitar;

public abstract class MusicShop {

    public Guitar orderGuitar() {
        Guitar guitar = createGuitar();

        guitar.processPayment();
        guitar.deliver();
        return guitar;
    }

    abstract Guitar createGuitar();
}
