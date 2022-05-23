package ma.stepanov.decorator.decorator;

import ma.stepanov.decorator.bean.AudioTrack;

public class ReverberationDecorator extends TrackDecorator {

    public ReverberationDecorator(TrackProcessor processor) {
        super(processor);
    }

    @Override
    public void process(AudioTrack track) {
        super.process(reverberate(track));
    }

    private AudioTrack reverberate(AudioTrack track) {
        track.setReverbEnabled(!track.isReverbEnabled());
        return track;
    }
}
