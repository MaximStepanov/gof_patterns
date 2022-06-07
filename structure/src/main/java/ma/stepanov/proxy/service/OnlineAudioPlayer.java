package ma.stepanov.proxy.service;

import ma.stepanov.proxy.bean.AudioTrack;

import java.util.Map;
import java.util.Set;

public interface OnlineAudioPlayer {

    AudioTrack search(String name);

    void play(AudioTrack track);

    void addToFavourites(AudioTrack track);

    Map<String, AudioTrack> getFavourites();
}
