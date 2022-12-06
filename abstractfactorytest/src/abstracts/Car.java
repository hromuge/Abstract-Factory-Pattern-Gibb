package abstracts;

public abstract class Car {
    Motor motor;
    SteeringWheel steeringWheel;

    public Car(Motor motor, SteeringWheel steeringWheel) {
        this.motor = motor;
        this.steeringWheel = steeringWheel;
    }

    public void drive() {
        System.out.println("brumm");
    }
}
