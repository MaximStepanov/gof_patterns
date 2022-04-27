package ma.stepanov.abstractfactory.guitarfamilies.bassfamily;

public class YamahaBassGuitar implements BassGuitar {
    @Override
    public void play() {
        System.out.println("Yamaha Base Guitar - what do you know about Yamaha Bass Guitars?");
    }
}
