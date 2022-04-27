package ma.stepanov.factorymethod.factory;

import ma.stepanov.factorymethod.product.ElectricGuitar;
import ma.stepanov.factorymethod.product.Guitar;

public class ElectricGuitarMusicShop extends MusicShop {

    @Override
    Guitar createGuitar() {
        return new ElectricGuitar();
    }
}
