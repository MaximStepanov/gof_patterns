package ma.stepanov.builder.bulders;

import ma.stepanov.builder.beans.tracks.Instrument;
import ma.stepanov.builder.beans.MusicTrack;
import ma.stepanov.builder.beans.tracks.Percussion;

public class AlternateMusicTrackBuilder {

    private final MusicTrack musicTrack = new MusicTrack();

    public AlternateMusicTrackBuilder withGenre(String genre) {
        musicTrack.setGenre(genre);
        return this;
    }

    public AlternateMusicTrackBuilder withBpm(double bpm) {
        musicTrack.setBpm(bpm);
        return this;
    }

    public AlternateMusicTrackBuilder withPercussion(Percussion percussion) {
        musicTrack.setPercussion(percussion);
        return this;
    }

    public AlternateMusicTrackBuilder withInstrument(Instrument instrument) {
        musicTrack.getInstruments().add(instrument);
        return this;
    }

    public MusicTrack build() {
        return musicTrack;
    }
}
