package ma.stepanov.abstractfactory.guitarfamilies.bassfamily;

public class GibsonBassGuitar implements BassGuitar {
    @Override
    public void play() {
        System.out.println("Gibson Base Guitar - amazing sound, nice trebles yeah?");
    }
}
