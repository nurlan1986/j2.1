package com.geektech;

public final class FerrariF40 extends Ferrari{

    private double engineCapacity;

    public FerrariF40(Name name, String color, int year, NumberOfDoors numberOfDoors, String whichCountryfrom, double engineCapacity) {
        super(name,color, year, numberOfDoors, whichCountryfrom);
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity(){
        return engineCapacity;
    }

    @Override
    public void makeSignal() {
        System.out.println("paap-paap");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Engine capasity is: " + engineCapacity);
    }
}
