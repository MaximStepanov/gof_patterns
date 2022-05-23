package ma.stepanov.decorator.decorator;

import ma.stepanov.decorator.bean.AudioTrack;

public class CompressionTrackProcessor implements TrackProcessor {

    @Override
    public void process(AudioTrack track) {
        track.setVolume(track.getVolume() * 0.75);
    }
}
