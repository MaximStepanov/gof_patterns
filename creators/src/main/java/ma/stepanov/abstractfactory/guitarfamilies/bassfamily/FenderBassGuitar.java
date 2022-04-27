package ma.stepanov.abstractfactory.guitarfamilies.bassfamily;

public class FenderBassGuitar implements BassGuitar {
    @Override
    public void play() {
        System.out.println("Fender Base Guitar - You'll never find smthng better than Fender Jazz Bass!");
    }
}
