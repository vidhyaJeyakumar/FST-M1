package activities;

import java.util.HashSet;
import java.util.Objects;

public class Activity10 {
    public static void main(String[]args){
        HashSet<String> hs=new HashSet<>();
        hs.add("tea");
        hs.add("coffee");
        hs.add("icetea");
        hs.add("juice");
        hs.add("soda");
        hs.add("coldcoffee");
        System.out.println("Size of hash set: "+hs.size());
        System.out.println("Remove element "+hs.remove("icetea"));
        System.out.println("Remove element "+hs.remove(""));
        System.out.println("Contains: "+hs.contains("coffee"));
        System.out.println("Updated set: "+hs);
    }
}
