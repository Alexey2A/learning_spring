package org.example.config_with_xml;

public class Minivan extends Car {
    @Override
    public void driveCare() {
        System.out.println("ездит на минивэне");
    }



    @Override
    public String toString() {
        return "Minivan{}";
    }
}
