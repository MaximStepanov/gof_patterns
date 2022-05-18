package ma.stepanov.brigde.shop;

import ma.stepanov.brigde.instrument.InstrumentImplementation;

public abstract class ShopAbstraction {

    final InstrumentImplementation instrument;

    public ShopAbstraction(InstrumentImplementation instrument)  {
        this.instrument = instrument;
    }

    abstract void rePrice();
    abstract void pack();
    abstract void send();
}
