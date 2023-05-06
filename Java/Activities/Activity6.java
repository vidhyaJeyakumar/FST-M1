package activities;

public class Activity6 {
    public static  void main(String[]args){
        Plane plane= new Plane(10);
        plane.onboard("fef");
        System.out.println("Time took off"+plane.takeOff());
        System.out.println("Land"+plane.land());
        System.out.println("List of passengers:"+plane.getPassengers());
        System.out.println("Time landed: "+plane.getLastTimeLanded());
    }
}
