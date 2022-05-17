package ma.stepanov.adapter.jack;

import ma.stepanov.adapter.jack.InOut.JackPlug;

public class JackHeadphones {
    public double out;

    public JackHeadphones() {
        this.out = JackPlug.diameter;
    }
}
