package activities;

public class Activity1 {
    public static void main(String[] args){
        Car swift= new Car();
        //initializing
        swift.make=2012;
        swift.color="Black";
        swift.transmission="manual";
        //calling methods
        swift.displayCharacteristics();
        swift.accelerate();
        swift.brake();

    }

}
