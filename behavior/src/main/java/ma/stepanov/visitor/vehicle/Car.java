package ma.stepanov.visitor.vehicle;

import ma.stepanov.visitor.exportvisitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {

    public List<Vehicle> details = new ArrayList<>();

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
        return visitor.visitCar(this);
    }

    public void add(Vehicle vehicle) {
        details.add(vehicle);
    }
}
