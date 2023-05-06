package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[]args){
        Map<Integer,String> colors= new HashMap<>();
        colors.put(1,"Red");
        colors.put(2,"Blue");
        colors.put(3,"Black");
        colors.put(4,"White");
        colors.put(5,"Purple");
        System.out.println("Colors: "+colors);
        System.out.println("Removed color: "+colors.remove(2));
        System.out.println("Check color Green:"+colors.containsValue("Green"));
        System.out.println("Size of Map: "+colors.size());
    }
}
