package ma.stepanov.builder.beans.tracks;

public class Instrument {

    private final InstrumentType type;
    private final String name;
    private final String tone;
    private final int volume;
    private final int reverb;

    public Instrument(InstrumentType type, String name, String tone, int volume, int reverb) {
        this.type = type;
        this.name = name;
        this.tone = tone;
        this.volume = volume;
        this.reverb = reverb;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getTone() {
        return tone;
    }

    public int getVolume() {
        return volume;
    }

    public int getReverb() {
        return reverb;
    }
}
