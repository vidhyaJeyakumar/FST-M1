package activities;

public class Bicycle implements BicycleParts,BicycleOperations{
    public int gears,currentSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
    @Override
    public void applyBrake(int decrement) {
        currentSpeed-=decrement;
        //System.out.println("Decrement:"+currentSpeed);
        System.out.println("Speed: "+currentSpeed);
    }
    @Override
    public void speedUp(int increment) {
        currentSpeed+=increment;
        //System.out.println("Increment:"+currentSpeed);
        System.out.println("Speed:"+currentSpeed); ;
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is "+currentSpeed );
        //System.out.println("Seat height:);
    }

}
