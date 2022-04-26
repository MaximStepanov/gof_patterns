package ma.stepanov.builder.bulders;

import ma.stepanov.builder.beans.tracks.Instrument;
import ma.stepanov.builder.beans.tracks.Percussion;

import java.util.List;

public abstract class AbstractMusicTrackBuilder {

    protected String genre;
    protected double bpm;
    protected Percussion percussion;
    protected List<Instrument> instruments;

    public void setGenre(final String genre) {
        this.genre = genre;
    }

    public void setBpm(final double bpm) {
        this.bpm = bpm;
    }

    public void setPercussion(final Percussion percussion) {
        this.percussion = percussion;
    }

    public void setInstruments(final List<Instrument> instruments) {
        this.instruments = instruments;
    }
}
