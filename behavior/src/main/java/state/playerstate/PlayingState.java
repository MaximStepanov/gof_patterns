package state.playerstate;

import state.playercontext.Player;

public class PlayingState implements State {

    private static final String NAME = "Playing State";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void onPlay(Player player) {
        System.out.println("Nothing happens.");
    }

    @Override
    public void onPause(Player player) {
        player.setState(new PausedState());
    }

    @Override
    public void onNext(Player player) {
        System.out.println("Playing next song.");
    }
}
