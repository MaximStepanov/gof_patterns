package ma.stepanov.visitor;

import ma.stepanov.visitor.exportvisitor.CarPassportVisitor;
import ma.stepanov.visitor.vehicle.Car;
import ma.stepanov.visitor.vehicle.Engine;
import ma.stepanov.visitor.vehicle.Wheel;

public class Demo {
    public static void main(String[] args) {
        Wheel wheel = new Wheel();
        wheel.paint("black");
        wheel.tune("TOYO");
        Engine engine = new Engine();
        engine.paint("gray");
        engine.tune("M50B25");
        Car car = new Car();
        car.paint("red");
        car.tune("Alpina");
        car.add(wheel);
        car.add(engine);

        CarPassportVisitor visitor = new CarPassportVisitor();
        System.out.println(visitor.getPassportInfo(car));
    }
}
