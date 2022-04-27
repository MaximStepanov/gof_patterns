package ma.stepanov.factorymethod.factory;

import ma.stepanov.factorymethod.product.AcousticGuitar;
import ma.stepanov.factorymethod.product.Guitar;

public class AcousticGuitarMusicShop extends MusicShop {

    @Override
    Guitar createGuitar() {
        return new AcousticGuitar();
    }
}
