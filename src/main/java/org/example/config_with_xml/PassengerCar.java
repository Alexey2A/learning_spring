package org.example.config_with_xml;

public class PassengerCar extends Car{
    @Override
    public void driveCare() {
        System.out.println("ездит на легковом автомобиле");
    }

    @Override
    public String toString() {
        return "PassengerCar{}";
    }
}
