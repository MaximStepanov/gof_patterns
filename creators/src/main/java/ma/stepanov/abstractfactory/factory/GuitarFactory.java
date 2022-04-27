package ma.stepanov.abstractfactory.factory;

import ma.stepanov.abstractfactory.guitarfamilies.acousticfamily.AcousticGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.bassfamily.BassGuitar;
import ma.stepanov.abstractfactory.guitarfamilies.electricfamily.ElectricGuitar;

public interface GuitarFactory {

    ElectricGuitar createElectricGuitar();
    AcousticGuitar createAcousticGuitar();
    BassGuitar createBassGuitar();
}
