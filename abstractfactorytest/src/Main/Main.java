package Main;

import abstracts.Car;
import ford.Ford;
import ford.FordFactory;
import ford.FordMotor;
import ford.FordSteeringWheel;
import mercedes.Mercedes;
import mercedes.MercedesFactory;
import mercedes.MercedesMotor;
import mercedes.MercedesSteeringWheel;

public class Main {
    public static void main(String[] args) {
        FordFactory fordFactory = new FordFactory();
        Ford ford = new Ford((FordMotor) fordFactory.createMotor(), (FordSteeringWheel) fordFactory.createSteeringWheel());

        MercedesFactory mercedesFactory = new MercedesFactory();
        Mercedes mercedes = new Mercedes((MercedesMotor) mercedesFactory.createMotor(), (MercedesSteeringWheel) mercedesFactory.createSteeringWheel());

        Car[] cars = {ford, mercedes};

        for (Car car: cars) {
            car.drive();
        }
    }
}
