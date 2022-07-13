package ma.stepanov.state.playerstate;

import ma.stepanov.state.playercontext.Player;

public class PausedState implements State {

    private static final String NAME = "Paused State";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void onPlay(Player player) {
        player.setState(new PlayingState());
    }

    @Override
    public void onPause(Player player) {
        System.out.println("Nothing happens.");
    }

    @Override
    public void onNext(Player player) {
        System.out.println("Nothing happens.");
    }
}
