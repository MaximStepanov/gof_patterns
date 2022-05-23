package ma.stepanov.decorator.decorator;

import ma.stepanov.decorator.bean.AudioTrack;

public abstract class TrackDecorator implements TrackProcessor {

    private TrackProcessor wrappee;

    TrackDecorator(TrackProcessor processor) {
        this.wrappee = processor;
    }

    @Override
    public void process(AudioTrack track) {
        wrappee.process(track);
    }
}
