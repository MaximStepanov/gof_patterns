package ma.stepanov.state;

import ma.stepanov.state.playercontext.Player;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        player.pause();
        player.play();
        player.play();
        player.pause();
        player.nextSong();
        player.play();
        player.nextSong();
        player.pause();
    }
}
