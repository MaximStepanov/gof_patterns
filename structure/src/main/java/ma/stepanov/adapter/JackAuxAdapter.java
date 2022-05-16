package ma.stepanov.adapter;

import ma.stepanov.adapter.jack.JackHeadphones;
import ma.stepanov.adapter.minijack.AuxHeadphones;

public class JackAuxAdapter extends AuxHeadphones {

    public JackHeadphones headphones;

    public JackAuxAdapter(JackHeadphones headphones) {
        this.headphones = headphones;
        this.headphones.out = 3.5;
    }
}
