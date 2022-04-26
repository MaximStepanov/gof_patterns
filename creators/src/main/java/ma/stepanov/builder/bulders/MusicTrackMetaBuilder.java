package ma.stepanov.builder.bulders;

import ma.stepanov.builder.beans.MusicTrackMetadata;

public class MusicTrackMetaBuilder extends AbstractMusicTrackBuilder {

    public MusicTrackMetadata build() {
        return new MusicTrackMetadata(genre, bpm, percussion, instruments);
    }
}
