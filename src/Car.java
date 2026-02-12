public class Car {
    int  noOfWheels ;     // These are Blueprint of Car and Object is Driver.java.

    String color ;

    float maxSpeed ;

    float currentFuelInLiters;

    int noOfSeats;

    public void drive(){
        System.out.println("Car is driving");
        currentFuelInLiters--;
        System.out.println("Current Fuel in Liters : " + currentFuelInLiters);
    }
    public void addFuel (float fuel){
         currentFuelInLiters = currentFuelInLiters + fuel;
        System.out.println("Current Fuel In Liters : " + currentFuelInLiters);
    }
    public float getCurrentFuel(){
        System.out.println("Car is Stop  and Fuel is " + currentFuelInLiters);
        return currentFuelInLiters;
    }
    public void speed(){
        System.out.println("Your Car Max Speed is : 150Km/h" + maxSpeed);
    }
    public void color(){
        System.out.println("Color : Black " + color );
    }
    public void seat (){
         System.out.println("4 Seats" )
    }

    }



