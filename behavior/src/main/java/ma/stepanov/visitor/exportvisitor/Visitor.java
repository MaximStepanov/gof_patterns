package ma.stepanov.visitor.exportvisitor;

import ma.stepanov.visitor.vehicle.Car;
import ma.stepanov.visitor.vehicle.Engine;
import ma.stepanov.visitor.vehicle.Wheel;

public interface Visitor {

    String visitWheel(Wheel wheel);

    String visitEngine(Engine engine);

    String visitCar(Car car);
}
