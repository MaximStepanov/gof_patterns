package ma.stepanov.prototype;

import ma.stepanov.prototype.musicalelements.MusicalNote;
import ma.stepanov.prototype.musicalelements.MusicalStaff;
import ma.stepanov.prototype.musicalelements.NoteLength;

public class Demo {

    public static void main(String[] args) {
        MusicalStaff staff = new MusicalStaff();
        staff.measureCount = 4;
        staff.staffGraphics = "Such a beautiful lines!";

        MusicalNote noteDm4Beats = createMusicalNoteDm4B();
        MusicalNote noteC1Beat = createMusicalNoteC1B();
        MusicalNote noteAm2Beats = createMusicalNoteAm2B();

        MusicalStaff staffClone = staff.clone();
        if (staff != staffClone) {
            System.out.println("Prototype and clone are not the similar objects, lets draw them: ");
            staff.draw();
            staffClone.draw();
        }

        MusicalNote noteDmClone = noteDm4Beats.clone();
        if (noteDm4Beats.equals(noteDmClone)) {
            System.out.println("Prototype and clone are identical, lets draw them: ");
            noteDm4Beats.draw();
            noteDmClone.draw();
        }

        MusicalNote clone = noteAm2Beats.clone();
        if (clone != clone.clone()) {
            System.out.println("Clone of the clone: are not the similar objects");
        }

        MusicalNote clone2 = noteC1Beat.clone();
        if (clone2.equals(clone2.clone())) {
            System.out.println("Clone of the clone: are identical");
        }
    }

    private static MusicalNote createMusicalNoteAm2B() {
        MusicalNote noteAm2Beats = new MusicalNote();
        noteAm2Beats.length = NoteLength.HALF_NOTE;
        noteAm2Beats.isDeadNote = false;
        noteAm2Beats.noteWithADot = true;
        noteAm2Beats.velocity = 6;
        noteAm2Beats.accented = true;
        noteAm2Beats.noteGraphics = "Am";
        return noteAm2Beats;
    }

    private static MusicalNote createMusicalNoteC1B() {
        MusicalNote noteC1Beat = new MusicalNote();
        noteC1Beat.length = NoteLength.QUARTER_NOTE;
        noteC1Beat.isDeadNote = true;
        noteC1Beat.noteWithADot = false;
        noteC1Beat.velocity = 5;
        noteC1Beat.accented = false;
        noteC1Beat.noteGraphics = "C";
        return noteC1Beat;
    }

    private static MusicalNote createMusicalNoteDm4B() {
        MusicalNote noteDm4Beats = new MusicalNote();
        noteDm4Beats.length = NoteLength.WHOLE_NOTE;
        noteDm4Beats.isDeadNote = false;
        noteDm4Beats.noteWithADot = false;
        noteDm4Beats.velocity = 8;
        noteDm4Beats.accented = false;
        noteDm4Beats.noteGraphics = "Dm";
        return noteDm4Beats;
    }
}
