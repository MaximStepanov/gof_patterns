package ma.stepanov.proxy;


import ma.stepanov.proxy.bean.AudioTrack;
import ma.stepanov.proxy.service.OnlineAudioPlayer;
import ma.stepanov.proxy.service.impl.OnlineAudioPlayerImpl;
import ma.stepanov.proxy.service.impl.OnlineAudioPlayerProxy;

import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        OnlineAudioPlayer player = new OnlineAudioPlayerImpl();
        long naive = testPlayer(player);
        OnlineAudioPlayer proxyPlayer = new OnlineAudioPlayerProxy();
        long smart = testPlayer(proxyPlayer);

        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long testPlayer(OnlineAudioPlayer player) {
        long startTime = System.currentTimeMillis();

        System.out.println("------------TEST PLAYER------------");
        AudioTrack track1 = player.search("track1_normal");
        player.play(track1);
        AudioTrack track1_copy = player.search("track1_normal");
        player.addToFavourites(track1_copy);
        Map<String, AudioTrack> favs = player.getFavourites();
        System.out.println("\n-------------------------------");
        System.out.println("Favourite tracks list : ");
        for (AudioTrack audioTrack : favs.values()) {
            System.out.println("Name: " + audioTrack.name);
        }
        System.out.println("-------------------------------");
        AudioTrack track2 = player.search("track2_normal");
        AudioTrack track2_copy = player.search("track2_normal");
        AudioTrack track3 = player.search("track3_normal");
        player.addToFavourites(track2);
        player.addToFavourites(track2_copy);
        player.addToFavourites(track3);
        favs = player.getFavourites();
        System.out.println("\n-------------------------------");
        System.out.println("Favourite tracks list : ");
        for (AudioTrack audioTrack : favs.values()) {
            System.out.println("Name: " + audioTrack.name);
        }
        System.out.println("-------------------------------");
        System.out.println("\n------------TEST PLAYER END------------");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
