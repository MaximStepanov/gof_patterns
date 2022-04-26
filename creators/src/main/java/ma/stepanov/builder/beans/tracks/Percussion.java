package ma.stepanov.builder.beans.tracks;

public class Percussion {

    private final String name;
    private final boolean electronic;
    private final int volume;
    private final int reverb;


    public Percussion(String name, boolean electronic, int volume, int reverb) {
        this.name = name;
        this.electronic = electronic;
        this.volume = volume;
        this.reverb = reverb;
    }

    public String getName() {
        return name;
    }

    public boolean isElectronic() {
        return electronic;
    }

    public int getVolume() {
        return volume;
    }

    public int getReverb() {
        return reverb;
    }
}
