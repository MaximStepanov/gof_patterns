package ma.stepanov.abstractfactory.guitarfamilies.acousticfamily;

public class FenderAcousticGuitar implements AcousticGuitar {
    @Override
    public void play() {
        System.out.println("Fender Acoustic Guitar - this is really rare thing!");
    }
}
