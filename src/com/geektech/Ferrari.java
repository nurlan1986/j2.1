package com.geektech;

public class Ferrari extends Car {

    private String fromWhichCountry;


    public Ferrari(Name name, String color, int year, NumberOfDoors numberOfDoors, String fromWhichCountry) {
        super(name, color, year, numberOfDoors);
        this.fromWhichCountry = fromWhichCountry;
    }

    public String getFromWhichCountry(){
        return fromWhichCountry;
    }



    @Override
    public void makeSignal() {
        System.out.println("pip-piip");

    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("This car from " + fromWhichCountry);
    }
}
