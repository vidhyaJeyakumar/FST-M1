package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<Integer>();
        Random indexGen=new Random();
        System.out.println("Enter the numbers:");
        System.out.println("(EOF or non-integer to terminate): ");
        while (scan.hasNext()){
            list.add(scan.nextInt());
        }
        Integer num[]=list.toArray(new Integer[0]);
        int index= num.length;
        System.out.println("Length of list: "+index);
        System.out.println("Length of list: "+num[index]);
        scan.close();

    }
}
