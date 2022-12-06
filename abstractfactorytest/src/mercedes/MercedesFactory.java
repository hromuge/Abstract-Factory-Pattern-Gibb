package mercedes;

import abstracts.CarFactory;
import abstracts.Motor;
import abstracts.SteeringWheel;

public class MercedesFactory implements CarFactory {
    @Override
    public Motor createMotor() {
        return new MercedesMotor();
    }

    @Override
    public SteeringWheel createSteeringWheel() {
        return new MercedesSteeringWheel();
    }
}
