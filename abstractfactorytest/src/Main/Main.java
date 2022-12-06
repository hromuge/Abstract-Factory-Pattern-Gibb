package Main;

import ford.FordFactory;
import ford.FordMotor;
import ford.FordSteeringWheel;
import mercedes.MercedesFactory;
import mercedes.MercedesMotor;
import mercedes.MercedesSteeringWheel;

public class Main {
    public static void main(String[] args) {
        FordFactory fordFactory = new FordFactory();
        FordMotor fordMotor = (FordMotor) fordFactory.createMotor();
        FordSteeringWheel fordSteeringWheel = (FordSteeringWheel) fordFactory.createSteeringWheel();

        MercedesFactory mercedesFactory = new MercedesFactory();
        MercedesMotor mercedesMotor = (MercedesMotor) mercedesFactory.createMotor();
        MercedesSteeringWheel mercedesSteeringWheel = (MercedesSteeringWheel) mercedesFactory.createSteeringWheel();
    }
}
