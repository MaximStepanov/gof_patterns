package ma.stepanov.builder.beans;

import ma.stepanov.builder.beans.tracks.Instrument;
import ma.stepanov.builder.beans.tracks.Percussion;

import java.util.List;

public class MusicTrackMetadata {

    private final String genre;
    private final double bpm;
    private final int tracks;

    public MusicTrackMetadata(String genre, double bpm, Percussion percussion, List<Instrument> instruments) {
        this.genre = genre;
        this.bpm = bpm;
        this.tracks = instruments.size() + (percussion != null ? 1 : 0);
    }

    public String getInfo() {
        return "Track meta: \n" +
                "Genre is : " + genre + "\n" +
                "Temp is : " + bpm + "\n" +
                "Amount of tracks : " + tracks;
    }
}
