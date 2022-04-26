package ma.stepanov.builder.bulders;

import ma.stepanov.builder.beans.MusicTrack;

public class MusicTrackBuilder extends AbstractMusicTrackBuilder {

    public MusicTrack build() {
        return new MusicTrack(genre, bpm, percussion, instruments);
    }
}
