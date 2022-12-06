package ford;


import abstracts.CarFactory;
import abstracts.Motor;
import abstracts.SteeringWheel;

public class FordFactory implements CarFactory {
    @Override
    public Motor createMotor() {
        return new FordMotor();
    }

    @Override
    public SteeringWheel createSteeringWheel() {
        return new FordSteeringWheel();
    }
}
