package ma.stepanov.abstractfactory.guitarfamilies.electricfamily;

public class GibsonElectricGuitar implements ElectricGuitar {
    @Override
    public void play() {
        System.out.println("Gibson Electric Guitar plays... amazing BB King part!");
    }
}
