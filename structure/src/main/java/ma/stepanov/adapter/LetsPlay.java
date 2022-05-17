package ma.stepanov.adapter;

import ma.stepanov.adapter.jack.JackHeadphones;
import ma.stepanov.adapter.minijack.AuxHeadphones;
import ma.stepanov.adapter.minijack.AuxPlayer;

public class LetsPlay {
    public static void main(String[] args) {
        AuxPlayer player = new AuxPlayer();
        AuxHeadphones auxHeadphones = new AuxHeadphones();
        if (player.connected(auxHeadphones)) {
            System.out.println("Connected");
        }
        JackHeadphones jackHeadphones = new JackHeadphones();
        /*if (player.connected(jackHeadphones)) {
            // incompatible
        }*/
        JackAuxAdapter auxAdapter = new JackAuxAdapter(jackHeadphones);
        if (player.connected(auxAdapter)) {
            System.out.println("Connected through adapter!");
        }
    }
}
