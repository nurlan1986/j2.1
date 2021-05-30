package com.geektech;

public class Car {

    private String color;
    private int year;
    private NumberOfDoors numberOfDoors;
    private Name name;
    private boolean theLamp;
    public final int KM = 100;

    public Car(Name name, String color, int year, NumberOfDoors numberOfDoors) {
        this.color = color;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
        this.name = name;
    }


    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public NumberOfDoors getNumberOfDoors() {
        return numberOfDoors;
    }


    public Name getName() {
        return name;
    }


    public void onLight() {
        theLamp = true;
        System.out.println("Is the lamp on ? " + theLamp);
    }

    public void ofLight() {
        theLamp = false;
        System.out.println("Is the lamp on ? " + theLamp);
    }


    public void makeSignal() {

    }

    public void fuelConsumption(double fuel, double coveredDistance) {
        double fuelConsumption = fuel / coveredDistance * KM;
        System.out.println("Fuel consumption = " + fuelConsumption + " l/fuel for 100 km");
    }

    public void fuelConsumption(double KM, double fuel, double coveredDistance){
        double fuelConsumption = fuel / coveredDistance * KM;
        System.out.println("Fuel consumption = " + fuelConsumption + " l/fuel for 100 km");
    }

    public void fuelConsumption(int KM, double fuel, double coveredDistance){
        double fuelConsumption = fuel/coveredDistance * KM;
        System.out.println("Fuel consumption = " + fuelConsumption + " l/fuel for 100 km");
    }


    public void getInfo() {
        System.out.println("Name = " + getName() + "\nColor = " + color + "\nYear = " + year + "\nNumber of doors = "
                + numberOfDoors.getNumberOfDoors());
    }


}
