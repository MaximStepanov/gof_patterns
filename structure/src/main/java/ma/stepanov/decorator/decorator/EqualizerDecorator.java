package ma.stepanov.decorator.decorator;

import ma.stepanov.decorator.bean.AudioTrack;
import ma.stepanov.decorator.bean.FrequencyEnum;

import java.util.Map;

public class EqualizerDecorator extends TrackDecorator {

    public EqualizerDecorator(TrackProcessor processor) {
        super(processor);
    }

    @Override
    public void process(AudioTrack track) {
        super.process(equalize(track));
    }

    private AudioTrack equalize(AudioTrack track) {
        Map<String, Integer> audioFrequency = track.getAudioFrequency();
        audioFrequency.put(String.valueOf(FrequencyEnum.HZ32), 5);
        audioFrequency.put(String.valueOf(FrequencyEnum.HZ125), 15);
        audioFrequency.put(String.valueOf(FrequencyEnum.HZ500), 2);
        audioFrequency.put(String.valueOf(FrequencyEnum.HZ2K), -13);
        audioFrequency.put(String.valueOf(FrequencyEnum.HZ8K), -2);
        return track;
    }
}
