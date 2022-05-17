package ma.stepanov.brigde.instrument;

public class AcousticGuitar implements InstrumentImplementation {

    public int basePrice = 300;

    @Override
    public void changePrice(int newPrice) {
        basePrice = newPrice;
    }

    @Override
    public void printName() {
        System.out.println("this is Acoustic guitar!");
    }

    @Override
    public void printPrice() {
        System.out.println("Acoustic guitar price's " + basePrice +"$");
    }
}
