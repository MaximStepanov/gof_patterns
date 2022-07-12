package state.playercontext;

import state.playerstate.PausedState;
import state.playerstate.State;

public class Player {

    private State state;

    public Player() {
        state = new PausedState();
    }

    public void setState(State state) {
        System.out.println("Changing state to " + state.getName() + " !");
        this.state = state;
    }


    public State getState() {
        return state;
    }

    public void play() {
        System.out.println("Start playing track...");
        state.onPlay(this);
    }

    public void pause() {
        System.out.println("Pausing track...");
        state.onPause(this);
    }

    public void nextSong() {
        System.out.println("Changing track...");
        state.onNext(this);
    }
}
