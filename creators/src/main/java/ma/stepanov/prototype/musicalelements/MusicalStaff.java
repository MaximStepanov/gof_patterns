package ma.stepanov.prototype.musicalelements;

public class MusicalStaff implements MusicalScore {

    public int measureCount;
    public String staffGraphics;

    public MusicalStaff() {
    }

    public MusicalStaff(MusicalStaff musicalStaff) {
        this.measureCount = musicalStaff.measureCount;
        this.staffGraphics = musicalStaff.staffGraphics;
    }

    @Override
    public void draw() {
        System.out.println("Drawn a stuff, " + measureCount + " measures. Staff: " + staffGraphics +
                ". Hash " + this.hashCode());
    }

    @Override
    public MusicalStaff clone() {
        return new MusicalStaff(this);
    }

    @Override
    public int hashCode() {
        return measureCount * 3 + staffGraphics.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MusicalStaff)) {
            return false;
        }
        MusicalStaff score = (MusicalStaff) obj;
        return score.measureCount == this.measureCount && score.staffGraphics.equals(this.staffGraphics);
    }
}
