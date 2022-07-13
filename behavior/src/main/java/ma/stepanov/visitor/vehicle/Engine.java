package ma.stepanov.visitor.vehicle;

import ma.stepanov.visitor.exportvisitor.Visitor;

public class Engine extends Vehicle {

    @Override
    public void paint(String color) {
        this.color = color;
    }

    @Override
    public void tune(String tuningMark) {
        this.tuningMark = tuningMark;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitEngine(this);
    }
}
