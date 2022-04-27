package ma.stepanov.abstractfactory;

import ma.stepanov.abstractfactory.factory.GuitarFactory;
import ma.stepanov.abstractfactory.guitarfamilies.acousticfamily.AcousticGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.bassfamily.BassGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.electricfamily.ElectricGuitar;

public class GuitarShop {

    private final AcousticGuitar acousticGuitar;
    private final ElectricGuitar electricGuitar;
    private final BassGuitar bassGuitar;

    public GuitarShop(GuitarFactory factory) {
        this.acousticGuitar = factory.createAcousticGuitar();
        this.electricGuitar = factory.createElectricGuitar();
        this.bassGuitar = factory.createBassGuitar();
    }

    public void play() {
        this.acousticGuitar.play();
        this.bassGuitar.play();
        this.electricGuitar.play();
    }
}
