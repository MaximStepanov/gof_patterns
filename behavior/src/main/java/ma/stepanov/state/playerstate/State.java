package ma.stepanov.state.playerstate;

import ma.stepanov.state.playercontext.Player;

public interface State {

    String getName();
    void onPlay(Player player);
    void onPause(Player player);
    void onNext(Player player);
}
