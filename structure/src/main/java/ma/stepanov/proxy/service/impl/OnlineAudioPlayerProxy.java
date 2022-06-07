package ma.stepanov.proxy.service.impl;

import ma.stepanov.proxy.bean.AudioTrack;
import ma.stepanov.proxy.service.OnlineAudioPlayer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OnlineAudioPlayerProxy implements OnlineAudioPlayer {

    private final Map<String, AudioTrack> favouritesCache = new HashMap<>();
    private final Map<String, AudioTrack> allCache = new HashMap<>();

    private OnlineAudioPlayerImpl proxy;

    public OnlineAudioPlayerProxy() {
        this.proxy = null;
    }

    @Override
    public AudioTrack search(String name) {
        if (proxy == null) {
            proxy = new OnlineAudioPlayerImpl("Lazy initialization");
        }
        AudioTrack searchResult = allCache.get(name);
        if (searchResult == null) {
            searchResult = proxy.search(name);
            allCache.put(name, searchResult);
        } else {
            System.out.println("Getting track " + name + " from cache...");
        }
        return searchResult;
    }

    @Override
    public void play(AudioTrack track) {
        if (proxy == null) {
            proxy = new OnlineAudioPlayerImpl("Lazy initialization");
        }
        proxy.play(track);
    }

    @Override
    public void addToFavourites(AudioTrack track) {
        if (proxy == null) {
            proxy = new OnlineAudioPlayerImpl("Lazy initialization");
        }
        proxy.addToFavourites(track);
        favouritesCache.putIfAbsent(track.name, track);
    }

    @Override
    public Map<String, AudioTrack> getFavourites() {
        if (proxy == null) {
            proxy = new OnlineAudioPlayerImpl("Lazy initialization");
        }
        if (favouritesCache.isEmpty()) {
            favouritesCache.putAll(proxy.getFavourites());
        } else {
            System.out.println("Getting favourite tracks from cache...");
        }
        return favouritesCache;
    }

    public void clearCache() {
        allCache.clear();
        favouritesCache.clear();
    }
}
