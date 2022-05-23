package ma.stepanov.decorator;

import ma.stepanov.decorator.bean.AudioTrack;
import ma.stepanov.decorator.bean.FrequencyEnum;
import ma.stepanov.decorator.decorator.CompressionTrackProcessor;
import ma.stepanov.decorator.decorator.EqualizerDecorator;
import ma.stepanov.decorator.decorator.ReverberationDecorator;
import ma.stepanov.decorator.decorator.TrackDecorator;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> audioFrequency = new HashMap<>();
        audioFrequency.put(String.valueOf(FrequencyEnum.HZ32), 0);
        audioFrequency.put(String.valueOf(FrequencyEnum.HZ125), 0);
        audioFrequency.put(String.valueOf(FrequencyEnum.HZ500), 0);
        audioFrequency.put(String.valueOf(FrequencyEnum.HZ2K), 0);
        audioFrequency.put(String.valueOf(FrequencyEnum.HZ8K), 0);
        audioFrequency.put(String.valueOf(FrequencyEnum.HZ20K), 0);
        AudioTrack track = new AudioTrack(15, false, audioFrequency);

        TrackDecorator decorator = new ReverberationDecorator(new EqualizerDecorator(new CompressionTrackProcessor()));
        System.out.println("--- Audio Track before processing -------------");
        track.printMetaData();
        decorator.process(track);
        System.out.println("--- Audio Track after processing -------------");
        track.printMetaData();
    }
}
