package ma.stepanov.prototype.musicalelements;

public class MusicalNote implements MusicalScore {

    public NoteLength length;
    public boolean isDeadNote;
    public boolean noteWithADot;
    public int velocity;
    public boolean accented;
    public String noteGraphics;

    public MusicalNote() {

    }

    public MusicalNote(MusicalNote note) {
        this.length = note.length;
        this.isDeadNote = note.isDeadNote;
        this.noteWithADot = note.noteWithADot;
        this.velocity = note.velocity;
        this.accented = note.accented;
        this.noteGraphics = note.noteGraphics;
    }


    @Override
    public void draw() {
        System.out.println("Drawn a note, " + length + " length. Note: " + noteGraphics);
    }

    @Override
    public MusicalNote clone() {
        return new MusicalNote(this);
    }

    @Override
    public int hashCode() {
        int length = this.length.toString().length();
        return (isDeadNote ? 1 : velocity) + (noteWithADot ? length + length / 2 : length)
                + (accented ? velocity * 2 : velocity) + noteGraphics.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MusicalNote)) {
            return false;
        }
        MusicalNote note = (MusicalNote) obj;
        return note.length.equals(this.length)
                && note.isDeadNote == this.isDeadNote
                && note.noteWithADot == this.noteWithADot
                && note.accented == this.accented
                && note.velocity == this.velocity
                && note.noteGraphics.equals(this.noteGraphics);
    }
}
