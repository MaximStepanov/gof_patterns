package ma.stepanov.abstractfactory.factory;

import ma.stepanov.abstractfactory.guitarfamilies.acousticfamily.AcousticGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.acousticfamily.GibsonAcousticGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.bassfamily.BassGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.bassfamily.GibsonBassGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.electricfamily.ElectricGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.electricfamily.GibsonElectricGuitar;

public class GibsonGuitarFactory implements GuitarFactory {

    @Override
    public ElectricGuitar createElectricGuitar() {
        return new GibsonElectricGuitar();
    }

    @Override
    public AcousticGuitar createAcousticGuitar() {
        return new GibsonAcousticGuitar();
    }

    @Override
    public BassGuitar createBassGuitar() {
        return new GibsonBassGuitar();
    }
}
