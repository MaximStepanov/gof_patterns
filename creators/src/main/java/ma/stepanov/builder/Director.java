package ma.stepanov.builder;

import ma.stepanov.builder.beans.MusicTrack;
import ma.stepanov.builder.beans.tracks.Instrument;
import ma.stepanov.builder.beans.tracks.InstrumentType;
import ma.stepanov.builder.beans.tracks.Percussion;
import ma.stepanov.builder.bulders.AbstractMusicTrackBuilder;
import ma.stepanov.builder.bulders.AlternateMusicTrackBuilder;

import java.util.ArrayList;
import java.util.List;

public class Director {

    public void preparePsyTranceTrack(AbstractMusicTrackBuilder builder) {
        builder.setGenre("Psy Trance");
        builder.setBpm(148);
        builder.setPercussion(new Percussion("drum", true, 8, 2));
        List<Instrument> instruments = createInstrumentsForPsy();
        builder.setInstruments(instruments);
    }

    public void prepareRockTrack(AbstractMusicTrackBuilder builder) {
        builder.setGenre("Rock");
        builder.setBpm(120);
        builder.setPercussion(new Percussion("acoustic drum", false, 6, 4));
        List<Instrument> instruments = createInstrumentsForRock();
        builder.setInstruments(instruments);
    }

    public MusicTrack buildHipHopTrack(AlternateMusicTrackBuilder builder) {
        builder.withGenre("Hip-Hop")
                .withBpm(136)
                .withPercussion(new Percussion("808 kick", true, 7, 3))
                .withInstrument(new Instrument(InstrumentType.BASS, "lead bass", "D", 7, 3))
                .withInstrument(new Instrument(InstrumentType.BASS, "slide bass", "D", 5, 0))
                .withInstrument(
                        new Instrument(InstrumentType.STRING_ENSEMBLE, "viola", "D", 3, 8))
                .withInstrument(new Instrument(InstrumentType.SYNTH, "main theme", "D", 5, 6))
                .withInstrument(new Instrument(InstrumentType.FX, "borders", "G", 4, 3));
        return builder.build();
    }

    private List<Instrument> createInstrumentsForPsy() {
        List<Instrument> instruments = new ArrayList<>();
        instruments.add(new Instrument(InstrumentType.FX, "intro fx", "C", 5, 1));
        instruments.add(new Instrument(InstrumentType.BASS, "lead bass", "Am", 9, 0));
        instruments.add(new Instrument(InstrumentType.BASS, "treble bass", "Am", 7, 3));
        instruments.add(new Instrument(InstrumentType.SYNTH, "background", "Am", 4, 5));
        return instruments;
    }

    private List<Instrument> createInstrumentsForRock() {
        List<Instrument> instruments = new ArrayList<>();
        instruments.add(new Instrument(InstrumentType.ACOUSTIC_GUITAR, "lead", "Em", 4, 3));
        instruments.add(new Instrument(InstrumentType.BASS, "base", "Em", 6, 2));
        instruments.add(new Instrument(InstrumentType.GUITAR, "solo", "Em", 5, 7));
        instruments.add(new Instrument(InstrumentType.PIANO, "grand Piano", "Em", 3, 2));
        return instruments;
    }
}
