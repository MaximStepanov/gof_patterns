package ma.stepanov.abstractfactory.guitarfamilies.acousticfamily;

public class YamahaAcousticGuitar implements AcousticGuitar {
    @Override
    public void play() {
        System.out.println("Yamaha Acoustic Guitar - the best acoustic sound ever!");
    }
}
