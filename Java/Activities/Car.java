package activities;

public class Car {
    String color,transmission;
    int make,tyres,doors;

    public Car() {
        this.tyres = 4;
        this.doors=4;
    }
    public void displayCharacteristics(){
        System.out.println("color:" +color);
        System.out.println("Transmission:" +transmission);
        System.out.println("Make:" +make);
        System.out.println("Tyres:" +tyres);
        System.out.println("Doors:" +doors);
    }
    public void accelerate(){
        System.out.println("Car is moving forward");
    }
    public void brake(){
        System.out.println("Car has stopped");
    }

}
