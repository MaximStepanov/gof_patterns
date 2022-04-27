package ma.stepanov.abstractfactory.factory;

import ma.stepanov.abstractfactory.guitarfamilies.acousticfamily.AcousticGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.acousticfamily.FenderAcousticGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.bassfamily.BassGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.bassfamily.FenderBassGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.electricfamily.ElectricGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.electricfamily.FenderElectricGuitar;

public class FenderGuitarFactory implements GuitarFactory {

    @Override
    public ElectricGuitar createElectricGuitar() {
        return new FenderElectricGuitar();
    }

    @Override
    public AcousticGuitar createAcousticGuitar() {
        return new FenderAcousticGuitar();
    }

    @Override
    public BassGuitar createBassGuitar() {
        return new FenderBassGuitar();
    }
}
