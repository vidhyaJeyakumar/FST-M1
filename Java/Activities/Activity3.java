package activities;

public class Activity3 {
    public static void main(String[]args){
        double seconds=1000000000;
        double earth=31557600;
        double mercury= 0.2408467;
        double venus= 0.61519726;
        double mars= 1.8808158;
        double jupiter= 11.862615;
        double saturn= 29.447498;
        double uranus= 84.016846;
        double neptune= 164.79132;
        System.out.println("Age of earth: %.2f"+seconds/earth);
        System.out.println("Age of mercury: "+seconds/earth/mercury);
        System.out.println("Age of venus: "+seconds/earth/venus);
        System.out.println("Age of jupiter: "+seconds/earth/jupiter);
        System.out.println("Age of mars: "+seconds/earth/mars);
        System.out.println("Age of saturn: "+seconds/earth/saturn);
        System.out.println("Age of uranus: "+seconds/earth/uranus);
        System.out.println("Age of neptune: "+seconds/earth/neptune);

    }
}
