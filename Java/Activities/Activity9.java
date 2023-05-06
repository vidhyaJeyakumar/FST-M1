package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[]args){
        ArrayList <String> myList= new ArrayList<>();
        myList.add("apple");
        myList.add("orange");
        myList.add("grapes");
        myList.add("banana");
        myList.add("cherry");
        for (String list:myList){
            System.out.println("List of names:"+list);

        }
        System.out.println("Third name: "+myList.get(3));
        System.out.println("Contains: "+myList.contains("orange"));
        System.out.println("Size of array: "+myList.size());
        myList.remove(3);
        System.out.println("Size of array after remove: "+myList.size());
    }
}
