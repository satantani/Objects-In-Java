package com.clouway.objects.automobiles;

/**
 * Created by clouway on 10.07.17.
 */
public class Automobiles {

    private static int maxspeed;
    private static String colour;
    private static String dateOfManufacture;
    public Automobiles(int Setmaxspeed, String Setcolour, String SetDateOfManufacture){
        maxspeed = Setmaxspeed;
        colour=Setcolour;
        dateOfManufacture = SetDateOfManufacture;
    }

    public void printStates(){
                System.out.println("Max Speed : " + maxspeed  );
                System.out.println("Colour : " + colour);
                System.out.println("Date of Manufacture : " + dateOfManufacture);
                System.out.println();
            }


    public static class Opel extends Automobiles{

        public int weight;
        public int numberOfPassengers;
        public Opel(int Setmaxspeed, String Setcolour, String SetDateOfManufacture, int Setweight, int SetnumberOfPassengers){
            super(Setmaxspeed, Setcolour, SetDateOfManufacture);
                weight=Setweight;
                numberOfPassengers=SetnumberOfPassengers;
        }

        @Override
        public void printStates() {
            System.out.println("Max Speed : " + maxspeed  );
            System.out.println("Colour : " + colour);
            System.out.println("Date of Manufacture : " + dateOfManufacture);
            System.out.println("Number of Passengers : " + numberOfPassengers);
            System.out.println("Weight : " + weight);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Automobiles volkswagen = new Automobiles(200,"Red", "27.03.2006");
        System.out.println("Car : volkswagen");
        volkswagen.printStates();
        Automobiles mercedes = new Automobiles(260,"Green", "13.11.2012");
        System.out.println("Car : Mercedes");
        mercedes.printStates();
        Automobiles opel = new Opel(230, "Yellow", "04.09.2009", 1450, 4);
        System.out.println("Car : Opel");
        opel.printStates();
            }


    }
