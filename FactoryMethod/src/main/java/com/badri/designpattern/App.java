package com.badri.designpattern;

/**
 * A Client
 */
public class App {
    public String factory(String type) {
        CarFactory factory;
        if (type.contentEquals("family")) {
            factory = new FamilyCarFactory();
        } else {
            factory = new SportsCarFactory();
        }
        //Notice there is no new method to create Car object or Product
        Car car = factory.createCar();
        System.out.println(car.drive());
        return car.drive();
    }
}
