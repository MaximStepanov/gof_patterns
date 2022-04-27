package ma.stepanov.abstractfactory.guitarfamilies.electricfamily;

public class FenderElectricGuitar implements ElectricGuitar {
    @Override
    public void play() {
        System.out.println("Fender Electric Guitar plays... overdrive Jimmy Hendrix riff!");
    }
}
