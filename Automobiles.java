package com.clouway.objects.automobiles;

/**
 * Created by clouway on 10.07.17.
 */
public class Automobiles {
    static int maxspeed;
    static String colour;
    static String dateOfManufacture;
    static int weight;
    static int numberOfPassangers;
    void setMaxspeed (int newValue){
        maxspeed = newValue;
    }
    void setColour (String newColour){
        colour = newColour;
    }
    void setDateOfManufacture (String DOM){
        dateOfManufacture = DOM;
    }
    void setNumberOfPassangers(int newValue){
        numberOfPassangers = newValue;
    }
    void setWeight(int newValue){
        weight=newValue;
    }
    void PrintStates(){
        System.out.println("Max Speed : " + maxspeed  );
        System.out.println("Colour : " + colour);
        System.out.println("Date of Manufacture : " + dateOfManufacture);
        System.out.println("Number of Passengers : " + numberOfPassangers);
        System.out.println("Weight : " + weight);
        System.out.println();
    }
    public static void main(String[] args) {
        Automobiles VW = new Automobiles();
        Automobiles Mercedes = new Automobiles();
        Automobiles Opel = new Automobiles();
        VW.setMaxspeed(200);
        VW.setColour("Red");
        VW.setDateOfManufacture("14.03.2006");
        System.out.println("Car : Volkswagen " );
        VW.PrintStates();
        Mercedes.setMaxspeed(260);
        Mercedes.setColour("Green");
        Mercedes.setDateOfManufacture("27.07.2012");
        System.out.println("Car : Mercedes " );
        Mercedes.PrintStates();
        Opel.setMaxspeed(230);
        Opel.setColour("Dark Mat");
        Opel.setDateOfManufacture("03.09.2009");
        Opel.setNumberOfPassangers(4);
        Opel.setWeight(1350);
        System.out.println("Car : Opel " );
        Opel.PrintStates();
    }
}
