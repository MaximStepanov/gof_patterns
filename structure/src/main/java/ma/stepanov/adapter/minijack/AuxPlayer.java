package ma.stepanov.adapter.minijack;

import ma.stepanov.adapter.minijack.InOut.AuxSocket;

public class AuxPlayer {
    double in;

    public AuxPlayer() {
        this.in = AuxSocket.diameter;
    }

    public boolean connected(AuxHeadphones headphones) {
        return headphones.out == this.in;
    }
}
