package ma.stepanov.brigde.instrument;

public class BassGuitar implements InstrumentImplementation {

    public int basePrice = 3000;

    @Override
    public void changePrice(int newPrice) {
        basePrice = newPrice;
    }

    @Override
    public void printName() {
        System.out.println("this is BASS guitar!");
    }

    @Override
    public void printPrice() {
        System.out.println("Bass guitar price's " + basePrice +"$");
    }
}
