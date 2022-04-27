package ma.stepanov.factorymethod.factory;

import ma.stepanov.factorymethod.product.BassGuitar;
import ma.stepanov.factorymethod.product.Guitar;

public class BassGuitarMusicShop extends MusicShop {

    @Override
    Guitar createGuitar() {
        return new BassGuitar();
    }
}
