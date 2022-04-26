package ma.stepanov.builder.beans;

import ma.stepanov.builder.beans.tracks.Instrument;
import ma.stepanov.builder.beans.tracks.Percussion;

import java.util.ArrayList;
import java.util.List;

public class MusicTrack {

    private String genre;
    private double bpm;
    private Percussion percussion;
    private final List<Instrument> instruments;

    public MusicTrack() {
        instruments = new ArrayList<>();
    }

    public MusicTrack(String genre, double bpm, Percussion percussion, List<Instrument> instruments) {
        this.genre = genre;
        this.bpm = bpm;
        this.percussion = percussion;
        this.instruments = instruments;
    }

    public double getBpm() {
        return bpm;
    }

    public void setBpm(double bpm) {
        this.bpm = bpm;
    }

    public Percussion getPercussion() {
        return percussion;
    }

    public void setPercussion(Percussion percussion) {
        this.percussion = percussion;
    }

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
