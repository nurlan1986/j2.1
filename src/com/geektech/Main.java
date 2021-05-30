package com.geektech;

public class Main {

    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari(Name.FERRARI, "White", 1990, new NumberOfDoors(4),"Italy");
        ferrari.getInfo();
        ferrari.makeSignal();
        ferrari.onLight();
        ferrari.fuelConsumption(20.4, 40);

        System.out.println("-----------------------------------------");

        FerrariF40 ferrariF40 = new FerrariF40(Name.FERRARIF40, "Black", 1992, new NumberOfDoors(2), "Italy",3.5);
        ferrariF40.getInfo();
        ferrariF40.makeSignal();
        ferrariF40.ofLight();
        ferrariF40.fuelConsumption(ferrariF40.KM, 25,38.7);

        System.out.println("-----------------------------------------");

        FerrariF40 ferrariF401 = new FerrariF40(Name.FERRARIF401, "Red", 2005, new NumberOfDoors(5),"Italy", 2.8);
        ferrariF401.getInfo();
        ferrariF401.makeSignal();
        ferrariF401.onLight();
        ferrariF401.fuelConsumption(100,45,36);



    }

}
