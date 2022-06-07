package ma.stepanov.proxy.service.impl;

import ma.stepanov.proxy.bean.AudioTrack;
import ma.stepanov.proxy.service.OnlineAudioPlayer;

import java.util.HashMap;
import java.util.Map;

public class OnlineAudioPlayerImpl implements OnlineAudioPlayer {

    private final Map<String, AudioTrack> favourites = new HashMap<>();

    public OnlineAudioPlayerImpl() {
        System.out.println("Eager initialization");
        // загружаем огромную библиотеку тречков
    }

    public OnlineAudioPlayerImpl(String initializer) {
        System.out.println(initializer);
        // загружаем огромную библиотеку тречков
    }

    @Override
    public AudioTrack search(String name) {
        System.out.println("Searching track : " + name + " ...");
        AudioTrack track = new AudioTrack(name);
        System.out.println("Track found!");
        return track;
    }

    @Override
    public void play(AudioTrack track) {
        System.out.println("Playing track : " + track.name + " ...");
    }

    @Override
    public void addToFavourites(AudioTrack track) {
        favourites.put(track.name, track);
        System.out.println(track.name + " added to favourites");
    }

    @Override
    public Map<String, AudioTrack> getFavourites() {
        System.out.print("Getting favourite tracks ... ");
        return this.favourites;
    }
}
