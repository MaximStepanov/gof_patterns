package ma.stepanov.abstractfactory.guitarfamilies.electricfamily;

public class YamahaElectricGuitar implements ElectricGuitar {
    @Override
    public void play() {
        System.out.println("Yamaha Electric Guitar plays... holly Steve Vai solos!");
    }
}
