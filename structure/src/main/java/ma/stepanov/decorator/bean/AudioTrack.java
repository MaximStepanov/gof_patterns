package ma.stepanov.decorator.bean;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AudioTrack {

    private double volume;
    private boolean reverbEnabled;
    private Map<String, Integer> audioFrequency;

    public AudioTrack(int volume, boolean reverbEnabled, Map<String, Integer> audioFrequency) {
        this.volume = volume;
        this.reverbEnabled = reverbEnabled;
        this.audioFrequency = audioFrequency;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isReverbEnabled() {
        return reverbEnabled;
    }

    public void setReverbEnabled(boolean reverbEnabled) {
        this.reverbEnabled = reverbEnabled;
    }

    public Map<String, Integer> getAudioFrequency() {
        return audioFrequency;
    }

    public void setAudioFrequency(Map<String, Integer> audioFrequency) {
        this.audioFrequency = audioFrequency;
    }

    public void printMetaData() {
        System.out.println("Volume is : " + this.getVolume());
        System.out.println("Reverb OFF/ON : " + (this.isReverbEnabled() ? "ON" : "OFF"));
        System.out.println("Audio frequency : ");
        System.out.println("============================================");
        Map<String, Integer> eq = this.getAudioFrequency();
        List<String> frequencies = new ArrayList<>(eq.keySet());
        List<Integer> gains = new ArrayList<>(eq.values());
        System.out.println(frequencies.toString());
        System.out.println(gains.toString());
        System.out.println("============================================");
    }
}
