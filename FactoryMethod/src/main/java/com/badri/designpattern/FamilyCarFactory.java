package com.badri.designpattern;

public class FamilyCarFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new FamilyCar();
    }
}
