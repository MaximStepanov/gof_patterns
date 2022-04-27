package ma.stepanov.abstractfactory.guitarfamilies.acousticfamily;

public class GibsonAcousticGuitar implements AcousticGuitar {
    @Override
    public void play() {
        System.out.println("Gibson Acoustic Guitar - have enough cash? that's your choice!");
    }
}
