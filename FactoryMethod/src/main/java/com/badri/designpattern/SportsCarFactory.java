package com.badri.designpattern;

public class SportsCarFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new SportsCar();
    }
}
