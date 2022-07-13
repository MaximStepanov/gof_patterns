package ma.stepanov.state.playercontext;

import ma.stepanov.state.playerstate.PausedState;
import ma.stepanov.state.playerstate.State;

public class Player {

    private State state;

    public Player() {
        state = new PausedState();
    }

    public void setState(State state) {
        System.out.println("Changing ma.stepanov.state to " + state.getName() + " !");
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
