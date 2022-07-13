package ma.stepanov.visitor.exportvisitor;

import ma.stepanov.visitor.vehicle.Car;
import ma.stepanov.visitor.vehicle.Engine;
import ma.stepanov.visitor.vehicle.Vehicle;
import ma.stepanov.visitor.vehicle.Wheel;

public class CarPassportVisitor implements Visitor {

    public String getPassportInfo(Vehicle... args) {
        StringBuilder sb = new StringBuilder();
        for (Vehicle detail : args) {
            sb.append(detail.accept(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitWheel(Wheel wheel) {
        return "Wheel characteristics: \n" +
                "color : " + wheel.color + "\n" +
                "tuning : " + wheel.tuningMark + "\n";
    }

    @Override
    public String visitEngine(Engine engine) {
        return "Engine characteristics: \n" +
                "color : " + engine.color + "\n" +
                "tuning : " + engine.tuningMark + "\n";
    }

    @Override
    public String visitCar(Car car) {
        return "Car characteristics: \n" +
                "color : " + car.color + "\n" +
                "tuning : " + car.tuningMark + "\n" +
                getCarDetailsChars(car) + "\n";
    }

    private String getCarDetailsChars(Car car) {
        StringBuilder sb = new StringBuilder();
        sb.append("children : \n");
        for (Vehicle detail : car.details) {
            String d = detail.accept(this);
            d = "    " + d.replace("\n", "\n    ") + "\n";
            sb.append(d);
        }
        return sb.toString();
    }
}
