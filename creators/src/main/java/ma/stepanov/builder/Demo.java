package ma.stepanov.builder;

import ma.stepanov.builder.beans.MusicTrack;
import ma.stepanov.builder.beans.MusicTrackMetadata;
import ma.stepanov.builder.bulders.AlternateMusicTrackBuilder;
import ma.stepanov.builder.bulders.MusicTrackBuilder;
import ma.stepanov.builder.bulders.MusicTrackMetaBuilder;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        MusicTrackBuilder builder = new MusicTrackBuilder();
        director.preparePsyTranceTrack(builder);
        MusicTrack track = builder.build();
        System.out.println("Music Track has been created: \n" + track.getGenre() + " track created.");
        System.out.println();

        MusicTrackMetaBuilder metaBuilder = new MusicTrackMetaBuilder();
        director.prepareRockTrack(metaBuilder);
        MusicTrackMetadata musicTrackMetadata = metaBuilder.build();
        System.out.println("Music Track has been created! \n" + musicTrackMetadata.getInfo());
        System.out.println();

        AlternateMusicTrackBuilder alternateMusicTrackBuilder = new AlternateMusicTrackBuilder();
        MusicTrack hipHopTrack =director.buildHipHopTrack(alternateMusicTrackBuilder);
        System.out.println("Music Track has been created: \n" + hipHopTrack.getGenre() + " track created.");
    }
}
