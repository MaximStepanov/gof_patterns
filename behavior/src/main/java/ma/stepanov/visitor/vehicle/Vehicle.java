package ma.stepanov.visitor.vehicle;

import ma.stepanov.visitor.exportvisitor.Visitor;

public abstract class Vehicle {

    public String color;
    public String tuningMark;

    public abstract void paint(String color);

    public abstract void tune(String tuningMark);

    public abstract String accept(Visitor visitor);
}
