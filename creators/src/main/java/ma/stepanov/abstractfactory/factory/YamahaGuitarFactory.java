package ma.stepanov.abstractfactory.factory;

import ma.stepanov.abstractfactory.guitarfamilies.acousticfamily.AcousticGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.acousticfamily.YamahaAcousticGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.bassfamily.BassGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.bassfamily.YamahaBassGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.electricfamily.ElectricGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.electricfamily.YamahaElectricGuitar;

public class YamahaGuitarFactory implements GuitarFactory {
    @Override
    public ElectricGuitar createElectricGuitar() {
        return new YamahaElectricGuitar();
    }

    @Override
    public AcousticGuitar createAcousticGuitar() {
        return new YamahaAcousticGuitar();
    }

    @Override
    public BassGuitar createBassGuitar() {
        return new YamahaBassGuitar();
    }
}
